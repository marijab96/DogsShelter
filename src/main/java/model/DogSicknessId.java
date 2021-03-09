package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class DogSicknessId implements Serializable  {


    @Column(name = "dog_id")
    private Long dogId;

    @Column(name = "sickness_id")
    private Long sicknessId;


}

