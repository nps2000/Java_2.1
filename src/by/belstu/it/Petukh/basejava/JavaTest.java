package by.belstu.it.Petukh.basejava;

import static java.lang.Math.*; //статический импорт.

import java.lang.*;
import java.util.Arrays;
import java.util.Objects;


public class JavaTest {
    static int sint;
    // psvm - создание main.

    //константы(final).
    final int INT = 1;
    public final int INT1 = 2;
    public static final int INT2 = 3;

    int Test(){

        return INT;
    }
    static int Test1(){
        return INT2;
    }

    public static void main(String[] args) {
        char C = 'A';
        int I = -1;
        short S = 2;
        byte B = 3;
        long L = 4;
        float F = 5.1f;
        double D = 5.2f;
        boolean Bool = true;

        String Str = "Hello World!";

        byte B1 = (byte) (B + I);
        int I1 = (int) (D + L);
        long L1 = (long) (I + 2147483647);

        boolean Bool1 = false, Bool2, Bool3, Bool4;

        Bool2 = Bool1 && Bool;
        Bool3 = Bool ^ Bool1;
        //Bool4 = Bool + Bool1; сложение нельзя.

        long maxLong = 9223372036854775807l;
        long sizeMax = 0x7ff_ffff_ffffL;
        char C1 = 'a', C2 = '\u0061', C3 = 97;
        char C4 = (char) (C1 + C2 + C3);


        // вывод всех переменных.
        System.out.println("Char = " + C);
        System.out.println("Int = " + I);
        System.out.println("Short = " + S);
        System.out.println("Byte = " + B);
        System.out.println("Long = " + L);
        System.out.println("Float = " + F);
        System.out.println("Double = " + D);
        System.out.println("String = " + Str);
        System.out.println("Booleam = " + Bool);
        // операции над переменными.
        System.out.println("String + Int = " + Str + I);
        System.out.println("String + Char = " + Str + C);
        System.out.println("String + Double = " + Str + D);
        System.out.println("Byte = Byte + Int: " + B1);
        System.out.println("Int = Double + Long: " + I1);
        System.out.println("Long = int + 2147483647: " + L1);
        System.out.println("Static int = " + sint);
        System.out.println("Boolean = Boolean && Bollean: " + Bool2);
        System.out.println("Boolean = Boolean ^ Bollean: " + Bool3);
        System.out.println("Char('a'): " + C1);
        System.out.println("Char('u0061'): " + C2);
        System.out.println("Char(97): " + C3);
        System.out.println("Char('a') + Char('\u0061') + Char(97): " + C4);
        System.out.println("3.45 % 2.4 = " + (3.45 % 2.4));
        System.out.println("1.0 / 0.0 = " + (1.0 / 0.0));
        System.out.println("0.0 / 0.0 = " + (0.0 / 0.0));
        System.out.println("log(-345) = " + log(-345));
        System.out.println("Float.intBitsToFloat(0x7F800000) =  " + Float.intBitsToFloat(0x7F800000));
        System.out.println("Float.intBitsToFloat(0xFF800000) =  " + Float.intBitsToFloat(0xFF800000));

        //В каких системах счисления можно записывать целые
        //константы? В десятичных, восьмеричных(начинающих с 0), шеснадцатеричных(начиная с 0 и латинской буквы X).

        System.out.println("Math.Pi = " + PI);
        System.out.println("Math.E = " + E);
        System.out.println("Math.round(PI) = " + round(PI)); //округление PI.
        System.out.println("Math.round(E) = " + round(E)); //округление E.
        System.out.println("Math.min(PI,E) = " + min(PI, E)); //минимально среди PI и E.
        System.out.println("Случайные число из диапазона [0,1) Math.random() = " + (random())); //Случайные число из диапазона [0,1).

        //объекты разных классов оболочек.
        Boolean BolleaN = true;
        Boolean BolleaN1 = true;
        Character CharacteR = 'a';
        Integer IntegeR = -1234;
        Byte BytE = 2;
        Short ShorT = 1;
        Long LonG = 4l;
        Double DoublE = 5.1d;

        System.out.println("Сдвиг вправо со знаком(>>):" + Integer.toBinaryString((IntegeR >> ShorT))); // >> - сдвиг вправо со знака
        System.out.println("Сдвиг вправо без знака(>>>):" + Integer.toBinaryString((IntegeR >>> ShorT))); // >>> - сдвиг вправо без знака
        System.out.println(LonG + DoublE);
        System.out.println("Минимальное значение Long: " + Long.MIN_VALUE);//Минимальное значение Long.
        System.out.println("Максимальное значение Long: " + Long.MAX_VALUE);//Максимальное значение Long.
        System.out.println("Минимальное значение Double: " + Double.MIN_VALUE);//Минимальное значение Double.
        System.out.println("Максимальное значение Double: " + Double.MAX_VALUE);//Максимальное значение Double.

        Integer obj1 = 10; //упаковка.
        int i1 = obj1 * 2; //распаковка при вычислении выражения.
        Byte obj2 = 1;
        byte b1 = (byte) (obj2 + 1);

        System.out.println("Integer.ParseInt(1) = " + Integer.parseInt("1")); // преобразует строку в число.
        System.out.println("Integer.toHExString(123) = " + Integer.toHexString(123)); // десятичное число в виде шестнадцатеричного числа без знака.
        System.out.println("Integer.compare(1,2) = " + Integer.compare(1, 2));
        //возвращает целочисленное представление результата сравнения двух целочисленных аргументов.
        System.out.println("Integer.toString(1234) = " + Integer.toString(1234));
        // Возвращает объект String, представляющий значение объекта Integer.
        System.out.println("Inter.bitCount(13) = " + Integer.bitCount(3));
        //возвращает целочисленное значение, которое соответствует количеству единиц в двоичном представлении числа-аргумента метода.
        System.out.println("Double.isNaN(5.1d) = " + Double.isNaN(5.1d));

        String s34 = "2345";

        System.out.println("Строка в число с помощью parseInt: " + Integer.parseInt(s34)); // parseInt возвращает примитив int.
        System.out.println("Строка в число с помощью valueOf: " + Integer.valueOf(s34)); // valueOf возвращает новый или кэшированный экземпляр java.lang.Integer.

        //преобразование строки в массив байт.
        String str = "Hello World";
        byte[] ByteArray = str.getBytes();
        System.out.println("Преобразование строки str в массив байт:" + Arrays.toString(ByteArray));
        //преобразуем массив байт обратно в строку.
        String string = new String(ByteArray);
        System.out.println("Преобразование массива байтов в строку: " + string);

        String str1 = "True"; //False при любом другом значении.
        String str2 = "yes";
        System.out.println("Преобразование строки в логический тип 2-мя способами: ");
        //с использованием метода parseBoolean.
        System.out.println("1) с использованием метода parseBoolean: ");
        System.out.println(" Строка 1: " + Boolean.parseBoolean(str1));
        System.out.println(" Строка 2: " + Boolean.parseBoolean(str2));
        //c использованием метода valueOf
        System.out.println("2) c использованием метода valueOf ");
        System.out.println(" Строка 1: " + Boolean.valueOf(str1));
        System.out.println(" Строка 2: " + Boolean.valueOf(str2));


        String str3 = "True";
        String str4 = "True";
        System.out.println("Сравнение строк:");
        System.out.println(" 1) ==: " + (str3 == str4)); // сравнивает ссылки.

        System.out.println(" 2) equals: " + (str3.equals(str4))); // сравнивает значение.
        //Результатом является значение true только в том случае, если аргумент не равен null
        //и является строковым объектом (String), который представляет ту же последовательность символов как и этот объект.
        System.out.println(" 3) compareTo: " + (str3.compareTo(str4)));
        // 0 если =, возвращают ASCII разность первых нечетных символов сравниваемых строк.

        String str5 = null;
        System.out.println("Сравнение строк с null:");
        System.out.println(" 1) ==:  " + (str4 == str5));
        System.out.println(" 2) equals:  " + (str4.equals(str5)));
        //System.out.println(" 3) compareTo:  "+(str4.compareTo(str5))); //возникает исключение NullPointerException

        String str6 = "Hello World!";
        String[] str61 = str6.split(" ");
        System.out.println("метод split: " + Arrays.toString(str61));// разделние строки.
        System.out.println("Метод contains: " + str6.contains("l")); //Возвращает истину если строка содержит указанную последовательность символов.
        System.out.println("Метод hashCode: " + str6.hashCode()); //Возвращает хэш-код для этой строки
        System.out.println("Метод indexOf: " + str6.indexOf("l"));//ищет в строке заданный символ или строку, и их возвращает индекс.
        System.out.println("Метод length: " + str6.length()); //возвращает длина строки.
        System.out.println("Метод replace: " + str6.replace("Hello", "Hi")); //Возвращает новую строку, производя замену всех вхождений oldChar на newChar.

        char[][] c1;
        char[] c2[] = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
        char c3[][] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};

