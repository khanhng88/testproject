/*
Created by emman at 7/14/2023 11:11 PM
*/
package partE.data;

public class UserCreds {

    private String email;
    private String password;
    private boolean isExisted;

    public UserCreds(String email, String password, boolean isExisted) {
        this.email = email;
        this.password = password;
        this.isExisted = isExisted;
    }

    public boolean isExisted() {
        return isExisted;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
