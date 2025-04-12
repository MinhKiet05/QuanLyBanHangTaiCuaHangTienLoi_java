public class NhaSanXuat {
    private String maNSX;
    private String tenNSX;
    private String diaChi;

    public NhaSanXuat(String maNSX, String tenNSX, String diaChi) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.diaChi = diaChi;
    }

    public NhaSanXuat(String maNSX) {
        this(maNSX,"","");
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return maNSX + ";" + tenNSX + ";" + diaChi;
    }
}
