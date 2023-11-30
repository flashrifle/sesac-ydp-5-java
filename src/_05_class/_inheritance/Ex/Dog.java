package _05_class._inheritance.Ex;

public class Dog extends Animal {

    public Dog() {}

    public Dog(String species, String name, int age) {
        super();
        this.species = "강아지";
        this.name = name;
        this.age = age;
    }

    void bite() {
        System.out.println(getName() + "이 물기를 해요.");
    }

    @Override
    void makeSound() {
        System.out.println("멍멍");
    }

}
