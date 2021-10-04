package com.company;

public class JalapenoDecorator extends DonerDecorator {

    public JalapenoDecorator(IDoner doner) {
        super(doner);
    }

    public String addingJalapeno(){
        return "+ Jalapeno. ";
    }

    public int addingJalapenoPrice(){
        return 150;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + addingJalapeno();
    }

    @Override
    public int getPrice(){
        return super.getPrice() + addingJalapenoPrice();
    }
}
