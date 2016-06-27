package mainpack;

// класс бакалавра
public class Bachelor extends Student {
    
    // вводим понятие курса
    private int Course;
    
    // метод для задания курса
    public void setCourse(int aCourse)
    {
        this.Course = aCourse;
    }
    
    // метод для получения курса
    public int getCourse()
    {
        return this.Course;
    }
    
    // конструктор без параметров
    public Bachelor()
    {
        // вызываем конструктор суперкласса
        super();
        // строка
        System.out.println("Конструктор " + this.getClass());
    }
    
    // конструктор с параметрами
    public Bachelor (String aName, String aInstitut, String aFaculty, int aCourse)
    {
        // вызываем конструктор с параметрами
        super(aName, aInstitut, aFaculty);
        // задаем курс
        this.setCourse(aCourse);
    }
    
    // метод получения общей информации
    public String getInformation()
    {
        return this.Name;
    }
}
