import java.util.Random;


/**
 * Created by energ on 29.12.2016.
 */
public class TestClass {

    public static void main(String[] args) {
        //Инициализация самого массива
        int a[] = {-10,45,-9,13,44,66,-230};
        //Последовательный вывод элементов массива до операции реверса
        {
            System.out.print("До реверса: ");

            for(int e : a) {
                System.out.print(e + " ");
            }

            System.out.println();
        }
        //Операция реверса
        {
            for(int i = 0, b = a.length - 1; i < a.length/2; i++, b--) {
                int tmp = a[i];
                a[i] = a[b];
                a[b] = tmp;
            }
        }
        //Последовательный вывод элементов массива после операции реверса
        {
            System.out.print("После реверса: ");

            for(int e : a) {
                System.out.print(e + " ");
            }

            System.out.println();
        }

    }

}
