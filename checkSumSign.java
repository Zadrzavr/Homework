package gd.checkSumSign;

public class checkSumSign {

    public static void main(String[] args) {
	checkSumSign();
    }
    static void checkSumSign() {
        int a = 2;
        int b = 2;
        int c = a + b;

        if (c >= 0 ) {
            System.out.println("Сумма положительная");
        }
        if (c < 0) {
            System.out.println("Сумма отрицательна");
        }
    }
}
