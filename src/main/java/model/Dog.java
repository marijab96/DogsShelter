package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NaturalIdCache;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@javax.persistence.Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Dog")
public class Dog extends Entity{

    private String name;

    private Long chipNumber;
    private String dateOfBirth;           ;
    private boolean adopted;
    @ManyToOne
    private Box box;

    @ManyToOne
    private Employee employee;



    @ManyToOne
    private Species species;


    @OneToMany(
            mappedBy = "dog",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<DogSickness> dogSicknesses = new ArrayList<>();


}
