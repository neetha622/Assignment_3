//What is abstraction in java, how many ways can we implement abstraction, write proper java program and how to implement abstraction.
Abstraction in Java is a concept that allows you to hide the complex implementation details and show only the necessary features of an object. 
There are two main ways to implement abstraction in Java:
.Abstract Classes:
An abstract class is a class that cannot be instantiated and may contain one or more abstract methods.
Abstract methods are declared without implementation.
.Interfaces:
An interface is a reference type in Java that contains only abstract methods and constants.
Interfaces cannot have method implementations.
.Here is an example:

abstract class Vehicle {
    
    public abstract void start();

    
    public abstract void stop();

    
    public void displayInfo() {
        System.out.println("Vehicle information:");
    }
}


class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
}


interface MusicalInstrument {
    void playSound();
}


class Guitar implements MusicalInstrument {
    @Override
    public void playSound() {
        System.out.println("Guitar playing...");
    }
}


class Piano implements MusicalInstrument {
    @Override
    public void playSound() {
        System.out.println("Piano playing...");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Vehicle car = new Car();
        car.displayInfo();
        car.start();
        car.stop();

        
        MusicalInstrument guitar = new Guitar();
        guitar.playSound();

        MusicalInstrument piano = new Piano();
        piano.playSound();
    }
}
Vehicle is an abstract class representing a generic vehicle with abstract methods for starting and stopping.
Car is a concrete class extending the Vehicle abstract class and implementing its abstract methods.
MusicalInstrument is an interface representing an entity that can play sound.
Guitar and Piano are concrete classes implementing the MusicalInstrument interface and providing their specific implementations for the playSound() method.

        
