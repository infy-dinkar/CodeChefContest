package Starter199;
import java.util.*;

public class FenceColoring {

    


class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0; i < T; i++){
            int N = scan.nextInt();
            int[] arr = new int[N];
            for(int j = 0; j < N; j++){
                arr[j] = scan.nextInt();
            }
            
            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int j = 0; j < N; j++){
                if(hm.containsKey(arr[j])){
                    hm.put(arr[j], hm.get(arr[j]) + 1);
                } else {
                    hm.put(arr[j], 1);
                }
            }
            
            int fr_1 = 0;
            int maxfreq = 0;
            for(int j = 0; j < N; j++){
                int val = arr[j];
                int freq = hm.get(val);
                if(val == 1){
                    fr_1 = freq;
                }
                if(freq > maxfreq){
                    maxfreq = freq;
                }
            }
            
            int option1 = 1 + (N - maxfreq);
            int option2 = N - fr_1;
            int result = Math.min(option1, option2);
            System.out.println(result);
        }
    }
}

    
}
