import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int h = sc.nextInt();
    int m1 = sc.nextInt();
    int m2 = sc.nextInt();
    
    
    if(m1+m2<60){
      System.out.println(h+" " + (m1+m2));
    }
    else if(m1+m2>=60){
      int x= h+((m1+m2)/60);
      if(x>=24){
        int y = x-24;
        System.out.println(y + " " +((m1+m2)%60));}
      else{
        System.out.println(x + " " + ((m1+m2)%60));
      }
      }
    }
}    
    
