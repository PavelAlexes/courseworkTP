package Person;

import Lists.Groups.Group;

import java.util.HashSet;
import java.util.Objects;
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
                    addStudent(Student.arrStudent, nameOfStudent,sorNameOfStudent,loginOfStudent,passwordOfStudent,groupOfStudent,idOfStudent);

//
//                    Student.arrStudent.add(newStudent());
//                    System.out.println(Student.arrStudent);
//                    System.out.println(Student.arrStudent.size());
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
                    Teacher.arrTeacher.add(newTeacher());
                    System.out.println(Teacher.arrTeacher);
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

    public void addStudent(HashSet<Student> set, String name, String surName, String login, String password, String group, int ID) throws Exception {
        if (set.isEmpty() || set.contains(null)){
            set.add(new Student(name, sorName, login, password, group, ID));
        }else{
            for(Student x : Student.arrStudent){
                if(x.getID() == ID){
                    System.out.println("такой id уже есть!");
                } else if(Objects.equals(x.getLogin(), login)){
                    System.out.println("такой login уже есть!");
                }else if(!Group.arrNameOfGroup.contains(group)){
                    System.out.println("такой Group НЕ СУЩЕСТВУЕТ!");
                }else Student.arrStudent.add(new Student(name, sorName, login, password, group, ID));




            }
        }
    }

//    private Student newStudent() throws Exception {
//
//
//
//        return new Student(nameOfStudent, sorNameOfStudent, loginOfStudent, passwordOfStudent, groupOfStudent, idOfStudent);
//    }

    //-------------------------------------------

    private void delStudent (Student student){
        Student.arrStudent.remove(student);
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
        System.out.print("Введите логин: ");
        String loginOfTeacher = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String passwordOfTeacher = scanner.nextLine();
        System.out.print("Введите ID: ");
        int idOfTeacher = scanner.nextInt();


        return new Teacher(nameOfTeacher, sorNameOfTeacher, loginOfTeacher, passwordOfTeacher, idOfTeacher);
    }

    //-------------------------------------------



        private Dean newDean () throws Exception {
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