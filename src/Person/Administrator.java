package Person;

import java.util.Scanner;

public class Administrator extends User{

    private String name = null;
    private String sorName = null;
    private String login = null;
    private String password = null;
    private int ID = 0;

    public Administrator(String name, String sorName, String login, String password) {
        super(name, sorName, login, password);



        boolean flag = true;
        while (flag) {

            System.out.print("1-студент 2-преподаватель 3-Зам. Декана 4-дисциплину: ");
            Scanner scanner = new Scanner(System.in);
            String choise = scanner.nextLine();

            switch (choise) {

                case "1": {

                    int idOfStudent = User.ID++;
                    System.out.print("Введите имя:");
                    String nameOfStudent = scanner.nextLine();
                    System.out.print("Введите фамилию:");
                    String sorNameOfStudent = scanner.nextLine();
                    System.out.print("Введите логин:");
                    String loginOfStudent = scanner.nextLine();
                    System.out.print("Введите пароль:");
                    String passwordOfStudent = scanner.nextLine();
                    System.out.print("Введите группу:");
                    String groupOfStudent = scanner.nextLine();

                    Student student = new Student(nameOfStudent, sorNameOfStudent, loginOfStudent, passwordOfStudent, groupOfStudent, idOfStudent);


                }
                break;




                case "2": {

                    int idOfTeacher = User.ID++;
                    System.out.print("Введите имя:");
                    String nameOfTeacher = scanner.nextLine();
                    System.out.print("Введите фамилию:");
                    String sorNameOfTeacher = scanner.nextLine();
                    System.out.print("Введите логин:");
                    String loginOfTeacher = scanner.nextLine();
                    System.out.print("Введите пароль:");
                    String passwordOfTeacher = scanner.nextLine();


                    Teacher teacher = new Teacher(nameOfTeacher, sorNameOfTeacher, loginOfTeacher, passwordOfTeacher, idOfTeacher);

                }


            }


        }


    }



    private void addStudent(String name, String sorName, String login, String password){



    }

    private void delStudent(){}

    private void addTeacher(){}

    private void delTeacher(){}

    private void addLesson(){}

    private void delLesson(){}





}
