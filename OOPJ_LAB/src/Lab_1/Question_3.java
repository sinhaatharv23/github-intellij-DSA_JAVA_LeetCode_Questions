package Lab_1;
import java.util.*;
public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day number of the current month (1-31): ");
        int dayNumber = scanner.nextInt();
        if (dayNumber < 1 || dayNumber > 31) {
            System.out.println("Invalid day number! Please enter a value between 1 and 31.");
            return;
        }
        int weekDay = (dayNumber % 7 == 0) ? 7 : dayNumber % 7;
        String day;
        switch (weekDay) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid Day";
        }
        System.out.println("The corresponding weekday is: "+day);

    }
}
