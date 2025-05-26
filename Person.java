 
 import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    private String name;
    private LocalDate dateOfBirth;

    public Person(String name, String dobStr, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        this.name = name;
        this.dateOfBirth = LocalDate.parse(dobStr, formatter);
    }

    public void displayPersonName() {
        System.out.println("Person Name: " + name);
    }

    public void displayPersonAge() {
        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        System.out.println("Person Age: " + age + " years");
    }

    public static void main(String[] args) {
        Person person = new Person("John Doe", "1990-08-25", "yyyy-MM-dd");
        person.displayPersonName();
        person.displayPersonAge();
    }
}

