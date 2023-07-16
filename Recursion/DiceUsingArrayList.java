import java.util.ArrayList;

public class DiceUsingArrayList {
    static ArrayList<String> dice(String p, int target) {
        if (target == 0) {
            ArrayList<String> sr = new ArrayList<>();
            sr.add(p);
            return sr;
        }
        ArrayList<String> sr1 = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            sr1.addAll(dice(p + i, target - i));

        }
        return sr1;
    }

    public static void main(String[] args) {
        System.out.println(dice("", 5));
    }
}
