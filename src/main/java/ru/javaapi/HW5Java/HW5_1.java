package ru.javaapi.HW5Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HW5_1 {
    public static void main(String[] args) {
        String st = "Россия идет вперед всей планеты. Планета — это не Россия.".replaceAll("\\pP", "").toLowerCase();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомое слово: ");
        String keyWord = scanner.nextLine().toLowerCase();
        String[] arr = st.split(" ");
        Map<String, Integer> mapString = new HashMap<>();
        System.out.println("searchSumWords(keyWord, arr, mapString) = " + searchSumWords(keyWord, arr, mapString));
    }

    private static Map searchSumWords(String keyWord, String[] arr, Map<String, Integer> mapString) {
        Integer sumKey = 0;
        mapString.put(keyWord, sumKey);
        for (int i = 0; i < arr.length; i++) {
            if (mapString.containsKey(arr[i])) {
                sumKey++;
            }
        }
        mapString.put(keyWord, sumKey);
        return mapString;
    }
}
