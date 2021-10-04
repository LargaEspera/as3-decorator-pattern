package com.company;

public class StandardDoner implements IDoner{

    @Override
    public String getDescription() {
        return "Standard Doner with ketchune and free. ";
    }

    @Override
    public int getPrice() {
        return 1000;
    }
}
