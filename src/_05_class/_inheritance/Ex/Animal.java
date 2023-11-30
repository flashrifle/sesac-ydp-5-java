package _05_class._inheritance.Ex;

public class Animal {
    public String species;
    public String name;
    public int age;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void makeSound() {
        System.out.println("동물은 소리를 낸다.");
    }
}
