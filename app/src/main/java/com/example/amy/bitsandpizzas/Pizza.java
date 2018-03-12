package com.example.amy.bitsandpizzas;

/**
 *  Created by John on 3/12/2018 at 1:49 PM.
 */

public class Pizza {
    private String name;
    private int imageResourceId;

    static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.diavolo),
            new Pizza("Funghi", R.drawable.funghi)
    };

    private Pizza(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    int getImageResourceId() {
        return imageResourceId;
    }
}