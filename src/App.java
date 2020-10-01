import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
        // BaiNew();
        //Bai2();
        //Bai3();
        //name();
        //name2();
        //name1();
        name5();
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
                Paths.get("C:\\Users\\ducdu\\OneDrive\\Máy tính\\InputJava.txt"), "UTF-8");// Open
                                                                                                                     // file
                                                                                                                     // to
                                                                                                                     // read
            int In;
            while (scanner.hasNextInt()) {
                In = scanner.nextInt();
                System.out.println(In);
            }
            scanner.nextLine();// bo dong thua
            String s = scanner.nextLine();
            System.out.println(s);
            scanner.close();
        } catch (Exception e) {
            System.out.println("Bi sai gia tri roi");
        }
    }

    public static void Bai3() throws Exception {
        try {
            String s = "nono";
            PrintWriter printWriter = new PrintWriter("C:\\Users\\ducdu\\OneDrive\\Máy tính\\KQ.duc", "UTF-8");
            printWriter.println("Hello Java 1");
            printWriter.println("x");
            printWriter.append("csq");
            printWriter.append("csq");
            printWriter.close();
        } catch (Exception e) {
            System.out.println("Khong ghi dc");        
        }
    }
    public static void name() {
        // int a = 8;
        // if (a % 2 == 0) {
        //     System.out.println("a la so chan");
        // } else {
        //     System.out.println("a la so le");
        // }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dien vao diem so cua ban");
        double i = scanner.nextDouble();
        if (i >=9 && i <= 10) {
            System.out.println("Ban la hs xuat xac");
        } else if (i >=8 && i < 9) {
            System.out.println("Ban la hs gioi");
        } else if (i >= 6.5 && i < 8){
            System.out.println("Ban la hs kha");
        } else {
            System.out.println("ban ngu vl");
        }
    }
    public static void name2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input what number you want: ");
        String dk = scanner.nextLine();
        switch (dk) {
            case "1":
                System.out.println("eat shit 1");
                break;
            case "2":
                System.out.println("eat shit 2");
                break;
            default:
                System.out.println("no shit was chosen");
                break;
        }
    }
    public static void name3() {
        // for (int i = 0; i<=100; i++) {// for loop
            
        //     if (i % 6 == 0) {
        //         System.out.println(i);
        //     }
        // }
        int a = 3;
        // while (a < 100) { // while loop
        //     System.out.println(a);
        //     a++;
        // }
        // do { // do-while loop
        //     System.out.println("eat shit");
        //     a--;
        // } while (a != 0);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int j2 = 0; j2 < 5; j2++) {
                    System.out.println("i= "+i + " j= "+j + " j2= "+j2);
                }
            }
        }
    }
    public static void name1() {
        // int count = 0;
        // int i = 99;
        // for (int j = 0; j < 10; j++) {
        //     count = 0;
        //     for (; ;) {
        //         if (i % 5 ==0) {
        //             System.out.println(i);
        //             count++;
        //         }
        //         if (count == 5) {
        //             System.out.println("break dung o day: " + j);
        //             break;
        //         }
        //         i++;
        //     }
        // }
        
        for (int j = 0; j < 100; j++) {
            
            
            if (j % 5 == 0) {// nhung so chia het cho 5 thi se ko in ra
               
                continue;// neu nhu continue dc kich hoat thi se ko thuc hien nhung lenh ben duoi nua
                
            }
            System.out.println(j);
        }      
        
    }
    public static void name5() {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dien vao so m = ");
        m = scanner.nextInt();
        System.out.println("Dien vao so n = ");
        n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == m-1 || j == n-1) {
                    System.out.print(" x ");
                }else{
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }
        
    }
}
