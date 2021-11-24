package Lab6.Organization;

import java.util.Date;

public class Patient extends Person
{
    public String id;
    public Date accepted;
    public String[] sickness;
    public String[] prescriptions;
    public String[] allergies;
    public String[] specialReqs;

    public int age()
    {
        return accepted.getYear() - birthDate.getYear();
    }
}