package rikkeisoft.com.demo.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "categories")
public class Categories implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "name", length = 30)
    private String name;

    public Categories() {
    }

    public Categories(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
