//Question
//Consider two Integers m and n. Calculate the product of the squares of the integer values m to n. If m is greater than n return 0 or display the proper message.


import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of M: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int product=1;
        if(m>=n){
            
            System.out.print("The value of N is greater than M.so it is 0 ");
        }
        else{
            for(int i=m;i<=n;i++){
                product=product*i;       
            }
        System.out.print("product of integers: "+product);    
        }
       

        sc.close();
    }
}