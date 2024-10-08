package com.pluralsight;

public class ForLoop {

    public void forLoop() throws InterruptedException {

        int countDown;
        for (countDown = 10; countDown > 0; countDown--){
            Thread.sleep(1000);
            System.out.println(countDown);
            if(countDown == 1){
                System.out.println("Launch!");
            }
        }
    }

}
