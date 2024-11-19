package Person;

import Interfaces.UserInterface;

import java.util.HashSet;
import java.util.Set;

public abstract class User implements UserInterface {
    protected String name;
    protected String sorName;
    protected int ID;
    protected String login;
    protected String password;
    public static Set<Integer> arrID = new HashSet<>();
    public static Set<String> arrLogin = new HashSet<>();

    //constructors-----------------------------------------------------------------------------------------------

    User(String name, String sorName, String login, String password, int ID) throws Exception {
        setName(name);
        setSorName(sorName);
        setLogin(login);
        setPassword(password);
        setID(ID);
    }

    //methods-----------------------------------------------------------------------------------------------

    @Override
    public void logIn() {
        System.out.println("hi");
    }
    //-------------------------------------------
    @Override
    public void logOut() {

    }
    //-------------------------------------------
    @Override
    public void registration(String name, String sorName, String login, String password) {

    }

    //set-----------------------------------------------------------------------------------------------

    private void setName(String name) {
        name = name.trim();
        if(!name.isEmpty() && !name.isBlank()){
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
            this.name = name;
        }
    }
    //-------------------------------------------

    private void setSorName(String sorName) {
        sorName = sorName.trim();
        if(!sorName.isEmpty() && !sorName.isBlank()){
            sorName = sorName.substring(0, 1).toUpperCase() + sorName.substring(1);
            this.sorName = sorName;
        }
    }
    //-------------------------------------------

    private void setLogin(String login) throws Exception{
        login = login.trim();
        if(!login.isBlank() && (login.length() > 3 && login.length() < 11)){
            this.login = login;
        }else if(login.length() <= 3) {
            throw new Exception("логин короткий!");
        }else throw new Exception("логин длинный!");
    }
    //-------------------------------------------

    private void setPassword(String password) {
        if(!password.isBlank() && (password.length() > 3 && password.length() < 11)) {
            this.password = password;
        }
    }

    //-------------------------------------------

    private void setID(Integer ID) {
        this.ID = ID;
    }

    //get-----------------------------------------------------------------------------------------------

    public String getName() {
        return name;
    }
    //-------------------------------------------
    public String getSorName() {
        return sorName;
    }

    public int getID() {
        return ID;
    }
    //-------------------------------------------
    public String getLogin() {
        return login;
    }
    //-------------------------------------------
    public String getPassword() {
        return password;
    }
}
