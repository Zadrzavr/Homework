package gd.checkSumSign;

 class checkSumSign {


    public static void main(String[] args) {
        checkSumSign();
        printColor();
        printThreeWords();
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

    public static void printColor() {
        int value = -1;
        if (value < 0) {
            System.out.println("Красный");
        }
        else if(value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

}



