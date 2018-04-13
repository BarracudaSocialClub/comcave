/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sammlungen;

import java.time.LocalDate;

/**
 *
 * @author awiechens
 */
public class Customer {
    
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private double amount;
    private int anzahlKinder;

    
    public Customer() {
    }

    public Customer(String firstname, String lastname, LocalDate birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;        
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
   
    private void buy(double price) {
        amount -= price;
    }
    
    private void pay(double money) {
        amount += money;
    }
    

    @Override
    public String toString() {
        return   "Name: " + this.firstname + " " + lastname + ", Geburtstag: " + birthdate + " ";
    }

    public boolean compareCustomer(Customer c) {        
        if (this.firstname.equals(c.firstname) & this.lastname.equals(c.lastname) & this.birthdate.equals(c.birthdate)) {            
            return true;
        } else {
            return false; 
        }
    }
    
   
    public boolean myEquals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof Customer) {
            Customer c = (Customer) anObject;
            if (this.firstname.equals(c.firstname) & this.lastname.equals(c.lastname) & this.birthdate.equals(c.birthdate)) {            
                return true;
            } else {
                return false; 
            }
        }
        return false;
    }    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }        
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Customer)) {
            return false;
        }
        Customer c = (Customer) obj;
        if (!this.firstname.equals(c.firstname)) {
            return false;
        }
        if (!this.lastname.equals(c.lastname)) {
            return false;
        }
        if (this.anzahlKinder != ((Customer) obj).anzahlKinder) {
            return false;
        }
        if (!this.birthdate.equals(c.birthdate)) { // auch LocalDate hat eine überschriebene equals-Methode...
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        // Relevante Attribute: firstname, lastname, birthday
        // Attribute, die auch in der equals-Methode verglichen werden
        int hFirstname = firstname.hashCode();
        int hLastname = lastname.hashCode();
        int hBirthday = birthdate.hashCode();
        
        hash = (37*hFirstname)+(41*hLastname)-(47*hBirthday);
        
        return hash;
    }
    
    
}
