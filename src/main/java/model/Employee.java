package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany
    @JoinColumn(name = "employee_id")
    private List<Dog> dogs = new ArrayList<>();


    @OneToMany
    @JoinColumn(name = "employee_id")
    private List<Box> boxes = new ArrayList<>();

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }
    
    

}

