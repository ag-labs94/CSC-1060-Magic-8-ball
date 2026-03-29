import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Magic Eight Ball");
        String eightBallArt = "        .-\"\"\"\"-.\n" +
                "      .'  .--.  '.\n" +
                "     /   /    \\   \\\n" +
                "    ;   |  ()  |   ;\n" +
                "    |   |  /\\  |   |\n" +
                "    ;   |  \\/  |   ;\n" +
                "     \\   \\    /   /\n" +
                "      '.  '--'  .'\n" +
                "        '-.__.-'";
        System.out.println(eightBallArt);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What question would you like to ask the Oracle?");

            String userInput = scanner.nextLine();

            System.out.println("You asked...... " + userInput);

            String eightBallAnswer = getMagic8BallAnswer();
            System.out.println(eightBallAnswer);
        }
    }

    private static String getMagic8BallAnswer() {
        String[] magicEightBallResponses = {
                "It is certain",
                "It is decidedly so",
                "Without a doubt",
                "Yes definitely",
                "You may rely on it",
                "As I see it, yes",
                "Most likely",
                "Outlook good",
                "Yes",
                "Signs point to yes",
                "Reply hazy, try again",
                "Ask again later",
                "Better not tell you now",
                "Cannot predict now",
                "Concentrate and ask again",
                "Don't count on it",
                "My reply is no",
                "My sources say no",
                "Outlook not so good",
                "Very doubtful"
        };

        int lookupValue = getRandomLookup(magicEightBallResponses);
        System.out.println("Lookup value: " + lookupValue);

        return magicEightBallResponses[lookupValue];
    }

    private static int getRandomLookup(String[] responses) {
        Random random = new Random();
        return random.nextInt(responses.length);
    }
}