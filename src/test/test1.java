package test;

public class test1 {
  public static void main(String[] args) {
    int count = 0;
    for (int i = 10000; i < 100000; i++) {
      if (check(i)){
        count++;
        if (count%5==0){
          System.out.println(i);
        }else {
          System.out.print(i + " ");
        }
      }
    }
    System.out.println(count);

  }

  public static boolean check(int num){
      return (num/10000 == num%10) && ((num%10000)/1000  == (num%100)/10);
  }
}
