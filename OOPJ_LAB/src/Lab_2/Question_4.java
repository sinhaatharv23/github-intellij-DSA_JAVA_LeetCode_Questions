package Lab_2;

public class Question_4 {
    public static void main(String[] args) {
        // Create objects of the class
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Display the number of objects created
        System.out.println("Number of objects created: " + ObjectCounter.count);
    }
}

class ObjectCounter {
    static int count = 0; // Static variable to track the number of objects

    // Constructor increments the count whenever an object is created
    public ObjectCounter() {
        count++;
        System.out.println(count);
    }
}