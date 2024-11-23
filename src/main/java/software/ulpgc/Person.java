package software.ulpgc;

import java.time.LocalDate;
import java.util.StringJoiner;

public class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public short getAge() {
        return (short) (LocalDate.now().getYear() - birthDate.getYear());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("birthDate=" + birthDate)
                .add("age=" + getAge())
                .toString();
    }
}
