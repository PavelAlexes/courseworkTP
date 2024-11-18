package Lists.Tickets;

public abstract class Subjects {

    protected String nameOfSubject;


    private void setNameOfSubject(String nameOfSubject) {
        nameOfSubject = nameOfSubject.trim();
        if(!nameOfSubject.isEmpty() && !nameOfSubject.isBlank()){
            nameOfSubject = nameOfSubject.substring(0, 1).toUpperCase() + nameOfSubject.substring(1);
            this.nameOfSubject = nameOfSubject;
        }
    }


}
