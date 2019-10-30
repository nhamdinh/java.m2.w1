import java.util.Scanner;

public class sinhvien {

    public String hoTen;
    public String diaChi;
    public float diemTB;

    public sinhvien() {
    }

    public sinhvien(String hoTen, String diaChi, float diemTB) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.diemTB = diemTB;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ho ten");
        hoTen = sc.nextLine();

        System.out.println("nhap dia chi:");
        diaChi = sc.nextLine();

        System.out.println(" nhap diem tb: ");
    diemTB = Integer.parseInt(sc.nextLine());

    }


    public void hienThi() {
        System.out.println(hoTen + diaChi + diemTB);
    }


}
