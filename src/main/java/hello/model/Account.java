package hello.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kraichura on 11/18/2015.
 */

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String userName;
    private String password;

    private String roles;

    public Account(String userName, String password, String roles){
        this.userName = userName;
        this.password = password;
        this.roles = roles;

    }

    public Account(){

    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
