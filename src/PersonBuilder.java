import java.util.OptionalInt;

public class PersonBuilder {
    private String name;
    private String surname;
    private OptionalInt age;
    private String city;
    private Person person = new Person();

    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        person.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("возраст не может быть меньше '0'!");
        }
        person.age = OptionalInt.of(age);
        return this;
    }

    public PersonBuilder setAddress(String city) {
        person.city = city;
        return this;
    }

    public Person build() throws IllegalArgumentException {
        if (person.name == null) {
            throw new IllegalArgumentException("имя должно быть указано!");
        }
        if (person.surname == null) {
            throw new IllegalArgumentException("фамилия должна быть указана!");
        }
        return person;
    }
}
