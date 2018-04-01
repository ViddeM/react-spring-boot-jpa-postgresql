package se.portals.demo.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name="\"User\"")
public class User {

    @Id
    private String nick;
    private boolean isDigIt = true;

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    private String created;

    @ManyToMany(mappedBy = "users")
    private List<Group> groups;

    public User(){
        created = Calendar.getInstance().getTime().toString();
    }

    public User(String nick, boolean isDigIt) {
        this();
        this.nick = nick;
        this.isDigIt = isDigIt;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public boolean isDigIt() {
        return isDigIt;
    }

    public void setDigIt(boolean digIt) {
        isDigIt = digIt;
    }
}
