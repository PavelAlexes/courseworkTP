package Person;

import java.util.HashSet;
import java.util.Set;

public class Dean extends User{

    public static Set<Dean> arrDean = new HashSet<>();

    Dean(String name, String sorName, String login, String password, int ID) {
        super(name, sorName, login, password, ID);

        System.out.println("Создан Зам. Декана:\n");
        System.out.println("Имя: " + super.name);
        System.out.println("ID: " + super.ID);
    }

    private void allowPassExam(){}

    private void examInfoDean(){}


}
