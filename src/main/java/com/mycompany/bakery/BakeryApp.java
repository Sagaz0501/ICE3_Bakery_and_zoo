/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bakery;

/**
 *
 * @author sanbe
 */
public class BakeryApp {
    public static void main(String[] args) {
        Bakery bakery = new Bakery("Sunrise Bakery");
        DeliveryGirl girl = new DeliveryGirl("Mia");

        // Registrar clientes (orden de atención = orden de registro)
        girl.registerClient(new Client("Donald"));
        girl.registerClient(new Client("Alice"));
        girl.registerClient(new Client("Bob"));
        girl.registerClient(new Client("Carla"));
        girl.registerClient(new Client("Ethan"));

        // La bakery registra a la niña
        bakery.registerGirl(girl);

        // Hornear N panes (uno por cliente)
        int loaves = 5;
        bakery.startBaking(loaves);

        // Esperar a que termine la jornada
        bakery.joinQuietly();

        // Verificar
        if (girl.hasClients()) {
            System.out.println("[Delivery] Some clients did not receive bread today.");
        } else {
            System.out.println("[Delivery] All registered clients were served. ✅");
        }
    }
}
