import mainpack.Person;
import mainpack.*;

public class MajorClasses {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("��������� MajorClasses");
        System.out.println("��������� ������������� ��� �������� ��� � Java");
        //Person person = new Student();
        Person person_temp = new Bachelor();
        System.out.println("Info about " + person_temp.getClass() + " => " + 
          person_temp.getInformation());
    }
 
}
