import java.util.Scanner;

public class useOperator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao Width");
        width = scanner.nextFloat();
        System.out.println("Nhap vao Height");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
