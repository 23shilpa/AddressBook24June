package com.bridgelabz;

import javax.naming.Name;

public class WelcomeToAddressBook {
    public static void main(String[] args) {
        AddressBook A1 = new AddressBook();
        A1.FirstName = "Shilpa";
        A1.LastName = "Bhonde";
        System.out.println(A1.FirstName+""+A1.LastName);
        A1.Address();
        A1.Email();
        A1.state();
        A1.PhoneNumber();
        A1.city();
    }
}clear
class AddressBook{
    String FirstName;
    String LastName;
    void Address(){
        System.out.println(FirstName+"Printing Address.");
    }
    void Email(){
        System.out.println(FirstName+"Printing Email.");
    }
    void state(){
        System.out.println(FirstName+"Printing state.");
    }
    void PhoneNumber(){
        System.out.println(FirstName+"Printing PhoneNumber.");
    }
    void city(){
        System.out.println(FirstName+"Printing city");
    }
}
