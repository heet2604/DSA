import java.util.*;                                          //Even or Odd
public class functions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int x=sc.nextInt();

        if(isEven(x)){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }

    public static boolean isEven(int n){

          if(n%2==0){
            return true;
          }
          else{
            return false;
          }
    }
}

import java.util.*;                                                  //Number Palindrome

public class functions{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any number");
        int x= sc.nextInt();

        if(isPalindrome(x)){
            System.out.println("The number is a palindrome");
        }  
        else{
            System.out.println("Not a palindrome");
        }
    }

    public static boolean isPalindrome(int num){
        int x=num;        //copied number into variable
        int rev=0;

        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }

        if(num==rev){
            return true;
        }
        else{
            return false;
        }
    }
}


import java.util.*;                                                    //Sum of the digits of a number

public class functions{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num=sc.nextInt();
        int x=summation(num);
        System.out.println("Sum of the digits : " + x);

    }

    public static int summation(int x){
        int sum=0;
        while(x>0){
        int last=x%10;
        sum = sum+last;
        x=x/10;
        }
        return sum;
    }

}
