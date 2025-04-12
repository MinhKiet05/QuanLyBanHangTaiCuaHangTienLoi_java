
import java.time.LocalDateTime;

public class HoaDon {
    private LocalDateTime ngayLapHoaDon;
    private KhachHang khachHang;
    private NhanVien nhanVien;

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

    @Override
    public String toString() {
        return  ngayLapHoaDon + ";" + khachHang + ";" + nhanVien ;
    }
}
