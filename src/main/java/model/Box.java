package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;

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


}
