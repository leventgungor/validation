import javax.validation.constraints.*;

public class Student {
    @Positive(message = "student id cannot be negative or zero!")
    private int id;

    @NotBlank(message = "name cannot be null or blank!")
    private String name;

    @NotBlank(message = "surname cannot be null or blank!")
    private String surname;

    @Size(min = 10, max=50, message = "adress must be between 10 and 50 chars")
    private String address;

    @Email(message = "email should be valid!")
    private String email;

    @NotNull()
    private int department;

    @Max(4)
    @Min(0)
    private int gpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
