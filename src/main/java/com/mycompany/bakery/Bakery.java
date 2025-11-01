 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bakery;
import java.util.Random;

/**
 *
 * @author sanbe
 */
public class Bakery implements Runnable{

    private final String name;
    private final Random random = new Random();
    private volatile boolean open = false;

    // Referencia a quien se notifica cuando el pan está listo
    private BreadReadyListener listener;

    private int loavesToBake = 0;
    private Thread worker;
    
    public Bakery(String name) {
	this.name = name;
    }

    /**
    * 
    * @param listener
    */
    public void registerGirl(BreadReadyListener listener) {
        this.listener = listener;
    }

    /**
    * 
    * @param loaves
    */
    public void startBaking(int loaves) {
        if (listener == null) {
        throw new IllegalStateException("No delivery girl registered!");
        }
        if (loaves <= 0) {
            throw new IllegalArgumentException("loaves must be > 0");
        }
        this.loavesToBake = loaves;
        this.open = true;
        this.worker = new Thread(this, name + "-BakerThread");
        worker.start();

    }
    
    @Override
    public void run() {
        bakeLoop(loavesToBake);
        close();
    }

	/**
	 * 
	 * @param loaves
	 */
    private void bakeLoop(int loaves) {
        for (int i = 1; i <= loaves && open; i++) {
            try {
                // 1 a 10 segundos aleatorios
                int delayMs = 1000 + random.nextInt(9000);
                Thread.sleep(delayMs);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
                break;
            }
            Bread bread = new Bread(i);
            System.out.println("[Bakery] " + name + " baked " + bread);
            listener.onBreadReady(bread);
        }
    }

    public void close() {
        open = false;
        System.out.println("[Bakery] " + name + " is closing for today.");
    }

    public void joinQuietly() {
        if (worker != null) {
            try { worker.join(); } catch (InterruptedException ignored) {}
        }
    }

    public String getName() {
        return name;
    }

}
