package Person;

import java.util.HashSet;
import java.util.Set;

public class Teacher extends User{

    public static Set<Teacher> arrTeacher = new HashSet<>();

    //constructors-----------------------------------------------------------------------------------------------

    public Teacher(String name, String sorName, String login, String password, int ID) throws Exception {
        super(name,sorName,login,password, ID);

        System.out.println("Создан преподаватель:\n");
        System.out.println("Имя: " + super.name);
        System.out.println("ID: " + super.ID);
    }

    //methods-----------------------------------------------------------------------------------------------

    private void addExam(){}
    //-------------------------------------------
    private void takeExam(){}
    //-------------------------------------------
    private void examInfoTeacher(){}
}
