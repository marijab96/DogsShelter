package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@javax.persistence.Entity(name = "DogSickness")
@Table(name = "Dog_Sickness")
public class DogSickness extends Entity{



    @ManyToOne
    private Dog dog;


    @ManyToOne
    private Sickness sickness;

    
    private String dateoftreatment;

   
    private String medicine;


    @Override
    public String toString() {
        return "Dog Sickness{" +
                "dog=" + dog +
                ", sickness=" + sickness +
                ", dateoftreatment=" + dateoftreatment +
                ", medicine='" + medicine + '\'' +
                '}';
    }
}


