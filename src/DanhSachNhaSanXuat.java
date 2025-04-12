import java.util.ArrayList;
import java.util.Optional;

public class DanhSachNhaSanXuat {
    private ArrayList<NhaSanXuat> listNSX;
    public DanhSachNhaSanXuat() {
        listNSX = new ArrayList<NhaSanXuat>();
    }
    public NhaSanXuat timNhaSanXuat(String maNSX){
        for (NhaSanXuat nsx : listNSX){
            if(nsx.getMaNSX().equalsIgnoreCase(maNSX)){
                return nsx;
            }
        }
        return null;
    }
    public boolean themNhaSanXuat(NhaSanXuat nsx){
        for (NhaSanXuat existingNV : listNSX) {
            if (existingNV.getMaNSX() == nsx.getMaNSX()) {
                return false;
            }
        }
        listNSX.add(nsx);
        return true;
    }

    public boolean xoaNhaSanXuat(String maNSX) {
        NhaSanXuat nsx = timNhaSanXuat(maNSX);
        if(listNSX.contains(nsx)) {
            listNSX.remove(nsx);
            return true;
        }else {
            return false;
        }
    }
    public boolean suaNhaSanXuat(NhaSanXuat nhaSanXuat) {
        Optional<NhaSanXuat> nsxOptional = listNSX.stream()
                .filter(nsx -> nsx.getMaNSX() == nhaSanXuat.getMaNSX())
                .findFirst();

        if (nsxOptional.isPresent()) {
            NhaSanXuat nsx = nsxOptional.get();
            nsx.setTenNSX(nhaSanXuat.getTenNSX());
            nsx.setDiaChi(nhaSanXuat.getDiaChi());
            return true;
        }
        return false;
    }
    public ArrayList<NhaSanXuat> getList(){
        return listNSX;
    }
}
