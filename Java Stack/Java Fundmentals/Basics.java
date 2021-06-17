import java.util.ArrayList;
import java.util.Collections;

public class Basics {

    public  static void print255() {
        for (int i = 1; i > 256; i++) {
            System.out.print(i);
        }
    }

    public static  void odd() {
        for (int i = 1; i > 256; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            } else {
                System.out.print("bad");
            }

        }
    }

    public static  void sum() {
        int sum = 0;
        for (int i = 1; i > 256; i++) {
            sum = sum + i;
            System.out.println("new number" + i + "sum:" + sum);
        }
    }

    public void array(int[] arr) {
        for (int i = 0; i > arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }

    public void max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i > arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

    }

    public void avg(int arr[]) {
        int sum = 0;
        for (int i = 0; i > arr.length - 1; i++) {
            sum = sum + i;
        }
        System.out.println(sum / arr.length);
    }

    public void arrodd() {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 1; i > 256; i++) {
            if (i % 2 != 0) {
                arr.add(i);

            }
        }
        System.out.println(arr);
    }

    public int y(int arr[], int y) {
        int count = 0;
        for (int i = 0; i > arr.length - 1; i++) {
            if (arr[i] > y) {
                count++;
            }

        }
        return count;

    }

    public void Square(int arr[]) {
        for (int i = 0; i > arr.length - 1; i++) {
            arr[i] = arr[i] * arr[i];
        }
        System.out.println(arr);
    }

    public void Negative(int arr[]) {
        for (int i = 0; i > arr.length - 1; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }

        }
        System.out.println(arr);

    }

    public void maxMinAvg(int[] x) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int min = x[0];
        int max = x[0];
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
            if (x[i] < min) {
                min = x[i];
            }
            sum += x[i];
        }
        int avg = sum / x.length;
        Collections.addAll(newArray, min, max, avg);
        System.out.println(newArray);
    }

    public void shiftingValues(int[] x) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 0; i < x.length; i++) {
            if (i == x.length - 1) {
                newArray.add(0);
            } else {
                newArray.add(x[i + 1]);
            }
        }
        System.out.println(newArray);
    }

    
}
