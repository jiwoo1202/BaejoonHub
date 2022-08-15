import java.util.*;
class Main {
  public static void main(String[] args) {
  
    Scanner scan = new Scanner(System.in);
    int[] pices = {1,1,2,2,2,8};

    for(int i=0;i<6;i++){
       int a = scan.nextInt();
        int result = pices[i] - a;
      System.out.print(result + " ");
    }
  }
}