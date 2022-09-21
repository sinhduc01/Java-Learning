package baitap;

import java.util.Scanner;

public class Quat {
    String thuongHieu, loai;
    float gia;
    int congSuat, capDo;

    boolean quayNgang;

    public Quat(String thuongHieu, String loai, float gia, int congSuat) {
        this.thuongHieu = thuongHieu;
        this.loai = loai;
        this.gia = gia;
        this.congSuat = congSuat;
        this.capDo = 0;
        this.quayNgang = false;
    }

    void chuyenSo(int so) {

        if (so >= 0) {
            this.capDo = so;
        } else
            System.out.println("So khong hop le");
    }

    void chuyenTrangThaiQuay() {
        this.quayNgang = !this.quayNgang;
    }

    void bat() {
        if (this.capDo == 0)
            chuyenSo(1);
    }

    void tat() {
        chuyenSo(0);
    }

    @Override
    public String toString() {
        return "Quat{" +
                "thuongHieu='" + thuongHieu + '\'' +
                ", loai='" + loai + '\'' +
                ", gia=" + gia +
                ", congSuat=" + congSuat +
                ", capDo=" + capDo +
                ", quayNgang=" + quayNgang +
                '}';
    }

    void hienThi() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Quat quatTuan = new Quat("Tuan", "Quat Nuoc", 100f, 100);
        quatTuan.hienThi();
        quatTuan.chuyenTrangThaiQuay();
        quatTuan.bat();
        quatTuan.chuyenSo(3);
        quatTuan.hienThi();
    }
}