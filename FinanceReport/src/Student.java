import java.util.Objects;

import java.util.Objects;

public class Student extends Human {
    private String university;
    private String faculty;
    private String specialty;

    public Student(String firstName, String middleName, String lastName, Integer age, Gender gender) {
        super(firstName, middleName, lastName, age, gender);
    }

    public Student(String firstName, String middleName, String lastName, Integer age, Gender gender,
                   String university, String faculty, String specialty) {
        super(firstName, middleName, lastName, age, gender);
        this.university = university;
        this.faculty = faculty;
        this.specialty = specialty;
    }

    public Student(Human h, String university, String faculty, String specialty) {
        super(h);
        this.university = university;
        this.faculty = faculty;
        this.specialty = specialty;
    }

    public Student(Student s) {
        super(s);
        this.university = s.university;
        this.faculty = s.faculty;
        this.specialty = s.specialty;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(university, student.university) &&
                Objects.equals(faculty, student.faculty) &&
                Objects.equals(specialty, student.specialty);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), university, faculty, specialty);
    }
}