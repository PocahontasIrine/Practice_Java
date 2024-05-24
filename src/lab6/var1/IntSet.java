package lab6.var1;

import java.util.HashSet;
import java.util.Set;

public class IntSet {
    private Set<Integer> set;

    public IntSet() {
        this.set = new HashSet<>();
    }

    public void add(int element) {
        set.add(element);
    }

    public Set<Integer> getSet() {
        return set;
    }

    public Set<Integer> intersection(IntSet otherSet) {
        Set<Integer> result = new HashSet<>(this.set);
        result.retainAll(otherSet.getSet());
        return result;
    }

    public Set<Integer> union(IntSet otherSet) {
        Set<Integer> result = new HashSet<>(this.set);
        result.addAll(otherSet.getSet());
        return result;
    }

    public static void main(String[] args) {
        IntSet set1 = new IntSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        IntSet set2 = new IntSet();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> intersection = set1.intersection(set2);
        System.out.println("Intersection: " + intersection);

        Set<Integer> union = set1.union(set2);
        System.out.println("Union: " + union);
    }
}

