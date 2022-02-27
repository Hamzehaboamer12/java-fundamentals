
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class Main {

    public static void main(String args[]) {
        //System.out.println("Hello World!");
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 20;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipHeads(2);
        clock();

    }

    public static void clock() {
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            while (second == LocalDateTime.now().getSecond()) {
                continue;
            }
            System.out.println(time);
        }
    }

    public static String pluralize(String name, int count) {
        if (count == 1) {
            return name;
        } else {
            return name + "s";
        }
    }

    public static void flipHeads(int n) {
        int counter = 0;
        int headsCounter = 0;

        while (headsCounter < n) {
            Random random = new Random();
            if (random.nextDouble() < 0.5) {

                counter++;
                headsCounter = 0;
                System.out.println("tail");

            } else {
                counter++;
                headsCounter++;
                System.out.println("heads");

            }

        }

        System.out.println("It took " + counter + " flips to flip " + n + " heads in a row.");

    }
}


