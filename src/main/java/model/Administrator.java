package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Administrator extends model.Entity {

    private String firstName;
    private String lastName;
    private String oib;
    private String userName;
    private String password;
    private String email;
    
    public String getFirstNameLastName(){

        StringBuilder sb = new StringBuilder();

        sb.append(getFirstName()).append(" ").append(getLastName());

            return sb.toString();
    }


}
