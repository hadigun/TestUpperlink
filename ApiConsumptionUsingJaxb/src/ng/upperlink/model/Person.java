/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.upperlink.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adigun Hammed
 */
@XmlRootElement
public class Person {

    private String name;
    private String email;
    private String phonenumber;
    private String gender;

    public Person() {
    }

    
    public Person(String name, String email, String phonenumber,  String gender) {
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
      
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    @XmlElement
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    @XmlElement
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

   

    public String getGender() {
        return gender;
    }

    @XmlElement
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    

}
