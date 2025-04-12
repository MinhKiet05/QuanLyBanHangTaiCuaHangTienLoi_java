import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class NhanVien {
    private String maNV;
    private String tenNV;
    private String soDienThoai;
    private String matKhauHash;

    public NhanVien(String maNV, String tenNV, String soDienThoai, String matKhauHash) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.soDienThoai = soDienThoai;
        this.matKhauHash = matKhauHash;
    }

    public NhanVien(String maNV) {
        this(maNV,"","","");
    }

    public NhanVien(String maNV, String tenNV, String matKhau) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.matKhauHash = hashPassword(matKhau);
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    // Không tạo getter cho mật khẩu

    public boolean kiemTraDangNhap(String matKhauNhapVao) {
        return matKhauHash.equals(hashPassword(matKhauNhapVao));
    }

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Thuật toán mã hóa không tồn tại", e);
        }
    }
    public boolean doiMatKhau(String matKhauCu, String matKhauMoi) {
        if (kiemTraDangNhap(matKhauCu)) {
            this.matKhauHash = hashPassword(matKhauMoi);
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return maNV + ";" + tenNV +";"+soDienThoai;
    }
}
