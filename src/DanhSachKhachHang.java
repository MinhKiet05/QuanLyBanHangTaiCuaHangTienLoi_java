import java.util.ArrayList;
import java.util.Optional;

public class DanhSachKhachHang {
    private ArrayList<KhachHang> listKH;

    public DanhSachKhachHang() {
        listKH = new ArrayList<>();
    }

    public boolean themKhachHang(KhachHang kh) {
        if (timKhachHang(kh.getMaKH()) != null) {
            return false; // Đã tồn tại mã khách hàng
        }
        listKH.add(kh);
        return true;
    }

    public KhachHang timKhachHang(String maKH) {
        for (KhachHang kh : listKH) {
            if (kh.getMaKH().equalsIgnoreCase(maKH)) {
                return kh;
            }
        }
        return null;
    }

    public boolean xoaKhachHang(String maKH) {
        KhachHang kh = timKhachHang(maKH);
        if (kh != null) {
            listKH.remove(kh);
            return true;
        }
        return false;
    }

    public boolean suaKhachHang(KhachHang khMoi) {
        Optional<KhachHang> optionalKH = listKH.stream()
                .filter(kh -> kh.getMaKH().equalsIgnoreCase(khMoi.getMaKH()))
                .findFirst();

        if (optionalKH.isPresent()) {
            KhachHang kh = optionalKH.get();
            kh.setTenKH(khMoi.getTenKH());
            kh.setSoDienThoai(khMoi.getSoDienThoai());
            return true;
        }
        return false;
    }

    public ArrayList<KhachHang> getList() {
        return listKH;
    }
}
