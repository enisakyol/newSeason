package com.cydeo;

public class Main {
    public static void main(String[] args) {
        Currency c = Currency.PENNY;
        System.out.println(c);

        Currency[] currencies = Currency.values();

        for (Currency currency : currencies){
            System.out.println(currency);
        }

        switch (Currency.PENNY){
            case PENNY:
                System.out.println("It's 1 cent");
                break;
            case NICKLE:
                System.out.println("It's 5 cents");
                break;
            case DIME:
                System.out.println("It's 10 cents");
                break;
            case QUARTER:
                System.out.println("It's 25 cents");
                break;
        }
        System.out.println("calculations");
        calculate(8,2,Operations.DIVIDE);
    }

    private static void calculate(double x, double y, Operations operations){
        switch (operations){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;

        }
    }

}
