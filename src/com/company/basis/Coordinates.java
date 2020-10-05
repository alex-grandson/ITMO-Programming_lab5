package com.company.basis;

import java.io.Serializable;

public class Coordinates implements Serializable {
    private Long x; //Максимальное значение поля: 270, Поле не может быть null
    private int y; //Значение поля должно быть больше -510
    public Coordinates(Long x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinates() {
    }

    public Long getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {

        return "[x=" + this.getX() + ", y=" + this.getY() + "]";
    }
}
