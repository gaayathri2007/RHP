import java.util.*;
class Panagram{
    public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int f = 0;
    System.out.println("Enter a string : ");
    String s = sc.nextLine().toLowerCase();

    if(s.length() < 26){
        System.out.println("False");
        return;
    }
    else 
      for(char ch = 'a' ; ch <= 'z'; ch++){
        if(s.contains(""+ch)){     // we can also either use ("" + ch) or  use String.value(ch) to convert char ch into string
         f = 1;
         continue;
        }
        else{
            f = 0;
            break;
        }
      }
      if(f == 0)
      System.out.println("False");
      else
      System.out.println("True");
}
}