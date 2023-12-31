package com.example.UserManagementWithValidation.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


    @NotNull
    private Integer userId;

    @NotBlank(message = "name cannot be blank")
    private String userName;

    @Email(message = "Given email id is invalid")
    private String userEmail;

    @Pattern(regexp = "^(?=.*[!@#$%^&*()\\[\\]{};':\"\\\\|,.<>/?])(?=.*\\d)(?=.*[A-Z]).{6,}$")
    private String password;

    @Size(min = 7,max = 12)
    @Pattern(regexp = "^[0-9]+$")
    private String userContact;

    @NotNull
    private LocalDate userDOB; //EX : 2007-12-03.

    @Min(value = 18)
    @Max(value = 30)
    private Integer userAge;

    @NotNull
    private  LocalDate currDate;  //= LocalDate.now();
    @NotNull
    private  LocalTime currTime;  //= LocalTime.now();








}