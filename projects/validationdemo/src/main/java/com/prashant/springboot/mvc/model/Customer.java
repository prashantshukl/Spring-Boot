package com.prashant.springboot.mvc.model;

import com.prashant.springboot.mvc.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is Required")
    @Size(min = 1, message = "is Required")
    private String lastName = "";

    @Min(value = 0, message = "it should be greater than or equal to 0")
    @Max(value = 10, message = "it should be less than or equal to 10")
    private Integer freePasses;


    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 Characters allowed (digits/alphabets)")
    private String postalCode;

    @CourseCode
    private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public  String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
