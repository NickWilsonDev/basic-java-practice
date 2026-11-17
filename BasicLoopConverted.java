
public class BasicLoopConverted {

    public static int count(int num, int target) {
        //base case
        if (num == target) {
            System.out.println("Num :: " + num);
            return 0;
        } else {
            System.out.println("Num :: " + num);
            return count(num + 1, target);
        }
    }

    public static void main(String[] args) {
        int target = 10;
        int num = 0;
        System.out.println("Counting from " + num + " to " + target);
        count(num, target);
    }
}
