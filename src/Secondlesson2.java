public class Secondlesson2 {
    public static boolean isSumBetween10And20(int left, int right) {
        {
            int sum = left + right;
            return (10 < sum && sum <= 20);
        }
    }

    public static void printSignof(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }
    public static void print(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}