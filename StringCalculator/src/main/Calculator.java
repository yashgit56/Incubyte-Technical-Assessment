package main;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public int add(String numbers) throws IllegalArgumentException {
        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",";
        String numStr = numbers;

        if (numbers.startsWith("//")) {
            int newlinePos = numbers.indexOf("\n");
            delimiter = numbers.substring(2, newlinePos);
            numStr = numbers.substring(newlinePos + 1);
        }

        numStr = numStr.replace("\n", delimiter);

        String[] tokens = split(numStr, delimiter);

        List<Integer> numbersList = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();
        for (String token : tokens) {
            int number = Integer.parseInt(token);
            if (number < 0) {
                negativeNumbers.add(number);
            }
            numbersList.add(number);
        }

        if (!negativeNumbers.isEmpty()) {
            StringBuilder errorMsg = new StringBuilder("negative numbers not allowed: ");
            for (int i = 0; i < negativeNumbers.size(); i++) {
                errorMsg.append(negativeNumbers.get(i));
                if (i != negativeNumbers.size() - 1) {
                    errorMsg.append(", ");
                }
            }
            throw new IllegalArgumentException(errorMsg.toString());
        }

        int sum = 0;
        for (int num : numbersList) {
            sum += num;
        }
        return sum;
    }

    private String[] split(String str, String delimiter) {
        return str.split(delimiter);
    }
}
