package com.company;

public class ClassicDoner implements IDoner{
    @Override
    public String getDescription() {
        return "Classic Doner with special sauce and crisps. ";
    }

    @Override
    public int getPrice() {
        return 1050;
    }
}
