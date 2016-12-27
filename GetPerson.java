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
public class GetPerson {
    private Object bperson;
    private ToSave person;
    private String FullName;
    private int age;
    private int level;
    
    GetPerson(String path) {
        this.getPerson(path);
    }
    GetPerson() {
        
    }
    
    public void getPerson(String path) {
        try {
            FileInputStream file = new FileInputStream(path);
            ObjectInputStream os = new ObjectInputStream(file);
            bperson = os.readObject();
            person = (ToSave) bperson;
            FullName = person.getFullName();
            age = person.getAge();
            level = person.getLevel();
            os.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public String getFullName() {
        return this.FullName;
    }
    public int getAge() {
        return this.age;
    }
    public int getLevel() {
        return this.level;
    }
}

