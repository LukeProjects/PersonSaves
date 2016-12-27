/*
*
* Java Class
*
*/


/**
 *
 * @author lukew
 */
import java.io.*;
public class ToSave implements Serializable {
    private String firstname;
    private String lastname;
    private int age;
    private int level;
    
    ToSave(String firstname, String lastname, int age, int level) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.level = level;
    }
    ToSave(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    
    public String getFullName() {
        return this.firstname + " " + this.lastname;
    }
    public String getFirstName() {
        return this.firstname;
    }
    public String getLastName() {
        return this.lastname;
    }
    public int getLevel() {
        return this.level;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public void setName(char namepart, String name) {
        if(namepart == 'f') {
            this.firstname = name;
        } else if(namepart == 'l') {
            this.lastname = name;
        }
    }
    public void setLevel(int level) {
        this.level = level;
    }
}

