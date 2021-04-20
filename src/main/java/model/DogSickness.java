package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    private LocalDate dateoftreatment;

    private String medicine;


    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return sickness + ", " +
                dateoftreatment.atStartOfDay().format(formatter) + ", " +
                medicine;
    }
}


