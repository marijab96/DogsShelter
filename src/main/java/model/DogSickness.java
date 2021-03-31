package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@javax.persistence.Entity(name = "DogSickness")
@Table(name = "Dog_Sickness")
public class DogSickness extends Entity{



    @ManyToOne//(fetch = FetchType.LAZY)
    private Dog dog;


    @ManyToOne//(fetch = FetchType.LAZY)
     private Sickness sickness;

    //@Column(name = "date_of_treatment")
    private Date dateoftreatment;

   // @Column(name = "medicine")
    private String medicine;


    @Override
    public String toString() {
        return "DogSickness{" +
                "dog=" + dog +
                ", sickness=" + sickness +
                ", dateoftreatment=" + dateoftreatment +
                ", medicine='" + medicine + '\'' +
                '}';
    }
}


