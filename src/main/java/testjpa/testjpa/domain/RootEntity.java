package testjpa.testjpa.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RootEntity {
    @Id
    private Integer id;
}