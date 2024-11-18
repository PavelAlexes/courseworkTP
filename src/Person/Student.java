package Person;

import Lists.Groups.Group;

import java.util.HashSet;
import java.util.Set;

public class Student extends User{

    private String group = null;
    public static HashSet<Student> arrStudent = new HashSet<>();

    //constructors-----------------------------------------------------------------------------------------------

    public Student(String name, String sorName, String login, String password, String group, int ID) throws Exception {
        super(name, sorName, login, password, ID);
            setGroup(group);
            System.out.println("Создан студент: ");
            System.out.println("Имя: " + super.name);
            System.out.println("ID: " + super.ID);

    }

    //methods-----------------------------------------------------------------------------------------------



    private void examInfoStudent(){}

    //-------------------------------------------
    private void passExam(){}

    //set-----------------------------------------------------------------------------------------------

    private void setGroup(String group) throws Exception{
        group = group.trim();
        if(!group.isEmpty() && !group.isBlank()){
            group = group.substring(0, 1).toUpperCase() + group.substring(1);
            if(Group.arrNameOfGroup.contains(group)) {
                this.group = group;

            }else throw new Exception("Группы с таким названием не существует!");
        }
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
