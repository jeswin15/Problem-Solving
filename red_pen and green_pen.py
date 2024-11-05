import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of digits to be written");
        int no_of_items = sc.nextInt();
        if (no_of_items < 2) {
            System.out.println("Array needs at least two elements for comparison.");
            sc.close();
            return;
        }
        int arr[] = new int [no_of_items];
        for(int i=0;i<no_of_items;i++)
        {
            System.out.println("Enter the Number");
            int new_val = sc.nextInt();
            arr[i]=new_val;
        }
        
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]%2!=0 && arr[i+1]%2==0){
                count +=1;
                
            }
        }
        
        System.out.println("The swap count from green pen to red pen : "+count);
    }
