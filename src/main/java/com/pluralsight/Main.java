package com.pluralsight;

public class Main {
    public static void main(String[] args)  throws InterruptedException {

       WhileLoop w1 = new WhileLoop();
       w1.whileLoop();

       System.out.println();

       DoWhileLoop d1 = new DoWhileLoop();
       d1.doWhileLoop();

       System.out.println();

       ForLoop f1 = new ForLoop();
       f1.forLoop();
    }
}