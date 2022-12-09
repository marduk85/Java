import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double a; //объявляем первую перменную
        double b; // объявляем вторую переменную
        char op;  //объявляем перемнную в которую будем записывать знак операции
        double result; //для записи результата
        System.out.println("Я простой калькулятор, введи два числа:\n"); //предлагаем пользователю ввести два числа
        Scanner read= new Scanner (System.in); //создаем сканер для считывания чисел
        a = read.nextDouble(); //считываем первое число
        b = read.nextDouble(); //считываем второе число
        System.out.println("Введи оператор + - * /\n"); //предлагаем ввести оператор
        op = read. next().charAt(0); //считываем оператор
        //все еобходимые дынные считали теперь будет использовать switch-case для решения
        switch (op) {
            case '-' -> {
                result = a - b;
                System.out.println("Результат:\n");
                System.out.printf(a + op + b + "=" +result);
            }
            case '+' -> {
                result = a + b;
                System.out.println("Результат:\n");
                System.out.printf(a + op + b + "=" +result);
            }
            case '*' -> {
                result = a * b;
                System.out.println("Результат:\n");
                System.out.printf(a + op + b + "=" +result);
            }
            case '/' -> {
                result = a / b;
                System.out.println("Результат:\n");
                System.out.printf(a + op + b + "=" +result);
            }
        }


    }
}