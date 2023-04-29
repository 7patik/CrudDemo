package users;

public class Student extends Person{
    String university;
    String profession;
    int rank;

    public Student(String name, String surname, int age, long passportseries, String university, String profession, int rank) {
        super(name, surname, age, passportseries);
        this.university = university;
        this.profession = profession;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Tələbə{" +
                " Ad='" + name + '\'' +
                ", Soyad='" + surname + '\'' +
                ", Yaş='" + age +'\'' +
                ", Seriya='" + passportseries+'\'' +
                ", Oxuduğu universitet='" + university + '\'' +
                ", İxtisas='" + profession + '\'' +
                ", Kurs='" + rank +"'"+
                '}';
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

}
