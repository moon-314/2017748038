package ac.ks.web.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Table
@Entity
public class Work implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column
    private String company;

    @Column
    private String position;

    @Column
    private String website;

    @Column
    private LocalDate startdate;

    @Column
    private LocalDate enddate;

    @Column
    private String summary;

    @Builder
    public Work(String company, String position, String website, LocalDate startdate, LocalDate enddate, String summary){
        this.company = company;
        this.position = position;
        this.website = website;
        this.startdate = startdate;
        this.enddate = enddate;
        this.summary = summary;
    }

}
