import java.util.*;
import java.lang.*;
import java.io.*;
public class GoodSequence {


class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        while (T > 0) {
            int n = scan.nextInt();
            int [] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            int length = 1;

            for (int i = 1; i < n; i++) {
                if (arr[i] % 2 != arr[i-1] % 2) {
                    length++;
                }
            }

            System.out.println(length);
            T--;
        }
    }
}

    
}
