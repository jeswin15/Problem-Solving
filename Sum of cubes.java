import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of M: ");
        int m = sc.nextInt();
         System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int sum=0;
        if(m>=n){
            
            System.out.print("The value of N is greater than M.so it is 0 ");
        }
        else{
            for(int i=m;i<=n;i++){
                sum+=i*i*i;       
            }
        System.out.print("Enter the value of N: "+sum);    
        }
       

        sc.close();
    }
}
