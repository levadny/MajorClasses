package mainpack;

// абстрактный класс содержит только самое необходимое
public abstract class Person 
{
    // поле имени
    String Name;
    
    // получение имени
    public String GetName()
    {
        return this.Name;
    }
    
    // задание имени
    public void SetName(String aName)
    {
        this.Name = aName;
    }
    
    // конструктор без параметров
    public Person()
    {
        this.Name = "John Doe";
        // строка конструктора
        System.out.println("Конструктор " + this.getClass());
    }
    
    // конструктор с параметрами
    public Person(String aName)
    {
        this.SetName(aName);
        // строка конструктора
        System.out.println("Конструктор " + this.getClass());
    }
    
    // абстрактный метод для вывода общей информации
    public abstract String getInformation();
    
}
