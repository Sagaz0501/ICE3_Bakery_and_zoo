/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sheridanzoo;

/**
 *
 * @author adamo
 */
import java.util.ArrayList;

public class ZooKeeper{
    private String name;
    private ArrayList<Animal> animals = new ArrayList<>();

    ZooKeeper(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }
        
    
    public void about(){
        System.out.println(name);
        for(Animal animal : animals) {
            animal.about();
        }
    }

}