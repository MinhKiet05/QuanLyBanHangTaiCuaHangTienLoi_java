import java.util.ArrayList;
import java.util.Optional;

public class DanhSachNhanVien {
    private ArrayList<NhanVien> listNV;

    public DanhSachNhanVien() {
        listNV = new ArrayList<>();
    }

    public boolean themNhanVien(NhanVien nv) {
        if (timNhanVien(nv.getMaNV()) != null) {
            return false; // đã tồn tại
        }
        listNV.add(nv);
        return true;
    }

    public NhanVien timNhanVien(String maNV) {
        for (NhanVien nv : listNV) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                return nv;
            }
        }
        return null;
    }

    public boolean xoaNhanVien(String maNV) {
        NhanVien nv = timNhanVien(maNV);
        if (nv != null) {
            listNV.remove(nv);
            return true;
        }
        return false;
    }

    public boolean suaNhanVien(NhanVien nvMoi) {
        Optional<NhanVien> optionalNV = listNV.stream()
                .filter(nv -> nv.getMaNV().equalsIgnoreCase(nvMoi.getMaNV()))
                .findFirst();

        if (optionalNV.isPresent()) {
            NhanVien nv = optionalNV.get();
            nv.setTenNV(nvMoi.getTenNV());
            nv.setSoDienThoai(nvMoi.getSoDienThoai());
            return true;
        }
        return false;
    }

    public boolean kiemTraDangNhap(String maNV, String matKhauNhapVao) {
        NhanVien nv = timNhanVien(maNV);
        if (nv != null) {
            return nv.kiemTraDangNhap(matKhauNhapVao);
        }
        return false;
    }
    public boolean doiMatKhau(String maNV, String matKhauCu, String matKhauMoi) {
        NhanVien nv = timNhanVien(maNV);
        if (nv != null) {
            return nv.doiMatKhau(matKhauCu, matKhauMoi);
        }
        return false;
    }

    public ArrayList<NhanVien> getList() {
        return listNV;
    }
}
