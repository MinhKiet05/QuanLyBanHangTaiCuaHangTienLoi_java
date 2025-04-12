import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DanhSachHoaDon {
    private List<HoaDon> listHoaDon;

    public DanhSachHoaDon() {
        listHoaDon = new ArrayList<>();
    }

    public boolean themHoaDon(HoaDon hoaDon) {
        listHoaDon.add(hoaDon);
        return true;
    }

    public boolean xoaHoaDon(HoaDon hoaDon) {
        return listHoaDon.remove(hoaDon);
    }

    public List<HoaDon> timHoaDonTheoNgay(LocalDateTime ngay) {
        return listHoaDon.stream()
                .filter(hd -> hd.getNgayLapHoaDon().toLocalDate().equals(ngay.toLocalDate()))
                .collect(Collectors.toList());
    }

    public List<HoaDon> getListHoaDon() {
        return listHoaDon;
    }



    // Tính tổng doanh thu theo ngày
    public double tinhTongDoanhThuTheoNgay(LocalDateTime ngay) {
        return timHoaDonTheoNgay(ngay).stream()
                .mapToDouble(HoaDon::tinhTongThanhTien)
                .sum();
    }
}
