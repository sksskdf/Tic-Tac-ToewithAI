import javax.crypto.Mac;

class Vehicle {

    protected String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate=" + licensePlate + '}';
    }
}

class Car extends Vehicle {

    protected int numberOfSeats;

    public Car(String licensePlate, int numberOfSeats) {
        super(licensePlate);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate=" + licensePlate +
                ",numberOfSeats=" + numberOfSeats +
                '}';
    }
}

abstract class Pet {
    String name;
    int age;

    Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void say();

    void say3() {
        System.out.println("Pet");
    }
}

class Cat extends Pet {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    void say() {
        System.out.println("meow");
    }

    void say2() {
        System.out.println("meow meow");
    }
}

class PetMain {
    public static void main(String[] args) {
        Cat cat = new Cat("cat",3);
        System.out.println(cat);
        cat.say();
        cat.say2();

        Pet cat2 = new Cat("cat",3);
        System.out.println(cat);
        cat2.say();
        cat2.say3();
    }
}

interface Machine {
    void run();
}

class CoffeeMachine implements Machine {
    @Override
    public void run() {
        System.out.println("Coffee");
    }

    public void stop() {
        System.out.println("Stop");
    }
}

class MachineMain {
    public static void main(String[] args) {
        Machine coffeeMachine = new CoffeeMachine();
        coffeeMachine.run();
    }
}