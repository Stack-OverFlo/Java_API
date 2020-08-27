import java.util.Vector;

public class Friend<Vector> {

    protected Vector name;

    public Friend(Vector name) {
    };

    protected void initFriends() {
        // Create friends
        final Friend floriane = new Friend( "StackOverFlo");
        final Friend gael = new Friend( "Gael42");
        final Friend toto  = new Friend( "Toto");
    }
}