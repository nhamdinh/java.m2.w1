import java.util.Scanner;

public class CatDetail implements ICat  {
String loai;
String mau;
String noisong;

    public CatDetail() {
    }

    public CatDetail(String loai, String mau, String noisong) {
        this.loai = loai;
        this.mau = mau;
        this.noisong = noisong;
    }

    @Override
    public void nhap() {
        Scanner data = new Scanner(System.in);

        System.out.println("nhap loai: ");
        loai = data.nextLine();

        System.out.println("nhap mau: ");
        mau = data.nextLine();

        System.out.println(" noi song");
        noisong = data.nextLine();

        super.nhap();
    }

    @Override
    public void hienthi() {
        System.out.println(toString());
        super.hienthi();
    }

    @Override
    public String toString() {
        return "CatDetail{" +"ten" + TEN +
                "loai='" + loai + '\'' +
                ", mau='" + mau + '\'' +
                ", noisong='" + noisong + '\'' +
                '}';
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getNoisong() {
        return noisong;
    }

    public void setNoisong(String noisong) {
        this.noisong = noisong;
    }
}
