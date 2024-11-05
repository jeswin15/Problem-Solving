import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of passengers: ");
        int no_of_passengers = sc.nextInt();
        int[] arr = new int[no_of_passengers];

        int totalPrice = 0;


        for (int i = 0; i < no_of_passengers; i++) {
            System.out.print("Enter the age of passenger " + (i + 1) + ": ");
            int age = sc.nextInt();

            int price = 0;

            if (age >= 60) {
                price = 30; // Senior
            } else if (age <= 12) {
                price = 20; // Child
            } else {
                price = 50; // Adult
            }

            
            totalPrice += price;
        }

       
        System.out.println("Total price for all passengers: " + totalPrice);

       
        sc.close();
    }
}
