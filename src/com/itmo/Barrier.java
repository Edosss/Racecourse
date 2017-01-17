package com.itmo;


import static java.lang.Thread.currentThread;


public class Barrier  {

   private int count;




    public int getCount() {
        return count;
    }

    public Barrier(int count) {
        this.count = count;

    }



    public synchronized void ready() {

        while (count > 1) {
            count--;
            System.out.println("Wait..." + currentThread().getName());


            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

       {
            notifyAll();
            System.out.println("GO!" + currentThread().getName());
        }
    }

  }









