import java.io.PrintStream;
import java.util.Scanner;


public class main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int x = in.nextInt(); // диаметр отверстия
        int a = in.nextInt(); // диаметр 1 бусинки
        int b = in.nextInt(); // диаметр 2 бусинки
        int c = in.nextInt(); // диаметр 3 бусинки
        int d = in.nextInt(); // диаметр 4 бусинки
        int k = 0; // счетчик бусинок, которые прошли
        if (a <= x){ // проверяем пройдет ли 1 бусинка
            k += 1; // если проходит, то прибавляем 1
            if (b <= x){ // проверяем пройдет ли 2 бусинка
                k += 1; // если проходит, то прибавляем 1
                if(c <= x){ // проверяем пройдет ли 3 бусинка
                    k += 1; // если проходит, то прибавляем 1
                    if(d <= x){ // проверяем пройдет ли 4 бусинка
                        k += 1; // если проходит, то прибавляем 1
                        out.println(k); // выводим ответ, т.к. это была последняя возможная бусинка
                    }
                    else{ // если 4 бусинка не прошла, вывлдим ответ
                        out.println(k);
                    }
                }
                else{ // если 3 бусинка не прошла, вывлдим ответ
                    out.println(k);
                }
            }
            else{ // если 2 бусинка не прошла, вывлдим ответ
                out.println(k);
            }
        }
        else{ // если 1 бусинка не прошла, вывлдим ответ
            out.println(k);
        }

    }
}
