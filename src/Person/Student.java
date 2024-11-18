package Person;

import Lists.Groups.Group;

import java.util.HashSet;
import java.util.Set;

public class Student extends User{

    private String group = null;
    public static Set<Student> arrStudent = new HashSet<>();

    //constructors-----------------------------------------------------------------------------------------------

    public Student(String name, String sorName, String login, String password, String group, int ID) {
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

    public void setGroup(String group) {
        group = group.trim();
        if(!group.isEmpty() && !group.isBlank()){
            group = group.substring(0, 1).toUpperCase() + group.substring(1);
            if(Group.arrNameOfGroup.contains(group)) {
                this.group = group;

            }else System.out.println("Вы указали несуществующую группу!");
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
