import java.util.Objects;
import java.util.Objects;

public class Human {
    private String firstName;
    private String middleName;
    private String lastName;
    private Integer age;
    private Gender gender;

    public Human(String firstName, String middleName, String lastName, Integer age, Gender gender) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Human(Human h) {
        this.firstName = h.firstName;
        this.middleName = h.middleName;
        this.lastName = h.lastName;
        this.age = h.age;
        this.gender = h.gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName) &&
                Objects.equals(middleName, human.middleName) &&
                Objects.equals(lastName, human.lastName) &&
                Objects.equals(age, human.age) &&
                gender == human.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, age, gender);
    }
}