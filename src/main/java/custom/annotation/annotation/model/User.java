package custom.annotation.annotation.model;

import custom.annotation.annotation.annotation.AgeLimit;

import java.time.LocalDate;

public class User {
    private String firstName;
    private String lastName;
    @AgeLimit(minimumAge = 16, message = "You are too young to attend the meeting")
    private LocalDate birthDate;

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}