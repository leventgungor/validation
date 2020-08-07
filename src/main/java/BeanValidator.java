import javax.validation.*;
import java.util.Set;

public class BeanValidator {

    public static void main(String[] args){
        Student ahmet = new Student();
        ahmet.setName("");
        ahmet.setSurname("Bozok");
        ahmet.setAddress("Yok");
        ahmet.setEmail("ahmetbozokgmail.com");
        ahmet.setId(560);
        ahmet.setDepartment(6);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<Student>> violations = validator.validate(ahmet);

        System.out.println("Ogrenci Ahmet icin violationlar:");
        violations.stream().map(ConstraintViolation::getMessage).forEach(System.out::println);

    }
}
