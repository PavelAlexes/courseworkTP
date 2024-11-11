package Person;

import Interfaces.UserInterface;

public abstract class User implements UserInterface {
    protected String name;
    protected String sorName;
    protected int ID;
    protected String login;
    protected int password;

    @Override
    public void logIn() {
        System.out.println("hi");
    }

    @Override
    public void logOut() {

    }

    @Override
    public void registration() {

    }
}
