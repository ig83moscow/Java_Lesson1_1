public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println("Hello World");
    }
    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void checkSumSign() {
        int a = -3;
        int b = 2;
        boolean test = (a + b >= 0);
        if (test) {
            System.out.println("Сумма положительная");
        }  else {;
            System.out.println("Cумма отрицательная");
        }
    }
    public static void printColor()
    {   int Z =120;
        if (Z <= 0) {
           System.out.println("Красный");
    }
        else if (0 < Z && Z <= 100)
    {     System.out.println("Жёлтый");
    }   else if (100 < Z)
        System.out.println("ЗЕЛЁНЫЙ");

    }
    public static void compareNumbers()
    { int C =3;
      int D =5;
      if (C>=D)
      {  System.out.println("C>=D");}
      else if (C < D)
      { System.out.println("C<D");}
    }
}