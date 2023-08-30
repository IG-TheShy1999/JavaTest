package test;

import java.util.Scanner;

public class test1 {
  public static void main(String[] args) {
/*
    打印所有五位数的回文数
    int count = 0;
    for (int i = 10000; i < 100000; i++) {
      if (check(i)){
        count++;
        if (count%10==0){
          System.out.println(i);
        }else {
          System.out.print(i + " ");
        }
      }
    }
    System.out.println(count);
*/


//    判断一个数是否为回文数
    Scanner s = new Scanner(System.in);
    System.out.println("please enter a number");
    int num = s.nextInt();
    boolean flag = true;

    String str = Integer.toString(num);
    char[] arr = str.toCharArray();

    for (int i = 0; i < arr.length/2; i++) {
      if (arr[i]!=arr[arr.length-1-i]) {
        flag = false;
        System.out.println("num isn't a circle number");
        break;
      }
    }
    if (flag){
      System.out.println("num is a circle number");
    }



  }

//  public static boolean check(int num){
//      return (num/10000 == num%10) && ((num%10000)/1000  == (num%100)/10);
//  }
}
