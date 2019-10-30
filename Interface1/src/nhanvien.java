public class nhanvien implements Person {
          private  int luong;

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public void thongtin() {
        System.out.println("class con");
    }
}
