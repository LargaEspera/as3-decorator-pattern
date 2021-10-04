package com.company;

public class CheeseDecorator extends DonerDecorator {

    public CheeseDecorator(IDoner doner) {
        super(doner);
    }

    public String addingCheese(){
        return "+ Cheese. ";
    }

    public int addingCheesePrice(){
        return 100;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + addingCheese();
    }

    @Override
    public int getPrice(){
        return super.getPrice() + addingCheesePrice();
    }
}