        char[] ZeroArray = new char[0];//массив нулевой длины.Инициализировать такой массив нельзя.

        c1 = new char[3][];
        c1[0] = new char[2];
        c1[1] = new char[3];
        c1[2] = new char[4];
        // Что случится, если индекс массива превысит его длину?
        //c1[3] = new char[3]; //исключение java.lang.ArrayIndexOutOfBoundsException.
        int c1Size = c1.length; // 3.
        System.out.println("Length c1: " + c1Size);
        c1Size = c1[0].length; // 2.
        System.out.println("Length c1[0]: " + c1Size);
        c1Size = c1[1].length; //4.
        System.out.println("Length c1[1]: " + c1Size);
        c1Size = c1[2].length; //3.
        System.out.println("Length c1[2]: " + c1Size);

        boolean comRez = c2 == c3; // сравнение массивов.
        System.out.println(comRez);
        c2 = c3; // массив с2 передает значения с3.
        System.out.println("Массив с2: ");
        for (char[] x : c2) {
            System.out.println(x);
        }
        WrapperString WS = new WrapperString("A");
        WS.replace('A', 'B');
        //TODO что делать с delete и как определить?
        WrapperString wrapperString = new WrapperString("A") {

            @Override
            public void replace(char oldchar, char newchar) {
                super.replace(oldchar, newchar);
            }
        };
        wrapperString.replace('A', 'C');
    }
    public static class WrapperString{
        private String str;

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            WrapperString that = (WrapperString) o;
            return Objects.equals(str, that.str);
        }

        @Override
        public int hashCode() {
            return Objects.hash(str);
        }

        @Override
        public String toString() {
            return "WrapperString{" +
                    "str='" + str + '\'' +
                    '}';
        }

        public WrapperString(String str) { //конструктор
            this.str = str;
        }

        public void replace (char oldchar, char newchar){
            System.out.println(str.replace(oldchar,newchar));


        }

    }

}
