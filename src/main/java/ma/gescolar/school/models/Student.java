package ma.gescolar.school.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue
    private int matricule;
    private String firstName;
    private String lastName;
}
