public class FrogJmp {
    public static int solution(int X, int Y, int D) {
        int jumos = (Y-X) / D;
        int jumpsToDo = (Y-X) % D;

        return jumpsToDo > 0 ? jumos + 1 : jumos;

        /*
        int distance = (Y-X);
        int jumps = distance / D;
        int diference = distance - (jumps * D);

        return (diference > 0) ? jumps+1 : jumps;
        * */
    }

    public static void main(String[] args) {
        System.out.println(solution(10,85,30));
    }
}
