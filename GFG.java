import java.io.*;

interface Vehicle {

    //all are the abstract methods.

    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle {
    int speed;
    int gear;

    //to change gear
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    //to increase speed
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    //to decrease speed
    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + gear);
    }
}

class Bike implements Vehicle
{
    int speed;
    int gear;

    //to change gear
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    //to increase speed
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    //to decrease speed
    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + gear);
    }
}

class GFG {
    public static void main(String[] args) {

        //creating an instance of Bicycle

        Bicycle bi = new Bicycle();

        bi.changeGear(2);
        bi.speedUp(3);
        bi.applyBrakes(1);

        System.out.println("Bicycle present state : ");

        bi.printStates();

        //creating instance of the bike.

        Bike bike = new Bike();
        bike.changeGear(3);
        bike.speedUp(40);
        bike.applyBrakes(2);

        System.out.println("Bike present state : ");
        bike.printStates();
    }
}

