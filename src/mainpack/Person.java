package mainpack;

// ����������� ����� �������� ������ ����� �����������
public abstract class Person 
{
    // ���� �����
    String Name;
    
    // ��������� �����
    public String GetName()
    {
        return this.Name;
    }
    
    // ������� �����
    public void SetName(String aName)
    {
        this.Name = aName;
    }
    
    // ����������� ��� ����������
    public Person()
    {
        this.Name = "John Doe";
        // ������ ������������
        System.out.println("����������� " + this.getClass());
    }
    
    // ����������� � �����������
    public Person(String aName)
    {
        this.SetName(aName);
        // ������ ������������
        System.out.println("����������� " + this.getClass());
    }
    
    // ����������� ����� ��� ������ ����� ����������
    public abstract String getInformation();
    
}
