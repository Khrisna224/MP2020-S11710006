package com.multiplatform;

public class Person {
    //field
    private String firstName;
    private String lastName;
    private int age;

    //method
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        if(age > 100 || age < 0) this.age = 0;
        this.age = age;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()) return "";
        else if (this.lastName.isEmpty()) return this.firstName;
        else if (this.firstName.isEmpty()) return this.lastName;
        else return this.firstName + " " + this.lastName;
    }
    public boolean isTeen(){
        if(age > 12 && age < 20) return true;
        return false;
    }
}
/*
 *In case both firstName and lastName fields are empty, Strings return an empty String.
 *In case lastName is an empty String, return firstName.
 *In case firstName is an empty String, return lastName.

 *
* */