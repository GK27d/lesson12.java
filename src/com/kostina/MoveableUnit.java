package com.kostina;

import java.awt.event.*;

public class MoveableUnit extends Unit {
    public MoveableUnit(int x, int y) {
        super(x, y);
    }

    public void move(char key) {
        switch (key) {
            case ('a'):
                x--;
                break;
            case ('d'):
                x++;
                break;
            case ('w'):
                y++;
                break;
            case ('s'):
                y--;
                break;
            default:
                System.out.println("Ошибка! Нажата неверная клавиша.");
        }
    }

    public void fire() {
        System.out.println("Fire!!!");
    }
}
