package Person;

import java.util.Scanner;

public class Administrator extends User{

    //constructors-----------------------------------------------------------------------------------------------

    public Administrator(String name, String sorName, String login, String password, int ID) {
        super(name, sorName, login, password, ID);


    //TEST??????

        boolean flag = true;
        while (flag) {

<<<<<<< HEAD
            System.out.print("1-студент 2-delStud 3-prepod 4-delPrepod 5-Зам. Декана: ");
=======
            System.out.print("1-студент 2-delStud 3-prepod 4-delPrepod 5-Dean 6-delDean: ");
>>>>>>> fbac4df79d7917acd1e6df988218806edbd84e90
            Scanner scanner = new Scanner(System.in);
            String choise = scanner.nextLine();

            switch (choise) {

                case "1": {
                      Student.arrStudent.add(newStudent());
                      System.out.println(Student.arrStudent);
                }
                break;




                case "2": {
                    System.out.print("введите айди студента, которого хотите удалить: ");
                    int idDelStudent = scanner.nextInt();
                    for (Student x : Student.arrStudent){
                        if(x.getID() == idDelStudent){
                            delStudent(x);
                            System.out.println("студент " + x.getName() + " удален!");
                            break;
                        }
                    }

                }
                break;

                case "3":{
                    Teacher.arrTeacher.add(newTeacher());
                    System.out.println(Teacher.arrTeacher);
                }
                break;
<<<<<<< HEAD
                case "4": {
                    System.out.print("введите айди препода, которого хотите удалить: ");
=======

                case "4":{
                    System.out.print("введите айди Препода, которого хотите удалить: ");
>>>>>>> fbac4df79d7917acd1e6df988218806edbd84e90
                    int idDelTeacher = scanner.nextInt();
                    for (Teacher x : Teacher.arrTeacher){
                        if(x.getID() == idDelTeacher){
                            delTeacher(x);
<<<<<<< HEAD
                            System.out.println("студент " + x.getName() + " удален!");
=======
                            System.out.println("препод " + x.getName() + " удален!");
>>>>>>> fbac4df79d7917acd1e6df988218806edbd84e90
                            break;
                        }
                    }
                }
                break;

                case "5":{
                    if(Dean.arrDean.isEmpty()) {
                        Dean.arrDean.add(newDean());
                    }else {
                        System.out.println("Зам. Декан уже создан!");
                    }
                    System.out.println(Dean.arrDean);
                }
                break;

                case "6":{

                    for(Dean x : Dean.arrDean) {
                        Dean.arrDean.clear();
                        System.out.println("Зам. Декан " + x.getName() +" уволен!");
                    }
                }
                break;
            }


        }


    }


    //methods-----------------------------------------------------------------------------------------------

    private Student newStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String nameOfStudent = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String sorNameOfStudent = scanner.nextLine();
        System.out.print("Введите логин: ");
        String loginOfStudent = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String passwordOfStudent = scanner.nextLine();
        System.out.print("Введите группу: ");
        String groupOfStudent = scanner.nextLine();
        System.out.print("Введите ID: ");
        int idOfStudent = scanner.nextInt();

        return new Student(nameOfStudent, sorNameOfStudent, loginOfStudent, passwordOfStudent, groupOfStudent, idOfStudent);
    }

    //-------------------------------------------

    private void delStudent(Student student){
        Student.arrStudent.remove(student);
    }

    //-------------------------------------------

<<<<<<< HEAD
=======
    private void delTeacher(Teacher teacher){
        Teacher.arrTeacher.remove(teacher);
    }

    //-------------------------------------------

>>>>>>> fbac4df79d7917acd1e6df988218806edbd84e90
    private Teacher newTeacher(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String nameOfTeacher = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String sorNameOfTeacher = scanner.nextLine();
        System.out.print("Введите логин: ");
        String loginOfTeacher = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String passwordOfTeacher = scanner.nextLine();
        System.out.print("Введите ID: ");
        int idOfTeacher = scanner.nextInt();


        return new Teacher(nameOfTeacher, sorNameOfTeacher, loginOfTeacher, passwordOfTeacher, idOfTeacher);
    }

    //-------------------------------------------

<<<<<<< HEAD
    private void delTeacher(Teacher teacher){
        Teacher.arrTeacher.remove(teacher);
=======
    private Dean newDean(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String nameOfDean = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String sorNameOfDean = scanner.nextLine();
        System.out.print("Введите логин: ");
        String loginOfDean = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String passwordOfDean = scanner.nextLine();
        System.out.print("Введите ID: ");
        int idOfDean = scanner.nextInt();


        return new Dean(nameOfDean, sorNameOfDean, loginOfDean, passwordOfDean, idOfDean);
>>>>>>> fbac4df79d7917acd1e6df988218806edbd84e90
    }

    //-------------------------------------------

    private void addLesson(){}

    //-------------------------------------------

    private void delLesson(){}





}
