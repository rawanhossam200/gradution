
package gradution.model;

/**
 *
 * @author SMART
 */
public class users {
    private int uId;
    private String uName;
    private String password;
    private String email;
    private String phoneNum;
    private int typeId;

    public int getUId() { return uId; }
    public void setUId(int uId) { this.uId = uId; }

    public String getUName() { return uName; }
    public void setUName(String uName) { this.uName = uName; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNum() { return phoneNum; }
    public void setPhoneNum(String phoneNum) { this.phoneNum = phoneNum; }

    public int getTypeId() { return typeId; }
    public void setTypeId(int typeId) { this.typeId = typeId; }
}
