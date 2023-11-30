package _05_class._inheritance.Ex;

public class AnimalEx {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog("셰퍼드", "블랙", 2);

        cat.makeSound();
        dog.makeSound();

        dog.bite();

    }
}
