import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
  public static void main(String[] args)
  {
    double[] decimals = {3.3, 4.4, 4.64, 6.66, 2.42, 9.58, 2.34};
    String[] words = {"dkafjkds", "fuoaieru", "eqiwruioqwru", "wieqruiosdfnkasdf", "eirqurojaskdfndasktjre", "oreeqwirojdsgiatjo", "iowuerpoiqweroindg", "qwoerigdvfdngoautirue", "aerioqweriajfdndgoafdjoadsiofj", "eroqewprieoprqjkknagklagdjf"};
    int[] numbers = {6, 45, 134, 767, 8, 3, 6, 3, 3454, 7867, 234, 686, 343, 757, 23, 867, 234, 8686, 435, 234, 656, 4234, 6564, 2342, 757, 2323, 3454, 2343, 23423, 4575, 34234, 242};

    System.out.println(sumArray(decimals));
    System.out.println(averageLength(words));
    System.out.println(arrayMax(numbers));
    System.out.println(linearSearch(words, "oreeqwirojdsgiatjo"));
    System.out.println(linearSearch(words, "adsfk45934faksdfjkasjf"));

  }


  public static double sumArray(double[] arr)
  {
    int sum = 0;
    for (double i : arr) {
      sum += i;
    }
    return sum;
  }

  public static double averageLength(String[] arr)
  {
    double average = 0;
    for (int i = 0; i < arr.length; i++) {
      average += arr[i].length();
    }
    return average / arr.length;
  }

  public static int arrayMax(int[] arr)
  {
    int max = Integer.MIN_VALUE;
    for (int i : arr) {
      if (i > max) {
        max = i;
      }
    }
    return max;
  }

  public static boolean linearSearch(String[] arr, String target)
  {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals(target)) {
        return true;
      }
    }
    return false;
  }
}
