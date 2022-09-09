public class PermMissingElem {
    public int solution(int[] A) {
        int money = 0;
        int persons = A.length +1;
        int assistants = (persons * (persons+1) / 2);

        for(int bill : A) {
            money += bill;
        }

        return assistants - money;
    }

    public static void main(String[] args) {
        System.out.println(solution(input, 3));
    }
}
