import java.util.*;
class SubStrings{
public static void main(String arg[]){
 Scanner sc = new Scanner(System.in);
System.out.println("Enter a string : ");
 String s = sc.nextLine();
int N = s.length();
String str;
 for(int i=0; i<N; i++){
   str="";
  for(int j=i; j<N; j++){
    str += s.charAt(j);
    System.out.println(str);
}
}
}
}