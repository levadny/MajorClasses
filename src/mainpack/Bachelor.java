package mainpack;

// ����� ���������
public class Bachelor extends Student {
    
    // ������ ������� �����
    private int Course;
   
    // ������ ������� ������������ � ������������� ������
    public final int MinCourse = 1;
    public final int MaxCourse = 4;
    
    // ����� ��� ������� �����
    public void setCourse(int aCourse)
    {
        if (aCourse > this.MaxCourse)
            aCourse = this.MaxCourse;
        if (aCourse < this.MinCourse)
            aCourse = this.MinCourse;
        // ���������������� ������������
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
        return this.Name + " �������-�������� � " + super.getInstitut() 
             + " �� ���������� " + super.getFaculty() + " �� " 
                 + this.getCourse() + " �����.";
    }
}
