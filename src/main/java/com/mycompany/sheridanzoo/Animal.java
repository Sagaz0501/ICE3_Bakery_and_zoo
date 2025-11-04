/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sheridanzoo;

/**
 *
 * @author adamo
 */
public class Animal {
    private String name;
    private String age;
    private String species;
    private String diet;

    Animal(String name, String species, String diet, String age) {
        this.name = name;
        this.species = species;
        this.diet = diet;
        this.age = age;
    }

    public void about(){
        System.out.println(".  " + name + ": I am a " + age + " years old "+ species + " and I love " + diet);
        }
    }
