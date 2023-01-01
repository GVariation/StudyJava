package F02.F010ContractHashCodeAndEquals;

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

    // {object} -> {int}
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    /*
        Контракт hashCode() equals()
        1) У двух проверяемых объектов вызываем метод hashCode()
            если хэши разные -> два объект точно разные.
            если хэши одинаковые -> колизия или объекты одинаковые
        2)  если хэши одинаковые -> equals()
        3) выполняется equals() -> выдаёт ответ
     */
}
