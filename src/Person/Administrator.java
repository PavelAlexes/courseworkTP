package Person;

import Lists.Groups.Group;

import java.util.Scanner;

public class Administrator extends User{

    //constructors-----------------------------------------------------------------------------------------------

    public Administrator(String name, String sorName, String login, String password, int ID) throws Exception {
        super(name, sorName, login, password, ID);


        //TEST??????

        boolean flag = true;
        while (flag) {

            System.out.print("1-студент 2-delStud 3-prepod 4-delPrepod 5-Dean 6-delDean 7-addGroup: ");
            Scanner scanner = new Scanner(System.in);
            String choise = scanner.nextLine();

            switch (choise) {

                case "1": {
                    try {
                        Student.arrStudent.add(newStudent());
                        System.out.println(Student.arrStudent);
                        System.out.println(User.arrLogin);
                        System.out.println(User.arrID);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                break;


                case "2": {
                    System.out.print("введите айди студента, которого хотите удалить: ");
                    int idDelStudent = scanner.nextInt();
                    for (Student x : Student.arrStudent) {
                        if (x.getID() == idDelStudent) {
                            delStudent(x);
                            System.out.println("студент " + x.getName() + " удален!");
                            break;
                        }
                    }

                }
                break;

                case "3": {
                    try {
                        Teacher.arrTeacher.add(newTeacher());
                        System.out.println(Teacher.arrTeacher);
                        System.out.println(User.arrLogin);
                        System.out.println(User.arrID);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());;
                    }

                }
                break;

                case "4": {
                    System.out.print("введите айди Препода, которого хотите удалить: ");
                    int idDelTeacher = scanner.nextInt();
                    for (Teacher x : Teacher.arrTeacher) {
                        if (x.getID() == idDelTeacher) {
                            delTeacher(x);
                            System.out.println("препод " + x.getName() + " удален!");
                            break;
                        }
                    }
                }
                break;

                case "5": {
                    if (Dean.arrDean.isEmpty()) {
                        Dean.arrDean.add(newDean());
                    } else {
                        System.out.println("Зам. Декан уже создан!");
                    }
                    System.out.println(Dean.arrDean);
                }
                break;

                case "6": {

                    for (Dean x : Dean.arrDean) {
                        Dean.arrDean.clear();
                        System.out.println("Зам. Декан " + x.getName() + " уволен!");
                    }
                }
                break;

                case "7":{
                    addGroup();

                }
                break;
            }
        }
    }

    //methods-----------------------------------------------------------------------------------------------

    private String checkLogin(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();

        login = login.trim();

        if (User.arrLogin.contains(login)){
            System.out.println("Такой логин существует!");
            login = checkLogin();
        }

        return login;
    }

    //-------------------------------------------

    private Integer checkID(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ID: ");
        Integer id = scanner.nextInt();

        if (User.arrID.contains(id)){
            System.out.println("Такой ID существует!");
            id = checkID();
        }

        return id;
    }

    //-------------------------------------------

    private Student newStudent() throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String nameOfStudent = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String sorNameOfStudent = scanner.nextLine();
        String loginOfStudent = checkLogin();
        System.out.print("Введите пароль: ");
        String passwordOfStudent = scanner.nextLine();
        System.out.print("Введите группу: ");
        String groupOfStudent = scanner.nextLine();
        int idOfStudent = checkID();

        Student student = new Student(nameOfStudent, sorNameOfStudent, loginOfStudent, passwordOfStudent, groupOfStudent, idOfStudent);
        User.arrLogin.add(loginOfStudent);
        User.arrID.add(idOfStudent);

        return student;
    }

    //-------------------------------------------

    private void delStudent (Student student){
        Student.arrStudent.remove(student);
        User.arrID.remove(student.getID());
        User.arrLogin.remove(student.getLogin());
        System.out.println(User.arrID);
        System.out.println(User.arrLogin);
    }

    //-------------------------------------------

    private void delTeacher (Teacher teacher){
        Teacher.arrTeacher.remove(teacher);
    }

    //-------------------------------------------

    private Teacher newTeacher () throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String nameOfTeacher = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String sorNameOfTeacher = scanner.nextLine();
        String loginOfTeacher = checkLogin();
        System.out.print("Введите пароль: ");
        String passwordOfTeacher = scanner.nextLine();
        int idOfTeacher = checkID();

        Teacher teacher = new Teacher(nameOfTeacher, sorNameOfTeacher, loginOfTeacher, passwordOfTeacher, idOfTeacher);
        User.arrLogin.add(loginOfTeacher);
        User.arrID.add(idOfTeacher);

        return teacher;
    }

    //-------------------------------------------

        private Dean newDean () throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите имя: ");
            String nameOfDean = scanner.nextLine();
            System.out.print("Введите фамилию: ");
            String sorNameOfDean = scanner.nextLine();
            String loginOfDean = checkLogin();
            System.out.print("Введите пароль: ");
            String passwordOfDean = scanner.nextLine();
            int idOfDean = checkID();

            Dean dean = new Dean(nameOfDean, sorNameOfDean, loginOfDean, passwordOfDean, idOfDean);
            User.arrLogin.add(loginOfDean);
            User.arrID.add(idOfDean);

            return dean;
        }

        //-------------------------------------------

    private void addGroup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название группы: ");
        String nameOfGroup = scanner.nextLine();
        Group group = new Group(nameOfGroup);

    }

        //-------------------------------------------

    private void addLesson () {
        }

        //-------------------------------------------

        private void delLesson () {
        }





}