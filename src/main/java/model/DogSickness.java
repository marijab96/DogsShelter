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
public class DogSickness {


    @EmbeddedId
    private DogSicknessId id;


    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("dogId")
    private Dog dog;


    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("sicknessId")
    private Sickness sickness;

    @Column(name = "date_of_treatment")
    private Date dateoftreatment = new Date();

    @Column(name = "medicine")
    private String medicine;
}
