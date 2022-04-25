import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected String name;
    protected String surname;
    protected OptionalInt age;
    protected String city;

    public boolean hasAge() {
        if (this.age.isEmpty()) {
            return false;
        } else return true;
    }

    public boolean hasAddress() {
        if (!this.city.equals(null)) {
            return true;
        } else return false;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.city;
    }

    public void setAddress(String city) {
        this.city = city;
    }

    public void happyBirthday() {
        if (this.age.isPresent()) {
            int preAge = this.age.getAsInt() + 1;
            this.age = OptionalInt.of(preAge);
        }
    }

    @Override
    public String toString() {
        return "Person { " +
            "name=" + name +
            ", surname=" + surname +
            ", age=" + (age != null ? age.getAsInt() : null ) +
            ", city=" + city + " }";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public PersonBuilder newChildBuilder() throws IllegalArgumentException {
        return new PersonBuilder()
            .setSurname(surname)
            .setAge(5)
            .setAddress(city);
    }

}
