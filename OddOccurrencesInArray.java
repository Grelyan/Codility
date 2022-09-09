public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        int result = A[0];

        for(int i=1; i<A.length; i++){
            System.out.println(result+" "+A[i]);
            result ^= A[i];
        }

        return result;
    }

    public static int solution2(int[] A) {
        int[] temporalArray = A;
        int unpair = 0;

        for(int elementTemp : temporalArray) {
            boolean status = false;

            for(int orig : A) {
                if(!status) {
                    status = (elementTemp == orig);
                    break;
                }
            }

            if(!status) {
                unpair = elementTemp;
            }
        }

        return unpair;

        /*int unpair=0;
        for(int item : A) {
            unpair ^= item;
        }

        return unpair;*/
    }

    public static void main(String[] args) {
        int[] input = new int[]{9,3,9,3,9,7,9};
        System.out.println(solution2(input));
    }
}
