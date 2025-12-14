
package gradution;

import java.util.Date;


/**
 *
 * @author SMART
 */
public class patient {
    private int pId;
    private String pName;
    private String nationalId;
    private Date birthdate;
    private String gender;
    private String phoneNum;
    private String address;
    private int uId;

    public int getPId() { return pId; }
    public void setPId(int pId) { this.pId = pId; }

    public String getPName() { return pName; }
    public void setPName(String pName) { this.pName = pName; }

    public String getNationalId() { return nationalId; }
    public void setNationalId(String nationalId) { this.nationalId = nationalId; }

    public Date getBirthdate() { return birthdate; }
    public void setBirthdate(Date birthdate) { this.birthdate = birthdate; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getPhoneNum() { return phoneNum; }
    public void setPhoneNum(String phoneNum) { this.phoneNum = phoneNum; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public int getUId() { return uId; }
    public void setUId(int uId) { this.uId = uId; }
}
