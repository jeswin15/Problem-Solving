//Question
//Naveen Kumar is ordering food in menucard. In menucard below items are listed.

//Pizza -  200
//Burger -  150
//Biriyani - 250
//Dosa - 80
//Idly - 50

//Calculate the quantity of the items and display if the total price is exceeds more than 500, if yes discount applicable for 10%.
//Finally after the discount display the proper total price.



import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Items Available:");
        System.out.println("1. Pizza = 200");
        System.out.println("2. Burger = 180");
        System.out.println("3. Biryani = 250");
        System.out.println("4. Dosa = 80");
        System.out.println("5. Idly = 50");
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number of items:");
        int no_of_items = sc.nextInt();
        int[] arr = new int[no_of_items];
        int totalCost = 0;
        for (int i = 0; i < no_of_items; i++) {
            System.out.print("Enter the choice for item " + (i + 1) + " (1-5):");
            arr[i] = sc.nextInt(); 
            
            if (arr[i] < 1 || arr[i] > 5) {
                System.out.println("Invalid choice! Please choose between 1 and 5.");
                i--;
                continue;
            }

           
            System.out.print("Enter quantity for item " + (i + 1) + ":");
            int quantity = sc.nextInt();
            
            
            int price = 0;
            switch (arr[i]) {
                case 1:
                    price = 200; // Pizza
                    break;
                case 2:
                    price = 180; // Burger
                    break;
                case 3:
                    price = 250; // Biryani
                    break;
                case 4:
                    price = 80;  // Dosa
                    break;
                case 5:
                    price = 50;  // Idly
                    break;
            }
            
            // Calculate and add the cost to the total cost
            totalCost += price * quantity;
        }
        
       
        System.out.println("Total cost of your order: " + totalCost);
        if(totalCost <500){
             System.out.println("YOU ARE NOT ELIGIBLE FOR DISCOUNT ");
        }
       else{
           totalCost=(totalCost-(totalCost/100)*10);
            System.out.println("10% DISCOUNT Available ");
             System.out.println("Total cost of items: "+totalCost);
       }
        sc.close();
       }
    }
