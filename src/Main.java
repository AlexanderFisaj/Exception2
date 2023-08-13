import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Решение задачи 1.
//        System.out.print("Введите дробное число: ");
//        inputFloat();

//        Решение задачи 4.
        System.out.print("Ввод данных: ");
        inputEmptyLine();
    }
//    Задача 1.
//    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//    вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void inputFloat(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String input = scanner.nextLine();
        while (flag){
            if (isNumeric(input)){
                System.out.println("Подтверждаю ввод числа типа float!");
                flag = false;
            }else {
                System.out.print("Неверный ввод!\n Повторите ввод -> введите дробное число:");
                input = scanner.nextLine();
            }
        }
    }
    public static boolean isNumeric(String str){
        try {
            Float.parseFloat(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
//    Задача 4.
//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void inputEmptyLine(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String input = scanner.nextLine();
        while (flag){
            if (input == ""){
                System.out.print("Пустые строки вводить нельзя!\nПовторите ввод: ");
                input = scanner.nextLine();
                continue;
            }
            flag = false;
        }
    }

}
