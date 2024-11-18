package Lists.Groups;
import Person.Student;
import java.util.HashSet;
import java.util.Set;


public class Group {

    private String nameOfGroup;
    public static Set<String> arrNameOfGroup = new HashSet<>();
    private Set<Student> arrStudentInGroup = new HashSet<>();



    public Group(String nameOfGroup){
        setNameOfGroup(nameOfGroup);


        System.out.println("Создана группа: " + nameOfGroup);
    }



    public void setNameOfGroup(String nameOfGroup) {
        nameOfGroup = nameOfGroup.trim();
        if(!nameOfGroup.isEmpty() && !nameOfGroup.isBlank()){
            nameOfGroup = nameOfGroup.substring(0, 1).toUpperCase() + nameOfGroup.substring(1);
            if(!arrNameOfGroup.contains(nameOfGroup)) {
                arrNameOfGroup.add(nameOfGroup);
                this.nameOfGroup = nameOfGroup;
            }else System.out.println("Группа с таким названием уже создана!");
        }
    }


    public String getNameOfGroup() {
        return nameOfGroup;
    }
}
