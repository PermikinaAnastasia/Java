import java.util.Objects;

public class Human {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public Human(String firstName, String middleName, String lastName, int age) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "work.Human{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;

        Human human = (Human) o;

        if (getAge() != human.getAge()) return false;
        if (getFirstName() != null ? !getFirstName().equals(human.getFirstName()) : human.getFirstName() != null)
            return false;
        if (getMiddleName() != null ? !getMiddleName().equals(human.getMiddleName()) : human.getMiddleName() != null)
            return false;
        return getLastName() != null ? getLastName().equals(human.getLastName()) : human.getLastName() == null;
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, middleName, lastName, age);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
