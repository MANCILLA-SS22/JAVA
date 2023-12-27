package academy.learnprogramming;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);
        char MyChar = 'D';
        char MyUnicodeChar = '\u0044'; //Colocamos "diagunal u" cuando queremos colocar un caracter de unicode. Los primeros 3 digitos son las columnas y el 4to digito es para las columnas
        System.out.println(MyChar);
        System.out.println(MyUnicodeChar);
        boolean MyTrueBoolean = true;
        boolean MyFalseBoolean = false;

        boolean isCustomerOverTwentyOne = true;
        

        res.close();
    }
}
