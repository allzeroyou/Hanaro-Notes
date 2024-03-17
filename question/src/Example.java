import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // 합
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    // 평균
    double avg = 0;
    avg = (double)sum / a.length;
    System.out.printf("%d, %f", sum, avg);
  }
}
