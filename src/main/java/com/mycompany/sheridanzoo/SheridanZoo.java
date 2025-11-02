/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sheridanzoo;

/**
 *
 * @author adamo
 */
import java.util.ArrayList;

public class SheridanZoo {
    private String name;
    private ArrayList<ZooKeeper> keepers = new ArrayList<>();

    SheridanZoo(String name) {
        this.name = name;
        this.keepers = new ArrayList<>();
    }

    public void addZooKeeper(ZooKeeper keeper) {
        this.keepers.add(keeper);
    }
    
    
    public void about() {
        System.out.println(name);
        System.out.println("These are our 2 zookeepers and the animals they care for: ");
            for(ZooKeeper keeper : keepers ){
                keeper.about();
            }
    }
}