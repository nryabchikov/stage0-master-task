package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        StringBuilder str = new StringBuilder(String.format("This animal is mostly %s. It has %d ", color, numberOfPaws));
        if (numberOfPaws == 1) {
            str.append("paw ");
        } else {
            str.append("paws ");
        }
        str.append("and ");
        if (hasFur) {
            str.append("a ");
        } else {
            str.append("no ");
        }
        str.append("fur.");
        return str.toString();
    }
}
