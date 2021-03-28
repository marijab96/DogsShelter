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
public class Species extends Entity{

    private String name;

    @OneToMany
    @JoinColumn(name = "species_id")
    private List<Dog> dogs = new ArrayList<>();

    @Override
    public String toString() {
        return getName();
    }
    
    

}
