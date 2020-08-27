import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Create games in my library
        Vector<String> myLib = new Vector<>();
        myLib.add("Black Ops 2");
        myLib.add("Fortnite");
        myLib.add("Smash Bross");

        // Create games in the Store
        Vector<String> myStore = new Vector<>();
        myStore.add("Mario Kart");
        myStore.add("Just Dance 2020");
        myStore.add("Fifa20");

        // Create friends
        Vector<String> myFriends = new Vector<>();
        myFriends.add("StackOverFlo");
        myFriends.add("Gael");
        myFriends.add("Toto");

        Store store = new Store(myStore);
        Library lib = new Library(myLib);
        Friend friends = new Friend(myFriends);
        friends.displayFriends();
        store.displayGames();
        lib.displayGames();
    }
}
