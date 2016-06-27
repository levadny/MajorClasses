package mainpack;

// класс на основе класса Person
public abstract class Student extends Person {
    
    // абстрактный метод для курса ввод
    public abstract void setCourse(int aCourse);
    
    // абстрактный метод для курса вывод
    public abstract int getCourse();
    
    // название института
    private String Institut;
    
    // название факультета
    private String Faculty;
    
    // метод для ввода института
    public void setInstitut(String aInstitut)
    {
        this.Institut = aInstitut;
    }
    
    // метод для вывода института
    public String getInstitut()
    {
        return this.Institut;
    }
    
    // метод для ввода факультета
    public void setFaculty(String aFaculty)
    {
        this.Faculty = aFaculty;
    }
    
    // метод для вывода факультета
    public String getFaculty()
    {
        return this.Faculty;
    }
    
    // конструктор без параметров
    public Student()
    {
        // задаем имя из супер класса
        // используя конструктор по умолчанию из суперкласса
        super();
        // задаем институт
        this.setInstitut("");
        // задаем факультет
        this.setFaculty("");
        // задаем строку выполения конструктора
        System.out.println("Конструктор " + this.getClass());
    }
    
    // конструктор с параметрами
    public Student(String aName, String aInstitut, String aFaculty)
    {
        // задаем значения на поля
        // имя студента
        super.SetName(aName);
        // институт
        this.setInstitut(aInstitut);
        // факультет
        this.setFaculty(aFaculty);
        // задаем строку выполения конструктора
        System.out.println("Конструктор " + this.getClass());
    }
}
