package Person;

public class Student extends User{

    private String name = null;
    private String sorName = null;
    private String login = null;
    private String password = null;
    private int ID = 0;

    public Student(String name, String sorName, String login, String password) {
        super(name, sorName, login, password);
    }

    private void examInfoStudent(){}

    private void passExam(){}
}
