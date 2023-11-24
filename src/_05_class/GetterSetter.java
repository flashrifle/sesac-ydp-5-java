package _05_class;

public class GetterSetter {

    private String name;
    private String animal;

    public GetterSetter (String name, String animal) {
        this.name = name;
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "GetterSetter{" +
                "name='" + name + '\'' +
                ", animal='" + animal + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}
