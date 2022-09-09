// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class BinaryGap {
    public static int solution(int N) {
        String binaryInput=Integer.toBinaryString(N);
        List<String> gaps = new ArrayList<>();
        int maxGap = 0;

        if(N>0) {
            Collections.addAll(gaps,binaryInput.split("1"));

            if(binaryInput.substring(binaryInput.length()-1).equals("0")) {
                gaps.remove(gaps.size()-1);
            }
            for(String gap : gaps){
                maxGap = (maxGap < gap.length()) ? gap.length() : maxGap;
            };
        }

        return maxGap;
    }

    public static void main(String[] args) {

        System.out.println(solution(328));
    }
}