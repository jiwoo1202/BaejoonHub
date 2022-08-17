import java.util.*;
class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int m = sc.nextInt();

    if(m>=45){
      System.out.print(h + " " + (m-45));
    }
    else{
      if(h==0){
        h=24;
        System.out.print(h-1 + " " +(60+m-45));
      }
      else{
        System.out.print(h-1+" " + (60+m-45));
      }
    }
  }
}