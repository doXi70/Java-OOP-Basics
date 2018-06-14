package p01_DefineClassPerson;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Class person = Person.class;
        Field[] fields = person.getDeclaredFields();

        Person person1 = new Person("Pesho", 20);
        Person person2 = new Person("Gosho", 18);
        Person person3 = new Person("Stamat", 43);


        System.out.println(fields.length);
    }
}