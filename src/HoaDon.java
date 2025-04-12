import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class HoaDon {
    private LocalDateTime ngayLapHoaDon;
    private KhachHang khachHang;
    private NhanVien nhanVien;
    private List<ChiTietHoaDon> chiTietHoaDonList = new ArrayList<>();

    public HoaDon(LocalDateTime ngayLapHoaDon, KhachHang khachHang, NhanVien nhanVien) {
        this.ngayLapHoaDon = ngayLapHoaDon;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
    }

    public LocalDateTime getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    public void setNgayLapHoaDon(LocalDateTime ngayLapHoaDon) {
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public void setChiTietHoaDonList(List<ChiTietHoaDon> chiTietHoaDonList) {
        this.chiTietHoaDonList = chiTietHoaDonList;
    }

    public void themChiTietHoaDon(ChiTietHoaDon cthd) {
        chiTietHoaDonList.add(cthd);
    }

    public double tinhTongThanhTien() {
        double tong = 0;
        for (ChiTietHoaDon cthd : chiTietHoaDonList) {
            tong += cthd.tinhThanhTien();
        }
        return tong;
    }

    public List<ChiTietHoaDon> getChiTietHoaDonList() {
        return chiTietHoaDonList;
    }
    @Override
    public String toString() {
        return  ngayLapHoaDon + ";" + khachHang + ";" + nhanVien ;
    }
}
