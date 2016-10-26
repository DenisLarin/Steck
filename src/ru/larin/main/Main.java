package ru.larin.main;

import ru.larin.steck.Steck;

/**
 * Created by mrden on 26.10.2016.
 */
public class Main {
    private static Steck<Person> steck;

    public static void main(String[] args) {
        steck = new Steck<Person>();
        Person person = new Person("Денис",19);
        Person person1 = new Person("Антон",17);
        steck.push(person);
        steck.push(person1);
        while (steck.size()!=0){
            System.out.println(steck.pop().toString());
        }
    }
}
