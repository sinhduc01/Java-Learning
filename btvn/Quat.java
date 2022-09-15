package btvn;

import java.util.Scanner;

public class Quat {
    String thuongHieu, loai;
    double gia;
    int congSuat, capDo;
    boolean quayNgang, nutNguon;

    public Quat(String thuongHieu, String loai, double gia, int congSuat, boolean quayNgang, int capDo,
            boolean nutNguon) {
        this.thuongHieu = thuongHieu;
        this.loai = loai;
        this.gia = gia;
        this.congSuat = congSuat;
        this.quayNgang = quayNgang;
        this.capDo = capDo;
        this.nutNguon = nutNguon;
    }

    void chuyenSo(int so) {
        capDo = so;
        nutNguon = true;
        System.out.println("Quat duoc chuyen ve so " + capDo);
    }

    void chuyenTrangThaiQuay() {
        if (quayNgang == false) {
            quayNgang = true;
            System.out.println("Chuyen sang che do quay ngang");
        } else {
            quayNgang = false;
            System.out.println("Chuyen sang che do dung yen");
        }
    }

    void tatBatQuat() {
        if (nutNguon == false) {
            nutNguon = true;
            System.out.println("Quat da duoc bat");
            capDo = 1;
        } else {
            nutNguon = false;
            capDo = 0;
            System.out.println("Quat da duoc tat");
        }
    }

    void hienThiThongSoQuat() {
        System.out.println(
                "Quat cua thuong hieu " + thuongHieu + ", loai quat " + loai + ", gia " + gia + " VND, cong suat "
                        + congSuat + "W.");
    }

    void hienThiTrangThaiQuat() {
        String trangThaiQuat = "tat";
        String trangThaiQuay = "dang dung yen";
        if (nutNguon == true) {
            trangThaiQuat = "bat";
        }
        if (quayNgang == true) {
            trangThaiQuat = "dang quay";
        }
        System.out.println(
                "Quat dang duoc " + trangThaiQuat + ", dang o cap do gio so " + capDo + " va " + trangThaiQuay + ".");
    }

    void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    void bangDieuKhien() {
        if (nutNguon == false) {
            System.out.println("Day la bang dieu khien cua quat UwU");
            System.out.println("Nhap so 1 de mo quat");
            System.out.println("Nhap so 4 de hien thi thong so quat");
            System.out.println("Nhap so 5 de hien thi trang thai quat");
            System.out.println("Nhap so 6 de thoat khoi bang dieu khien");
            System.out.print("Moi nhap: ");
        } else {
            System.out.println("Day la bang dieu khien cua quat UwU");
            System.out.println("Nhap so 1 de tat quat");
            System.out.println("Nhap so 2 de chuyen so cua quat");
            System.out.println("Nhap so 3 de cho quat quay ngang hoac dung yen");
            System.out.println("Nhap so 4 de hien thi thong so quat");
            System.out.println("Nhap so 5 de hien thi trang thai quat");
            System.out.println("Nhap so 6 de thoat khoi bang dieu khien");
            System.out.print("Moi nhap: ");
        }
    }

    void dieuKhien() {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        do {
            bangDieuKhien();
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    tatBatQuat();
                    delay();
                    break;
                case 2:
                    int so;
                    do {
                        System.out.print("Nhap so muon chuyen (tu 1 den 4): ");
                        so = sc.nextInt();
                        if (so > 4) {
                            System.out.println("Nhap sai, so cua quat chi tu 1 den 4, moi nhap lai.");
                        }
                    } while (so > 4);
                    chuyenSo(so);
                    delay();
                    break;
                case 3:
                    chuyenTrangThaiQuay();
                    delay();
                    break;
                case 4:
                    hienThiThongSoQuat();
                    delay();
                    break;
                case 5:
                    hienThiTrangThaiQuat();
                    delay();
                    break;
                default:
                    System.out.println("Goodbye!");
                    cont = false;
                    delay();
                    break;
            }
        } while (cont);
    }

    public static void main(String[] args) {
        Quat quat1 = new Quat("Senko", "Dieu hoa", 900000, 400, false, 0, false);
        Quat quat2 = new Quat("Thong nhat", "cay", 500000, 250, false, 0, false);
        Scanner ip = new Scanner(System.in);
        System.out.print("Chon quat muon dieu khien (1 hoac 2):");
        int soQuat = ip.nextInt();
        if (soQuat == 1) {
            quat1.dieuKhien();
        } else {
            quat2.dieuKhien();
        }

    }
}
