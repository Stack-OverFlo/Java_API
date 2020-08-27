import java.util.Vector;

public class Friend {

    protected Vector name;

    public Friend(Vector name) {
        this.name = name;
    };

    public void displayFriends() {
        System.out.println(name);
    }

}