package lab6.var2;

import java.util.ArrayList;

public class NumberStorage {
    private ArrayList<Integer> numbers;

    public NumberStorage() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void removeNumber(int number) {
        numbers.remove(Integer.valueOf(number));
    }

    public int findClosestNumber(int target) {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("Number storage is empty");
        }

        int minDifference = Integer.MAX_VALUE;
        int closestNumber = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            int difference = Math.abs(target - numbers.get(i));
            if (difference < minDifference) {
                minDifference = difference;
                closestNumber = numbers.get(i);
            }
        }

        return closestNumber;
    }

    public static void main(String[] args) {
        NumberStorage storage = new NumberStorage();
        storage.addNumber(5);
        storage.addNumber(10);
        storage.addNumber(3);
        storage.addNumber(12);

        System.out.println("Ближайшее число к 7: " + storage.findClosestNumber(7));
    }
}

