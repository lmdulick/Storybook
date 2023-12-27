package business;

import javax.swing.JTextField;

public class Person {

    private String name;
    private String show;
    private String subject;
    private String age;
    private String counter;
    
    
    public Person(){
        
    }
    
    public Person(String name, String show, String subject, String age){
        this.name = name;
        this.show = show;
        this.subject = subject;
        this.age = age;
    }

    Person(JTextField yourName, JTextField yourShow, JTextField yourSubject, JTextField yourAge) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Person(String name, String show, String subject, String age, String count) {
        this.name = name;
        this.show = show;
        this.subject = subject;
        this.age = age;
        this.counter = counter;
    }
    
    public void setCounter(String o){
        this.counter = o;
    }
                        
    public String getName(){
        return name;
    }
    
    public String getShow(){
        return show;
    }
    
    public String getSubject(){
        return subject;
    }
    
    public String getAge(){
        return age;
    }
   
    
    
    public String getPassedName(){
        return name;
    }
    
    public String getPassedShow(){
        return show;
    }
    
    public String getPassedSubject(){
        return subject;
    }
    
    public String getPassedAge(){
        return age;
    }
}
