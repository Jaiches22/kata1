package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person pepe = new Person("pepe", LocalDate.of(1993, 1, 1));
        System.out.println(pepe);
    }
}