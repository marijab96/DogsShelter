package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
    private String yearOfBirth;           ;
    private boolean adopted;
    @ManyToOne
    private Box box;

    @ManyToOne
    private Employee employee;


    @ManyToOne
    private Species species;


    @OneToMany(mappedBy = "dog")
    private List<DogSickness> sicknesses = new ArrayList<>();

    public List<DogSickness> getSicknesses() {
        return sicknesses;
    }

    public void setSicknesses(List<DogSickness> sicknesses) {
        this.sicknesses = sicknesses;
    }




    @Override
    public String toString() {
        return getName();
    }
    
    


}
