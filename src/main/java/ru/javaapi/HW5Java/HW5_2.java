package ru.javaapi.HW5Java;

import java.util.*;

public class HW5_2 {
    public static void main(String[] args) {
        ArrayList<String> employees = createList();
        String[] employeesArr = employees.toArray(new String[employees.size()]);
        Map<String, Integer> repeatName = new HashMap<>();
        for (int i = 0; i < employeesArr.length; i++) {
            if (!repeatName.containsKey(employeesArr[i])) {
                repeatName.put(employeesArr[i], 1);
            } else {
                repeatName.put(employeesArr[i], repeatName.get(employeesArr[i]) + 1);
            }
        }
        repeatName.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
    }

    private static ArrayList<String> createList() {
        ArrayList<String> arrayName = new ArrayList<>();
        List<ListEmployees> employeesList = new ArrayList<>();
        ListEmployees employee1 = new ListEmployees("Иван", "Иванов");
        ListEmployees employee2 = new ListEmployees("Светлана", "Петрова");
        ListEmployees employee3 = new ListEmployees("Кристина", "Белова");
        ListEmployees employee4 = new ListEmployees("Анна", "Мусина");
        ListEmployees employee5 = new ListEmployees("Анна", "Крутова");
        ListEmployees employee6 = new ListEmployees("Иван", "Юрин");
        ListEmployees employee7 = new ListEmployees("Петр", "Лыков");
        ListEmployees employee8 = new ListEmployees("Павел", "Чернов");
        ListEmployees employee9 = new ListEmployees("Петр", "Чернышов");
        ListEmployees employee10 = new ListEmployees("Мария", "Федорова");
        ListEmployees employee11 = new ListEmployees("Марина", "Светлова");
        ListEmployees employee12 = new ListEmployees("Мария", "Савина");
        ListEmployees employee13 = new ListEmployees("Мария", "Рыкова");
        ListEmployees employee14 = new ListEmployees("Марина", "Лугова");
        ListEmployees employee15 = new ListEmployees("Анна", "Владимирова");
        ListEmployees employee16 = new ListEmployees("Иван", "Мечников");
        ListEmployees employee17 = new ListEmployees("Петр", "Петин");
        ListEmployees employee18 = new ListEmployees("Иван", "Ежов");
        employeesList.add(employee1);
        employeesList.add(employee2);
        employeesList.add(employee3);
        employeesList.add(employee4);
        employeesList.add(employee5);
        employeesList.add(employee6);
        employeesList.add(employee7);
        employeesList.add(employee8);
        employeesList.add(employee9);
        employeesList.add(employee10);
        employeesList.add(employee11);
        employeesList.add(employee12);
        employeesList.add(employee13);
        employeesList.add(employee14);
        employeesList.add(employee15);
        employeesList.add(employee16);
        employeesList.add(employee17);
        employeesList.add(employee18);
        for (ListEmployees employees : employeesList) {
            arrayName.add(employees.getName());
        }
        return arrayName;
    }

}
