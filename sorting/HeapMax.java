import java.util.ArrayList;
import java.util.List;

public class HeapMax {
    static List<Integer> hp = new ArrayList<>();

    public static void main(String[] args) {
        HeapMax h = new HeapMax();
        for (int i = 1; i <= 6; i++) {
            h.insert(i);
        }
        System.out.println(hp);
        h.delete();
        System.out.println(hp);
    }

    public int getparentIndex(int idx) {
        return (idx - 1) / 2;
    }

    public int getleftChildIndex(int idx) {
        return (2 * idx) + 1;
    }

    public int getrightChildIndex(int idx) {
        return (2 * idx) + 2;
    }

    public void insert(int ele) {
        hp.add(ele);
        UPheap(hp.size() - 1);
    }

    public void UPheap(int idx) {
        int parent = getparentIndex(idx);
        if (parent >= 0 && hp.get(parent) < hp.get(idx)) {
            int temp = hp.get(parent);
            hp.set(parent, hp.get(idx));
            hp.set(idx, temp);
            UPheap(parent);
        }

    }

    public void DOWNHeap(int idx) {
        int leftChildIndex = getleftChildIndex(idx);
        int rightChildIndex = getrightChildIndex(idx);
        int smallest = idx;
        if (leftChildIndex < hp.size() && hp.get(leftChildIndex) > hp.get(smallest)) {
            smallest = leftChildIndex;
        }
        if (rightChildIndex < hp.size() && hp.get(rightChildIndex) > hp.get(smallest)) {
            smallest = rightChildIndex;
        }
        if (smallest != idx) {
            int temp = hp.get(smallest);
            hp.set(smallest, hp.get(idx));
            hp.set(idx, temp);
            DOWNHeap(smallest);
        }
    }

    public void delete() {
        if (hp.size() == 1) {
            hp.remove(0);
            return;
        }
        int ele = hp.get(hp.size() - 1);
        hp.set(0, ele);
        hp.remove(hp.size() - 1);
        DOWNHeap(0);
    }
}
