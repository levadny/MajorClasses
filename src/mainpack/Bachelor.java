package mainpack;

// ����� ���������
public class Bachelor extends Student {
    
    // ������ ������� �����
    private int Course;
    
    // ����� ��� ������� �����
    public void setCourse(int aCourse)
    {
        this.Course = aCourse;
    }
    
    // ����� ��� ��������� �����
    public int getCourse()
    {
        return this.Course;
    }
    
    // ����������� ��� ����������
    public Bachelor()
    {
        // �������� ����������� �����������
        super();
        // ������
        System.out.println("����������� " + this.getClass());
    }
    
    // ����������� � �����������
    public Bachelor (String aName, String aInstitut, String aFaculty, int aCourse)
    {
        // �������� ����������� � �����������
        super(aName, aInstitut, aFaculty);
        // ������ ����
        this.setCourse(aCourse);
    }
    
    // ����� ��������� ����� ����������
    public String getInformation()
    {
        return this.Name;
    }
}
