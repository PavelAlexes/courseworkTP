package Person;

import Interfaces.UserInterface;

public abstract class User implements UserInterface {
    protected String name;
    protected String sorName;
    protected static int ID;
    protected String login;
    protected String password;


    //methods-----------------------------------------------------------------------------------------------

    @Override
    public void logIn() {
        System.out.println("hi");
    }

    @Override
    public void logOut() {

    }

    @Override
    public void registration(String name, String sorName, String login, String password) {

    }

    //constructors-----------------------------------------------------------------------------------------------

    User(String name, String sorName, String login, String password){
        setName(name);
        setSorName(sorName);
        setLogin(login);
        setPassword(password);
    }

    //set-----------------------------------------------------------------------------------------------

    public void setName(String name) {
        name = name.trim();
        if(!name.isEmpty() && !name.isBlank()){
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
            this.name = name;
        }
    }

    public void setSorName(String sorName) {
        sorName = sorName.trim();
        if(!sorName.isEmpty() && !sorName.isBlank()){
            sorName = sorName.substring(0, 1).toUpperCase() + sorName.substring(1);
            this.sorName = sorName;
        }
    }

    public void setLogin(String login) {
        login = login.trim();
        if(!login.isBlank() && (login.length() > 3 && login.length() < 11)){
            this.login = login;
        }
    }

    public void setPassword(String password) {
        if(!password.isBlank() && (password.length() > 3 && password.length() < 11)) {
            this.password = password;
        }
    }

    //get-----------------------------------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public String getSorName() {
        return sorName;
    }

    public int getID() {
        return ID;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
