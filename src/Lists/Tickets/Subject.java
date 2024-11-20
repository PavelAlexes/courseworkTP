package Lists.Tickets;

import java.util.HashSet;
import java.util.Set;

public class Subject {

    protected String nameOfSubject;
    public static Set<String> arrNameOfSubject = new HashSet<>();
    public static Set<Subject> arrSubject = new HashSet<>();


    //constructors-----------------------------------------------------------------------------------------------

    public Subject(String nameOfSubject) throws Exception {
        setNameOfSubject(nameOfSubject);
    }

    //set-----------------------------------------------------------------------------------------------

    private void setNameOfSubject(String nameOfSubject) throws Exception{
        nameOfSubject = nameOfSubject.trim();
        if(!nameOfSubject.isEmpty() && !nameOfSubject.isBlank()){
            nameOfSubject = nameOfSubject.substring(0, 1).toUpperCase() + nameOfSubject.substring(1);
            this.nameOfSubject = nameOfSubject;
        }else throw new Exception("Некорректное название предмета!");
    }
    //get-----------------------------------------------------------------------------------------------

    public String getNameOfSubject() {
        return nameOfSubject;
    }
}
