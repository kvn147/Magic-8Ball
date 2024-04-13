import java.awt.*;
import java.util.*;

/*
 * Kevin Nguyen
 * 04/16/2024
 * Randomizes and returns the messages the Magic Eight Ball can give.
 * Uses toString to return all possible messages.
 */

public class MagicEightBall extends Ball {

    private String[] messages; // null


    public MagicEightBall(Color color, int size, String[] messages) {
        // Ball(color, size), Super call is ALWAYS the first line in the constructor
        super(color, size);

        this.messages = messages;
    }

    public int getTotalMessages() {
        return messages.length;
    }

    public String getMessage(int index) {
        return messages[index];
    }

    public String shake() {
        // generate random index number for messages array
        int index = new Random().nextInt(getTotalMessages());

        // return message at the index generated
        return getMessage(index);
    }

    @Override
    public String toString() {
        return "MagicEightBall Messages: " +
                Arrays.toString(messages) +
                " " + super.toString();
    }

}
