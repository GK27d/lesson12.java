package com.kostina;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Unit> units = new ArrayList<>();
        units.add(new Fence(1, 1));
        units.add(new Tower(2, 1));
        Soldier soldier = new Soldier(5, 6);
        units.add(soldier);

        soldier.move('a');
        soldier.move('s');

        Tank tank = new Tank(5, 6);
        units.add(tank);

        tank.move('w');
        tank.move('d');

        for (Unit unit : units) {
            System.out.println(unit);
        }
    }
}
