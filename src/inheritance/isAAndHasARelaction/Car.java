package inheritance.isAAndHasARelaction;

// Car class has-a Engine
class Car {
    private Engine engine; // HAS-A relationship

    Car() {
        engine = new Engine(); // Composition: Engine is part of Car
    }

    void startCar() {
        engine.start(); // Delegating start to Engine
        System.out.println("Car is ready to go!");
    }
}
