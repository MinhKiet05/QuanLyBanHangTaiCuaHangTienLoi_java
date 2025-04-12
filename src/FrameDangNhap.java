import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameDangNhap extends JFrame implements ActionListener {
    private JTextField txtTenDangNhap;
    private JPasswordField txtMatKhau;
    private JButton btnDangNhap;

    public FrameDangNhap() {
        setTitle("Đăng nhập");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblTenDangNhap = new JLabel("Tên đăng nhập:");
        JLabel lblMatKhau = new JLabel("Mật khẩu:");

        txtTenDangNhap = new JTextField(15);
        txtMatKhau = new JPasswordField(15);
        btnDangNhap = new JButton("Đăng nhập");

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lblTenDangNhap, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(txtTenDangNhap, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lblMatKhau, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(txtMatKhau, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(btnDangNhap, gbc);


        btnDangNhap.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(btnDangNhap)) {
            String tenDN = txtTenDangNhap.getText().trim();
            String mk = new String(txtMatKhau.getPassword()).trim();

            if (tenDN.isEmpty() || mk.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            } else {
                frmQuanLyBanHang frm = new frmQuanLyBanHang();
                frm.setVisible(true);
                this.dispose();
            }
        }
    }




}