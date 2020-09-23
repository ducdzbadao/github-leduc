import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // String msg = "Fuck THis World";
        // System.out.printf("type: %-10s Size: %-2s Min: %-20s Max: %-20s",
        // Integer.TYPE, Integer.BYTES, Integer.MAX_VALUE, Integer.MAX_VALUE);
        // STE2();
        // SSS();
        //BaiNew();
        Bai2();
    }

    public static void STE2() {
        StringBuilder stringBuilder = new StringBuilder("Pham");

        stringBuilder.append(" Le ");
        stringBuilder.append("Duc ");

        stringBuilder.insert(4, " offset");
        stringBuilder.replace(18, 19, " dz");

        System.out.println(stringBuilder.toString());

        String name = stringBuilder.reverse().toString();
        // String name2=stringBuilder.reverse().toString();
        stringBuilder.append("str");
        System.out.println(stringBuilder.toString());
    }

    public static void SSS() {
        try {
            Scanner scanner = new Scanner(System.in);
            boolean abx;
            System.out.println("In ra mot kq boolean: ");
            abx = scanner.nextBoolean();
            System.out.println(abx);
            System.out.println();
            String newnig = scanner.nextLine();
            System.out.println("hay dien vao mot day so bat ky: " + newnig);

        } catch (Exception e) {
            System.out.println("Loi~ cmnr");
        }

    }

    public static void BaiNew() {
        int a = 10;
        int b = 3;
        double res = 1.0 * a / b;
        int res2 = a / b;
        double res3 = 999939999.12342;
        System.out.printf("KQ = %1.2f\n", res);
        System.out.printf("KQ = %1.3f\n", res);
        System.out.printf("KQ = %-1.3f\n", res);
        System.out.printf("KQ = %,10.6f\n", res3);
        System.out.printf("KQ = %d\n", res2);
        boolean bb = true;
        System.out.printf("%b", bb);
    }

    public static void Bai2() {
        try {
            Scanner scanner = 
            new Scanner(
                Paths.get("C:\\Users\\ducdu\\OneDrive\\Máy tính\\InputJava.txt"), "UTF-8");// Open file to read
                int In;
                while (scanner.hasNextLine()) {
                    In = scanner.nextInt();
                    System.out.println(In);
                }
                scanner.nextLine();//bo dong thua
                String s = scanner.nextLine();
                System.out.println(s);
        } catch (Exception e) {            
            System.out.println("Bi sai gia tri roi");
        }
    }
}
