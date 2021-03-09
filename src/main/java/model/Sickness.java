package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@javax.persistence.Entity(name = "Sickness")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Sickness")
public class Sickness extends Entity {

    private String description;
    private String name;



    @OneToMany(
            mappedBy = "sickness",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<DogSickness> dogSickness = new ArrayList<>();

}
