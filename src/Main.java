public class Main {
    public static void main(String[] args) {
        // Задача 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        // Задача 2

        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullNameUp);

        // Задача 3

        String fullName1 = "Иванов Семён Семёнович";
        String newFullName = fullName1.replace("ё","e");
        System.out.println("Данные Ф. И. О. сотрудника — " + newFullName);
    }
}