package ooplab8;

public abstract class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void makeNoise();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



}
