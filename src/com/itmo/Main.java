package com.itmo;

import java.util.ArrayList;
import java.util.List;



public class Main {

    public  static void main(String[] args) throws InterruptedException {

            Barrier barrier = new Barrier(5);
            List<Horse> horse = new ArrayList<>();

            for (int i = 0; i < barrier.getCount(); i++) {

                horse.add(new Horse(barrier));
            }

            for (Horse thread : horse) {
                thread.start();
                Thread.sleep(300);
            }


        }

 }










