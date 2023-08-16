package com.test.a02staticdemo2;

public class ArrayUtil {
  private ArrayUtil(){

  }

  public static String printArr(int[] arr){
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i]);
      if (i == arr.length-1){
        sb.append("]");
      }else {
        sb.append(",");
      }
    }
    return sb.toString();
  }

  public static double getAerage(double[] arr){
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum+=arr[i];
    }
    return sum / arr.length;
  }
}
