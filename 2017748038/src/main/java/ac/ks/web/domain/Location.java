package ac.ks.web.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@NoArgsConstructor

@Table
@Entity
public class Location implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String address;

    @Column
    private String postcode;

    @Builder
    public Location(String address, String postcode){
        this.address = address;
        this.postcode = postcode;
    }



}
