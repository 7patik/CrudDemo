package users;

public class Person {
    String name;
    String surname;
    int age;
    long passportseries;

    public Person(String name, String surname, int age, long passportseries) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.passportseries = passportseries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPassportseries() {
        return passportseries;
    }

    public void setPassportseries(long passportseries) {
        this.passportseries = passportseries;
    }
}
