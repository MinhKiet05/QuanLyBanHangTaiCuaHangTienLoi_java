import javax.swing.*;

public class frmQuanLyBanHang extends JFrame {
    public  frmQuanLyBanHang(){
        setTitle("Quản lý dữ liệu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null); // Canh giữa màn hình

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel quanLyBanHang = new JPanel();
        quanLyBanHang.add(new JLabel("Quản lý bán hàng"));

        JPanel quanLyKhachHang = new JPanel();
        quanLyKhachHang.add(new JLabel("Quản lý khách hàng"));

        JPanel quanLySanPham = new JPanel();
        quanLySanPham.add(new JLabel("Quản lý sản phẩm"));

        JPanel quanLyHoaDon = new JPanel();
        quanLyHoaDon.add(new JLabel("Quản lý hoá đơn"));

        JPanel thongKe = new JPanel();
        thongKe.add(new JLabel("Thống kê"));

        // Thêm các tab vào tabbedPane
        tabbedPane.addTab("Quản lý bán hàng", quanLyBanHang);
        tabbedPane.addTab("Quản lý khách hàng", quanLyKhachHang);
        tabbedPane.addTab("Quản lý sản phẩm", quanLySanPham);
        tabbedPane.addTab("Quản lý hóa đơn", quanLyHoaDon);
        tabbedPane.addTab("Thống kê", thongKe);

        // Thêm tabbedPane vào JFrame
        add(tabbedPane);
    }
}
