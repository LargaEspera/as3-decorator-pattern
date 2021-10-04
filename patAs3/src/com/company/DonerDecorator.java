package com.company;

public class DonerDecorator implements IDoner{

    private IDoner doner;

    public DonerDecorator(IDoner doner){
        this.doner = doner;
    }

    @Override
    public String getDescription() {
        return doner.getDescription();
    }

    @Override
    public int getPrice() {
        return doner.getPrice();
    }
}
