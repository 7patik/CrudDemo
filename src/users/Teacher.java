package users;

public class Teacher extends Person{
    String university;
    String discipline;
    int experience;

    public Teacher(String name, String surname, int age, long passportseries, String university, String discipline, int experience) {
        super(name, surname, age, passportseries);
        this.university = university;
        this.discipline = discipline;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Müəllim{" +
                " Ad='" + name + '\'' +
                ", Soyad='" + surname + '\'' +
                ", Yaş='" + age+ '\'' +
                ", Seriya='" + passportseries+ '\'' +
                ", İşlədiyi universitet='" + university + '\'' +
                ", Sahə='" + discipline + '\'' +
                ", Təcrübə='" + experience +"'"+
                '}';
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
