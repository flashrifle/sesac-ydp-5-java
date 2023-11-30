package _05_class._inheritance.Ex;

public class Cat extends Animal {
    public Cat(String species, String name, int age) {
        super();
        this.species = "고양이";
        this.name = name;
        this.age = age;
    }

    public Cat() {}

    @Override
    void makeSound(){
        System.out.println("야용");
    }
}
