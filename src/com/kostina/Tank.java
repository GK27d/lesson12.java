package com.kostina;

public class Tank extends MoveableUnit {
    public Tank(int x, int y) {
        super(x, y);
    }
    public void reload(){
        System.out.println("Reloading...");
    }
}
