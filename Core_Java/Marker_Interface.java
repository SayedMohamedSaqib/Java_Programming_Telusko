
import java.io.*;

// MARKER INTERFACE USED HERE
// This class is "allowed" to be serialized
class GameState implements Serializable {
    int level;
    int health;

    GameState(int level, int health) {
        this.level = level;
        this.health = health;
    }
}

// NOT marked Serializable → cannot be saved
class EnemyAI {
    int difficulty = 5;
}

public class Marker_Interface  {
    public static void main(String[] args) {

        // ---------- SERIALIZATION ----------
        try {
            GameState state = new GameState(5, 80);

            FileOutputStream fos = new FileOutputStream("save.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(state);  //  Works because of Serializable
            oos.close();

            System.out.println("Game saved!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        // ---------- DESERIALIZATION ----------
        try {
            FileInputStream fis = new FileInputStream("save.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            GameState loaded = (GameState) ois.readObject();
            ois.close();

            System.out.println("Game loaded!");
            System.out.println("Level: " + loaded.level);
            System.out.println("Health: " + loaded.health);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // ---------- TRYING WITHOUT MARKER INTERFACE ----------
        try {
            EnemyAI enemy = new EnemyAI();

            FileOutputStream fos = new FileOutputStream("enemy.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(enemy);  // ❌ This will FAIL
            oos.close();

        } catch (Exception e) {
            System.out.println("\nError while saving EnemyAI:");
            e.printStackTrace();
        }
    }
}
