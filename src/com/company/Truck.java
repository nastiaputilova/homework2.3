package com.company;

public class Truck extends Car implements ServiceStationInterface{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

        @Override
        public void check() {
            super.check();
            checkTrailer();

    }
}
