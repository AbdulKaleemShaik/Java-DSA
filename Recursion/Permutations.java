import java.util.*;

public class permutations {
    public static List<List<Integer>> per(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] ele = new boolean[nums.length];
        rec(ans, ds, ele, nums);
        return ans;
    }

    public static void rec(List<List<Integer>> ans, List<Integer> ds, boolean[] ele, int[] nums) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!ele[i]) {
                ele[i] = true;
                ds.add(nums[i]);
                rec(ans, ds, ele, nums);
                ds.remove(ds.size() - 1);
                ele[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> ans = per(arr);
        System.out.println(ans);

    }
}
