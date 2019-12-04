package nik.and.model;

public class ContactData {

    private final String firstname;
    private final String secondname;
    private String groupe;


    public ContactData(String firstname, String secondname, String groupe){

        this.firstname = firstname;
        this.secondname = secondname;
        this.groupe = groupe;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return secondname;
    }

    public String getGroup(){ return groupe; }
}
