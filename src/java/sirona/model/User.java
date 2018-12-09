package sirona.model;

import java.io.Serializable;

/**
 *
 * @author Geoffrey
 */
public class User implements Serializable {

    private String userName;
    private String password;

    public User() {
        userName = "";
        password = "";
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
