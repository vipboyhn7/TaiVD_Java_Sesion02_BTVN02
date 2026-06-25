import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên từ 1 đến 12 (tương ứng với tháng): ");

        if (scanner.hasNextInt()) {
            int month = scanner.nextInt();

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.printf("Tháng %d có 31 ngày.\n", month);
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.printf("Tháng %d có 30 ngày.\n", month);
                    break;

                case 2:
                    System.out.printf("Tháng %d có 28 hoặc 29 ngày.\n", month);
                    break;

                default:
                    System.out.println("Tháng không hợp lệ.");
                    break;
            }
        } else {
            System.out.println("Tháng không hợp lệ. Vui lòng nhập số nguyên!");
        }

        scanner.close();
    }
}