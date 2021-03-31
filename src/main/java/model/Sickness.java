package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Table;


@javax.persistence.Entity(name = "Sickness")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Sickness")
public class Sickness extends Entity {

    private String description;
    private String name;

    @Override
    public String toString() {
        return name;
    }
    
    

}
