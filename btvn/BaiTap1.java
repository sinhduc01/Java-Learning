package btvn;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so: ");
        int n = sc.nextInt();
        String snt = "";
        for (int i = 1; i <= n; i++) {
            int d = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    d = d + 1;
                }
            }
            if (d == 2) {
                snt = snt + i + " ";
            }
        }
        System.out.println("Cac so nguyen to tu 1 den " + n + " la: ");
        System.out.println(snt);
    }
}