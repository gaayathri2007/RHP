import java.util.*;
class MinMaxPair{
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Scount = 0, Ecount = 0;
    int[] a = new int[N+1];
    for(int i=1; i<=N; i++)
    a[i] = sc.nextInt();
    
    for(int i=1;i<=N;i++){
      if(i == a[i])
       Scount++;
      else if(i == a[a[i]])
       Ecount++;
    }
    System.out.println(Ecount/2 + ( 1L*Scount*(Scount-1)/2));
  }
}