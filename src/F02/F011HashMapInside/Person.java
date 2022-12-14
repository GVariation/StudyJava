package F02.F011HashMapInside;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        return 1; // бесполезная хэш-функция
//        int result = id;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        return result;
    }
}
