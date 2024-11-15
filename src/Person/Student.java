package Person;

public class Student extends User{

    private String name = null;
    private String sorName = null;
    private String login = null;
    private String password = null;
    private String group = null;
    private int ID = 0;


    public Student(String name, String sorName, String login, String password, String group, int ID) {
        super(name, sorName, login, password);
        setGroup(group);
        this.ID = ID;
        System.out.println("Создан студент:\n");
        System.out.println("Имя: " + super.name);
        System.out.println("ID: " + this.ID);
    }

    private void examInfoStudent(){}

    private void passExam(){}

    //set-----------------------------------------------------------------------------------------------

    public void setGroup(String group) {
        group = group.trim();
        if(!group.isEmpty() && !group.isBlank()){
            group = group.substring(0, 1).toUpperCase() + group.substring(1);
            this.group = group;
        }
    }

    //get-----------------------------------------------------------------------------------------------

    public String getGroup() {
        return group;
    }
}
