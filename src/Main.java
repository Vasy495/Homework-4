public class Main {
    public static void main(String[] args) {
        // Example-1
        int i = 0;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        // Example-2
        int number = 7;
        while (number <= 31) {
            System.out.println("Сегодня пятница, " + number + "-е число. Необходимо подготовить отчет");
            number = number + 7;
        }


        // Example-3
        int days = 0;

        int year1 = 2020 - 200;
        int year2 = 2020 + 100;

        for (;days < year2; days+=79) {
            if (days > year1) {
                System.out.println(days);
            }

        }


    }
}
