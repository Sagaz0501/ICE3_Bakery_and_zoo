/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sheridanzoo;

/**
 *
 * @author adamo
 */
public class TestZoo {
    public static void main(String[]args){
        SheridanZoo zoo = new SheridanZoo("""
                                          Sheridan College Royal Metropolitan Zoo\r
                                          125 Park Avenue\rBrampton, ON\r
                                          M1M 1M1\r
                                          (905) 555-1234""");

        ZooKeeper anand = new ZooKeeper("Anand");
        ZooKeeper bobby = new ZooKeeper("Bobby");

        zoo.addZooKeeper(anand);
        zoo.addZooKeeper(bobby);


        Animal leo = new Animal("Leo", "lion", "water buffalo", "12");
        Animal tony = new Animal("Tony", "tiger", "white tail deer", "7");
        Animal babu = new Animal("Babu", "bear", "berries and honey", "10");

        Animal deepak = new Animal("Deepak", "deer", "fresh grass", "4");
        Animal harry = new Animal("Harry", "hare", "carrots", "2");
        Animal cowan = new Animal("Cowan", "cow", "crunchy corn", "9");


        anand.addAnimal(leo);
        anand.addAnimal(tony);
        anand.addAnimal(babu);

        bobby.addAnimal(deepak);
        bobby.addAnimal(harry);
        bobby.addAnimal(cowan);

        zoo.about();
    }
}
