import java.util.List;
import java.util.Objects;

public class Person  {
    private final String name;
    private final int year;

    public Person(String name, int year) {
        this.name = name != null &&name.isEmpty()? "введите имя ":name;
        this.year = year > 0 ? year: 18;
    }

    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return year == person.year && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}

