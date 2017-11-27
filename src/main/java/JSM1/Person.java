package JSM1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import org.apache.commons.lang.WordUtils;


public class Person {

    private String name;
    private String surname;
    private String mail;

    Person(String name, String surname, String mail) {
        setName(name);
        setSurname(surname);
        setMail(mail);
    }

    private void setName(String name) {
        String namePattern = "^\\p{L}{3,}$";

        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(name);

        if ( matcher.find() ){
            this.name = name;
        } else {
            System.out.println("Please enter a valid name");
        }
    }
    private void setSurname(String surname) {
        String surnamePattern = "^\\p{L}{3,}$|(?:-\\p{L}{3,})";

        Pattern pattern = Pattern.compile(surnamePattern);
        Matcher matcher = pattern.matcher(surname);

        if ( matcher.find() ){
            this.surname = surname;
        } else {
            System.out.println("Please enter a valid surname");
        }
    }
    private void setMail(String mail) {
        String mailPattern = "^.+@[a-z0-9]+[.](?:[a-z]{2}|[a-z]{3})$";

        Pattern pattern = Pattern.compile(mailPattern);
        Matcher matcher = pattern.matcher(mail);

        if ( matcher.find() ){
            this.mail = mail;
        } else {
            System.out.println("Please enter a valid e-mail address");
        }
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getMail() {
        return mail;
    }

    public boolean before(Person other) {

        String[] thisPerson = this.toString().split(" ");
        String[] otherPerson = other.toString().split(" ");        
        String[] thisLetters;
        String[] otherLetters;
        int ASCII1;
        int ASCII2;

        for (int x = 0; x < thisPerson.length; ++x) {

            thisLetters = thisPerson[x].split("");
            otherLetters = otherPerson[x].split("");

            for (int i = 0; i < Math.min(thisLetters.length, otherLetters.length); ++i) {

                ASCII1 = (int) thisLetters[i].charAt(0);
                ASCII2 = (int) otherLetters[i].charAt(0);

                if (ASCII2 < ASCII1) {
                    return false;
                } else if (ASCII2 > ASCII1) {
                    return  true;
                }
            }

            if (thisLetters.length < otherLetters.length) {
                return false;
            } else if (thisLetters.length > otherLetters.length) {
                return true;
            }
        }

        return true;
    }

    public String toString(){
        return this.name + ' ' + this.surname + ' ' + this.mail;
    }
}
