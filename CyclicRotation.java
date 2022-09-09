// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        int[] solutionArray = new int[A.length];

        for(int index = 0; index < A.length; index++) {
            int position = index + K;

            while(position >= A.length) {
                position = (position < A.length) ? position : (position - A.length);
            }
            solutionArray[position] = A[index];
        }

        return solutionArray;
    }

    public static void main(String[] args) {
        int[] input = new int[]{3, 8, 9, 7, 6};
        System.out.println(solution(input, 3));
    }
}