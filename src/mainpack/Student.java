package mainpack;

// ����� �� ������ ������ Person
public abstract class Student extends Person {
    
    // ����������� ����� ��� ����� ����
    public abstract void setCourse(int aCourse);
    
    // ����������� ����� ��� ����� �����
    public abstract int getCourse();
    
    // �������� ���������
    private String Institut;
    
    // �������� ����������
    private String Faculty;
    
    // ����� ��� ����� ���������
    public void setInstitut(String aInstitut)
    {
        this.Institut = aInstitut;
    }
    
    // ����� ��� ������ ���������
    public String getInstitut()
    {
        return this.Institut;
    }
    
    // ����� ��� ����� ����������
    public void setFaculty(String aFaculty)
    {
        this.Faculty = aFaculty;
    }
    
    // ����� ��� ������ ����������
    public String getFaculty()
    {
        return this.Faculty;
    }
    
    // ����������� ��� ����������
    public Student()
    {
        // ������ ��� �� ����� ������
        // ��������� ����������� �� ��������� �� �����������
        super();
        // ������ ��������
        this.setInstitut("");
        // ������ ���������
        this.setFaculty("");
        // ������ ������ ��������� ������������
        System.out.println("����������� " + this.getClass());
    }
    
    // ����������� � �����������
    public Student(String aName, String aInstitut, String aFaculty)
    {
        // ������ �������� �� ����
        // ��� ��������
        super.SetName(aName);
        // ��������
        this.setInstitut(aInstitut);
        // ���������
        this.setFaculty(aFaculty);
        // ������ ������ ��������� ������������
        System.out.println("����������� " + this.getClass());
    }
}
