public class Main {

    public static void main(String[] args) {
HinhTron hinhTron = new HinhTron(5);
HinhChuNhat hinhChuNhat = new HinhChuNhat(5,7);
Shape[] list = new Shape[2];
list[0] = hinhTron;
list[1] = hinhChuNhat;
Shape shape = new HinhTron(6);
double tong = tinhTongDienTich(list);
double tongCV = tinhTongChuVi(list);


        System.out.println("dien tich hinh tron: "+ hinhTron.tinhDienTich());
        System.out.println("dien tich hinh CN: "+ hinhChuNhat.tinhDienTich());
        System.out.println("tong dien tich: " + tong);
        System.out.println("dien tich hinh tron: "+ hinhTron.tinhChuvi());
        System.out.println("dien tich hinh CN: "+ hinhChuNhat.tinhChuvi());
        System.out.println("tong chu vi: " + tongCV);
    }


    public static double tinhTongDienTich(Shape[] list) {
        double tongDientich = 0;
        for (Shape shape : list) {
            tongDientich += shape.tinhDienTich();
        }
        return tongDientich;
    }
    public static  double tinhTongChuVi(Shape[] list){
        double tongChuvi = 0;
        for (Shape shape: list){
            tongChuvi += shape.tinhChuvi();
        }
        return tongChuvi;

    }


}
