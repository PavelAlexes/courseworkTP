package Person;

public class Teacher extends User{
    private String name = null;
    private String sorName = null;
    private String login = null;
    private String password = null;
    private int ID = 0;



    public Teacher(String name, String sorName, String login, String password, int ID){
        super(name,sorName,login,password);
        this.ID = ID;
        System.out.println("Создан преподаватель:\n");
        System.out.println("Имя: " + super.name);
        System.out.println("ID: " + this.ID);
    }



    //methods-----------------------------------------------------------------------------------------------

    private void addExam(){}

    private void takeExam(){}

    private void examInfoTeacher(){}
}
