package com.mycompany.bakery;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DeliveryGirl implements BreadReadyListener{

	private final BlockingQueue<Client> clients = new LinkedBlockingQueue<>();
	private final String name;

	/**
	 * 
	 * @param name
	 */
	public DeliveryGirl(String name) {
             this.name = name;
	}

	/**
	 * 
	 * @param client
	 */
	public void registerClient(Client client) {
            if (client != null) {
                clients.add(client);
            }
	}

	public boolean hasClients() {
            return !clients.isEmpty();
	}

	/**
	 * 
	 * @param bread
	 */
        @Override
	public void onBreadReady(Bread bread) {
            deliver(bread);
	}

	/**
	 * 
	 * @param bread
	 */
	public void deliver(Bread bread) {
            Client next = clients.poll();
            if (next == null) {
                System.out.println("[Delivery] " + name + ": No clients waiting. " + bread + " will be donated.");
                return;
            }
            next.receiveBread(name);
	}

	public String getName() {
		return this.name;
	}

}