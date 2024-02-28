import java.util.*;
import java.util.ArrayList;

public class HeapMin {
    static List<Integer> hp = new ArrayList<>();

    public int getParentIndex(int idx) {
        return (idx - 1) / 2;
    }

    public int getLeftChildIndex(int idx) {
        return (2 * idx) + 1;
    }

    public int getRightChildIndex(int idx) {
        return (2 * idx) + 2;
    }

    public void insert(int ele) {
        hp.add(ele);
        UPHeap(hp.size() - 1);
    }

    public void delete() {
        if (hp.size() == 1) {
            hp.remove(0);
            return;
        }
        hp.set(0, hp.get(hp.size() - 1));
        hp.remove(hp.size() - 1);
        DOWNHeap(0);
    }

    private void DOWNHeap(int idx) {
        int leftChildIndex = getLeftChildIndex(idx);
        int rightChildIndex = getRightChildIndex(idx);
        int largest = idx;
        if (leftChildIndex < hp.size() && hp.get(leftChildIndex) < hp.get(largest)) {
            largest = leftChildIndex;
        }
        if (rightChildIndex < hp.size() && hp.get(rightChildIndex) < hp.get(largest)) {
            largest = rightChildIndex;
        }
        if (largest != idx) {
            int temp = hp.get(largest);
            hp.set(largest, hp.get(idx));
            hp.set(idx, temp);
            DOWNHeap(largest);
        }
    }

    public void UPHeap(int idx) {
        int parent = getParentIndex(idx);
        if (parent >= 0 && hp.get(parent) > hp.get(idx)) {
            int temp = hp.get(parent);
            hp.set(parent, hp.get(idx));
            hp.set(idx, temp);
            UPHeap(parent);
        }

    }

    public static void main(String[] args) {
        HeapMin h = new HeapMin();
        for (int i = 6; i > 0; i--) {
            h.insert(i);
        }
        System.out.println(hp);
        h.delete();
        System.out.println(hp);
    }

}