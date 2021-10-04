package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("");
        IDoner standardDoner = new StandardDoner();
        System.out.println(standardDoner.getDescription() + standardDoner.getPrice());
        System.out.println("");

        IDoner classicDoner = new ClassicDoner();
        System.out.println(classicDoner.getDescription() + classicDoner.getPrice());
        System.out.println("");

        IDoner standardDonerWithCheese = new CheeseDecorator(new StandardDoner());
        System.out.println(standardDonerWithCheese.getDescription() + standardDonerWithCheese.getPrice());
        System.out.println("");

        IDoner classicDonerWithCheeseAndWithJalapeno = new CheeseDecorator(new JalapenoDecorator(new ClassicDoner()));
        System.out.println(classicDonerWithCheeseAndWithJalapeno.getDescription() + classicDonerWithCheeseAndWithJalapeno.getPrice());
    }
}
