import java.awt.*;
import java.util.*;

/*
 * Kevin Nguyen
 * 04/13/2024
 * Creates a Magic 8 Ball with messages.
 * Prints 5 messages, and then all possible messages
 */

public class Driver {
    public static void main(String[] args) {

        /*
        Ball ball = new Ball(Color.RED, 3);

        // call toString() automatically
        System.out.println(ball);

        // declare an array of Ball objects
        Ball[] ballArray = {
                new Ball(Color.GRAY, 10),
                new Ball(Color.BLUE, 5)
        };

        // this object ballArray[0] size = 10 GRAY
        // other object passing ballArray[1] size = 5 BLUE
        int result = ballArray[0].compareTo(ballArray[1]);
        System.out.println("Result " + result);

        // sort method in the Arrays to put in order
        Arrays.sort(ballArray);
        System.out.println(Arrays.toString(ballArray));
        */

        MagicEightBall ball8 = new MagicEightBall(Color.RED, 12,
                new String[]{"yes", "no", "maybe", "definitely not", "without a doubt",
                        "most likely", "signs point to yes", "outlook bad"});

        for (int i = 0; i < 5; i++) {
            System.out.println("Shaking Magic Eight Ball...");
            System.out.println("The ball says: " + ball8.shake());
            System.out.println();
        }

        System.out.println(ball8);
    }
}

/*
Output:
Shaking Magic Eight Ball...
The ball says: signs point to yes

Shaking Magic Eight Ball...
The ball says: maybe

Shaking Magic Eight Ball...
The ball says: most likely

Shaking Magic Eight Ball...
The ball says: without a doubt

Shaking Magic Eight Ball...
The ball says: without a doubt

MagicEightBall Messages: [yes, no, maybe, definitely not, without a doubt,
most likely, signs point to yes, outlook bad] Ball Color: [red = 255 green = 0 blue = 0]
Ball size: 12 inches
 */