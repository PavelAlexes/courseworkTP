package Person;

import java.util.HashSet;
import java.util.Set;

public class Student extends User{

    private String name = null;
    private String sorName = null;
    private String login = null;
    private String password = null;
    private String group = null;
    private int ID = 0;
    public static Set<Student> arrStudent = new HashSet<>();

    //constructors-----------------------------------------------------------------------------------------------

    public Student(String name, String sorName, String login, String password, String group, int ID) {
        super(name, sorName, login, password);
        setGroup(group);
        setID(ID);
        System.out.println("Создан студент:\n");
        System.out.println("Имя: " + super.name);
        System.out.println("ID: " + this.ID);
    }

    //methods-----------------------------------------------------------------------------------------------

    private void examInfoStudent(){}
    //-------------------------------------------
    private void passExam(){}

    //set-----------------------------------------------------------------------------------------------

    public void setGroup(String group) {
        group = group.trim();
        if(!group.isEmpty() && !group.isBlank()){
            group = group.substring(0, 1).toUpperCase() + group.substring(1);
            this.group = group;
        }
    }
    //-------------------------------------------
    public void setID(int ID) {
        this.ID = ID;
    }

    //get-----------------------------------------------------------------------------------------------

    public String getGroup() {
        return group;
    }
    //-------------------------------------------
    @Override
    public int getID() {
        return ID;
    }
}
