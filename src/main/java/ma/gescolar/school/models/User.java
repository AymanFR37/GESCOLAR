package ma.gescolar.school.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userlogin")
//@AllArgsConstructor
@Data
//@NoArgsConstructor
public class User {
    @Id
    private String username;
    private String password;
}
