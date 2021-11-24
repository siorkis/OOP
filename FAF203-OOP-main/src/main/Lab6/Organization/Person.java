package Lab6.Organization;

import java.util.Date;

public class Person
{
    public String title;
    public String givenName;
    public String middleName;
    public String familyName;
    public Date birthDate;
    public boolean gender;
    public String phone;
    public String homeAddress;

    public String fullName()
    {
        return title + givenName + middleName + familyName;
    }
}