import java.util.ArrayList;
import java.util.Optional;

public class DanhSachSanPham {
    private ArrayList<SanPham> listSP;

    public DanhSachSanPham() {
        listSP = new ArrayList<>();
    }

    public SanPham timSanPham(String maSP) {
        for (SanPham sp : listSP) {
            if (sp.getMaSP().equalsIgnoreCase(maSP)) {
                return sp;
            }
        }
        return null;
    }

    public boolean themSanPham(SanPham sp) {
        for (SanPham existingSP : listSP) {
            if (existingSP.getMaSP().equalsIgnoreCase(sp.getMaSP())) {
                return false;
            }
        }
        listSP.add(sp);
        return true;
    }

    public boolean xoaSanPham(String maSP) {
        SanPham sp = timSanPham(maSP);
        if (sp != null) {
            listSP.remove(sp);
            return true;
        }
        return false;
    }

    public boolean suaSanPham(SanPham sanPhamMoi) {
        Optional<SanPham> spOptional = listSP.stream()
                .filter(sp -> sp.getMaSP().equalsIgnoreCase(sanPhamMoi.getMaSP()))
                .findFirst();

        if (spOptional.isPresent()) {
            SanPham sp = spOptional.get();
            sp.setTenSP(sanPhamMoi.getTenSP());
            sp.setDonGia(sanPhamMoi.getDonGia());
            sp.setNhaSanXuat(sanPhamMoi.getNhaSanXuat());
            return true;
        }
        return false;
    }

    public ArrayList<SanPham> getList() {
        return listSP;
    }
}
