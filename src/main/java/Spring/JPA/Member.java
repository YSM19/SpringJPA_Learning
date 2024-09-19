package Spring.JPA;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private String id;

    private String name;

    private String city;
    private String street;
    private String zipcode;


}
