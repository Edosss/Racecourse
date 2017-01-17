package com.itmo;


public class Horse  extends Thread {

    private final Barrier barrier;

    public Horse(Barrier barrier) {
        this.barrier = barrier;
    }



    @Override
    public void run() {
       barrier.ready();
        }
    }











