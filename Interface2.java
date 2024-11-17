interface Vehicle {
    void changegear(int a);

    void speedup(int a);

    void applybrake(int a);

}

class Bicycle implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changegear(int newgear) {
        gear = newgear;
    }

    @Override
    public void speedup(int increase) {
        speed = speed + increase;
    }

    @Override
    public void applybrake(int decrease) {
        speed = speed - decrease;
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }

}

class Car implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changegear(int newgear) {
        gear = newgear;
    }

    @Override
    public void speedup(int increase) {
        speed = speed + increase;
    }

    @Override
    public void applybrake(int decrease) {
        speed = speed - decrease;
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}

class Interface2 {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.changegear(1);
        b.speedup(4);
        b.applybrake(1);
        System.out.println("Current state of bicycle is");
        b.printStates();

        Car c = new Car();
        c.changegear(1);
        c.speedup(4);
        c.applybrake(1);
        System.out.println("Current state of car is");
        c.printStates();
    }
}