public class strings {
    public static boolean palin(String s){
        int n = s.length();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s="madm";
        if(palin(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}


/*public class strings{
    public static void main(String args[]){
        String fruits[]={"apple","banana","mango"};
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}*/


/*public class strings{
    public static void main(String args[]){
        String str="hi, i am heet";
        System.out.println(Upper(str));
        
    }   
    public static String Upper(String str){
        StringBuilder sb = new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}*/

/*import java.util.*;                                         //total lowercase vowels in a string 
public class strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch == 'a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}*/

/*import java.util.*;                                                           //ANAGRAMS

public class string{
    public static boolean anagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }

        char chararr1[]= str1.toCharArray();
        char chararr2[]=str2.toCharArray();

        Arrays.sort(chararr1);
        Arrays.sort(chararr2);      

        if(Arrays.equals(chararr1,chararr2)){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        String s1 = "race";
        String s2 = "care";
        boolean result = anagram(s1,s2);
        System.out.println(result);
    }
}*/
