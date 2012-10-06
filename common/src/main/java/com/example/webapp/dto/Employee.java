package com.example.webapp.dto;

import org.apache.commons.lang3.ObjectUtils;

public class Employee
{
    private Integer id;
    private String firstName;
    private String lastName;


    // no-arg constructor so we can call ourselves a bean
    public Employee()
    {
    }


    // convenience constructor for the example
    public Employee(int id, String firstName, String lastName)
    {
        this.id = Integer.valueOf(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Integer getId()
    {
        return id;
    }


    public void setId(Integer id)
    {
        this.id = id;
    }


    public String getFirstName()
    {
        return firstName;
    }


    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }


    public String getLastName()
    {
        return lastName;
    }


    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }


    /**
     *  The string representation of an employee is "ID - FIRST LAST"
     */

    @Override
    public String toString()
    {
        return String.format("%d - %s %s", getId(), getFirstName(), getLastName());
    }


    @Override
    public final boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        else if (obj instanceof Employee)
        {
            Employee that = (Employee)obj;
            return ObjectUtils.equals(this.getId(), that.getId());
        }
        return false;
    }


    @Override
    public final int hashCode()
    {
        return ObjectUtils.hashCode(getId());
    }

}
