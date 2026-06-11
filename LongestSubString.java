import java.util.*;
class LongestSubString{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
System.out.println("Enter two strings : ");
  String s1 = sc.next();
  String s2 = sc.next();
int r = s2.length();
int c = s1.length();

int[][] a = new int[r][c];

int max = 0;
int pos=0;

for(int i = 0; i < r; i++){
for(int j = 0; j < c; j++){
 if(s2.charAt(i) == s1.charAt(j) && (i == 0 || j == 0))
   a[i][j]++;
else if(s2.charAt(i) == s1.charAt(j))
  a[i][j] = a[i-1][j-1] + 1;

if(a[i][j] > max)
{
max = a[i][j];
pos=i;
}
}
}
System.out.println(s2.substring(pos - max + 1 , pos + 1));
}
}