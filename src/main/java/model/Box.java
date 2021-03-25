package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@javax.persistence.Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Box extends Entity {


    private String name;
    private Integer capacity;
    private BigDecimal size;

    @ManyToOne
    private Employee employee;

    @OneToMany
    @JoinColumn(name = "box_id")
    private List<Dog> dogs = new ArrayList<>();

    @Override
    public String toString() {
        return getName();
    }
    
    

    




}
