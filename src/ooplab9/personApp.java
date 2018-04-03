package ooplab9;

import jdk.nashorn.internal.scripts.JO;

public class personApp {

    public static void main(String[] args) {
        Person person = new Person("Puriwat Lertkrai", 32,
                new Address("109", "Nakhornsithammarat",
                        "80110"),
                new Job("Teacher", 20000));
        System.out.println(person.toString());

        //edit data of object
        person.getJob().setSalary(30000);
        System.out.println(person.getJob().getPosition());
        System.out.println(person.getJob().getSalary());








    }
}