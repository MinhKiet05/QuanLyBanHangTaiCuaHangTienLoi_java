public class ChiTietHoaDon {
    private HoaDon hoaDon;
    private int soLuong;
    private SanPham sanPham;

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }
    public double tinhThanhTien() {
        return sanPham.getDonGia() * soLuong;
    }
    @Override
    public String toString() {
        return hoaDon + ";" + sanPham + ";" + soLuong+";"+tinhThanhTien();
    }
}
