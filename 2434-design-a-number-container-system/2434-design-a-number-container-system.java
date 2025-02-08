import java.util.*;

class NumberContainers {
    HashMap<Integer, TreeSet<Integer>> numberToIdx;
    HashMap<Integer, Integer> idxToNumber;

    public NumberContainers() {
        numberToIdx = new HashMap<>();
        idxToNumber = new HashMap<>();
    }

    public void change(int index, int number) {
        if (idxToNumber.containsKey(index)) {
            int prev = idxToNumber.get(index);
            numberToIdx.get(prev).remove(index);
            if (numberToIdx.get(prev).isEmpty()) numberToIdx.remove(prev);
        }
        idxToNumber.put(index, number);
        numberToIdx.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
    }

    public int find(int number) {
        return numberToIdx.containsKey(number) ? numberToIdx.get(number).first() : -1;
    }
}
