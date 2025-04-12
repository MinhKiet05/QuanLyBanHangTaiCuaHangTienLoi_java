public class SanPham {
    private String maSP;
    private String tenSP;
    private double donGia;
    private NhaSanXuat nhaSanXuat;

    public SanPham(String maSP, String tenSP, double donGia, NhaSanXuat nhaSanXuat) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.nhaSanXuat = nhaSanXuat;
    }

    public SanPham(String maSP) {
        this(maSP,"",0,null);
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public NhaSanXuat getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(NhaSanXuat nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return maSP + ";" + tenSP +  ";" + donGia + ";" + nhaSanXuat;
    }
}
