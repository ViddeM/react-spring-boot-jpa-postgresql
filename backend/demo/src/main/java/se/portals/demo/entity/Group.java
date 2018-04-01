package se.portals.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="\"Group\"")
public class Group {

    @Id
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    private List<User> users;

    public Group(){

    }

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
