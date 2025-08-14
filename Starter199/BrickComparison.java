
package Starter199;
import java.util.*;

public class BrickComparison {



class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        for (int i = 0; i < t; i++) {
            int nb = scan.nextInt();
            int[] bs = new int[nb];
            
            for (int j = 0; j < nb; j++) {
                bs[j] = scan.nextInt();
            }
            
            Stack<Integer> st = new Stack<>();
            
            for (int k = 0; k < bs.length; k++) {
                if (st.size() == 0) {
                    st.push(bs[k]);
                } else {
                    if (bs[k] > st.peek()) {
                        st.pop();
                        st.push(bs[k]);
                    }
                }
            }
            
        
            for (int k = 0; k < bs.length; k++) {
                if (bs[k] == st.peek()) {
                    System.out.println(k + 1); 
                    break;
                }
            }
        }
    }
}

    
}
