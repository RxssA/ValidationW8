package ie.atu.validationw8;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotBlank(message = "Title cannot be blank")
    private String title;

    @Size(min = 2, max = 50, message = "ID must be between 2 and 50 characters")
    @NotBlank(message = "ID cannot be blank")
    private int employeeid;


    @NotBlank(message = "Age cannot be blank")
    private int age;

    @Email(message = "Invalid email")
    @NotBlank(message = "Email cannot be blank")
    private String email;

    @NotBlank(message = "position cannot be blank")
    private String position;

    @NotBlank(message = "Department cannot be blank")
    private String department;



}
