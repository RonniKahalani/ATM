package com.atm.customer;

public interface Customer {
    public String getFullName();
    public String getFirstName();

    public void setFirstName(String firstName);

    public String getMiddleName();

    public void setMiddleName(String middleName);

    public String getLastName();

    public void setLastName(String lastName);

}
