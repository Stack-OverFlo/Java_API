import java.util.Vector;

class Library extends Game{
    private Vector libGames = new Vector();

    // Constructor
    public Library(Vector myGames) {
        super();
        this.libGames = myGames;
    }

    protected void addGames() {

    }

    protected void displayGames() {
        System.out.println(libGames);
    }

    protected void removeGames() {

    }

}

class Store extends Game{

    private Vector storeGames = new Vector();

    // Constructor
    public Store(Vector myStore) {
        super();
        this.storeGames = myStore;
    }

    protected void addGames() {

    }

    protected void displayGames() {
        System.out.println(storeGames);
    }

    protected void removeGames() {

    }

}