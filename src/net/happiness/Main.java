package net.happiness;

public class Main {

    public static void main(String[] args) {
        Person person = new DefaultPerson.Builder("James", "Bond")
                .age(45)
                .phone("007")
                .address("London")
                .build();
        System.out.println(person);
    }

}
