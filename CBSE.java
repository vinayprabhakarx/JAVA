import java.util.Scanner;

public class CBSE {
    float maths, physics, chemistry, english, hindi, percentage;

    private float getValidInput(String subject) {
        Scanner scanner = new Scanner(System.in);
        float input;

        do {
            System.out.print("Enter marks in " + subject + ": ");
            input = scanner.nextFloat();

            if (input < 0 || input > 100) {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
            }
        } while (input < 0 || input > 100);

        return input;
    }

    private void input() {
        maths = getValidInput("Maths");
        physics = getValidInput("Physics");
        chemistry = getValidInput("Chemistry");
        english = getValidInput("English");
        hindi = getValidInput("Hindi");
    }

    private void calculatePercentage() {
        percentage = ((maths + physics + chemistry + english + hindi) / 500) * 100;
    }

    private void process() {
        if (maths < 30 || hindi < 30 || english < 30 || chemistry < 30 || physics < 30) {
            System.out.println("Sorry, you have failed and your percentage is: " + percentage);
            System.out.println("You have failed in the following subjects:");

            if (maths < 30) {
                System.out.println("Maths");
            }
            if (hindi < 30) {
                System.out.println("Hindi");
            }
            if (english < 30) {
                System.out.println("English");
            }
            if (chemistry < 30) {
                System.out.println("Chemistry");
            }
            if (physics < 30) {
                System.out.println("Physics");
            }
        } else {
            if (percentage >= 60) {
                System.out.println("Congratulations! You are in First Division and your percentage is: " + percentage);
            } else if (percentage >= 50) {
                System.out.println("You are in Second Division and your percentage is: " + percentage);
            } else if (percentage >= 30) {
                System.out.println("You are in Third Division and your percentage is: " + percentage);
            } else {
                System.out.println("Sorry, you have failed and your percentage is: " + percentage);
            }
        }
    }

    public void output() {
        input();
        calculatePercentage();
        process();
    }

    public static void main(String[] args) {
        CBSE cbse = new CBSE();
        cbse.output();
    }
}
