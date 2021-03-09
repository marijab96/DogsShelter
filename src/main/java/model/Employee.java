package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@javax.persistence.Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Entity {

    private String firstName;
    private String lastName;
    private String oib;
    private String mobileNumber;

}

