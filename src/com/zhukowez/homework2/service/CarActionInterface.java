package com.zhukowez.homework2.service;

public interface CarActionInterface {

    String CAR_ACTION_RUN = "Started and ready to go";

    //CAR_ACTION_MOVE - this minimum distance the car has drive since the move method
    int CAR_ACTION_MOVE = 1;

    void run();

    int move();
}
