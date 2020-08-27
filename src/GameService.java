import java.util.Vector;

class Library extends Game{
    // Constructor
    public Library(Vector<String> myGames) {
        super();
        initGames();
    }

    // Initialize my games
    protected void initGames() {
        Vector<String> myGames = new Vector<String>();
        myGames.add("mario kart");
        myGames.add("just dance 2020");
        myGames.add("fifa20");

        // Create games
        final Game myLib = new Library(myGames);
    }
}

class Store extends Game{
    public Store(Vector myStore) {
        super();
        initGames();
    }

    //Initialize games available in the store
    protected void initGames() {
        Vector<String> myGames = new Vector<>();
        myGames.add("Black Ops 2");
        myGames.add("Fortnite");
        myGames.add("Smash Bross");

        // Create games
        final Game myLib = new Store(myGames);
    }
}