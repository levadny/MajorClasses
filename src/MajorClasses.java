import mainpack.Person;
import mainpack.*;

public class MajorClasses {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Программа MajorClasses");
        System.out.println("Программа предназначена для изучения ООП и Java");
        //Person person = new Student();
        Person person_temp = new Bachelor();
        System.out.println("Info about " + person_temp.getClass() + " => " + 
          person_temp.getInformation());
    }
 
}
