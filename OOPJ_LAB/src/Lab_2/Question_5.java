package Lab_2;
import java.util.ArrayList;
import java.util.Scanner;
public class Question_5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter your numbers or 'q' to quit :");

        while(true){
            String input = sc.nextLine();
            if(input.equals("q")){
                break;
            }
            int number = Integer.parseInt(input);
            numbers.add(number);
        }
        for (int i = 0; i < numbers.size(); i++){

        }
        System.out.println("Your Entered numbers are :" +numbers);

    }
}