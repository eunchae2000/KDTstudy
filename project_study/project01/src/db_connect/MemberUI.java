package db_connect;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberUI {
    private static JTextField t1;
    private static JTextField t2;
    private static JTextField t3;
    private static JTextField t4;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(new Color(177, 255, 199));
        f.setSize(500, 700);
        f.getContentPane().setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("아이디");
        lblNewLabel_1.setFont(new Font("GangwonEduPower", Font.BOLD, 30));
        lblNewLabel_1.setBounds(22, 255, 142, 40);
        f.getContentPane().add(lblNewLabel_1);
        
        JLabel label = new JLabel("패스워드");
        label.setFont(new Font("GangwonEduPower", Font.BOLD, 30));
        label.setBounds(22, 318, 142, 40);
        f.getContentPane().add(label);
        
        JLabel label_1 = new JLabel("이름");
        label_1.setFont(new Font("GangwonEduPower", Font.BOLD, 30));
        label_1.setBounds(22, 388, 142, 40);
        f.getContentPane().add(label_1);
        
        JLabel label_2 = new JLabel("전화번호");
        label_2.setFont(new Font("GangwonEduPower", Font.BOLD, 30));
        label_2.setBounds(22, 456, 142, 40);
        f.getContentPane().add(label_2);
        
        t1 = new JTextField();
        t1.setFont(new Font("굴림", Font.BOLD, 30));
        t1.setBounds(176, 248, 260, 47);
        f.getContentPane().add(t1);
        t1.setColumns(10);
        
        t2 = new JTextField();
        t2.setFont(new Font("굴림", Font.BOLD, 30));
        t2.setColumns(10);
        t2.setBounds(176, 316, 260, 45);
        f.getContentPane().add(t2);
        
        t3 = new JTextField();
        t3.setFont(new Font("굴림", Font.BOLD, 30));
        t3.setColumns(10);
        t3.setBounds(176, 385, 260, 47);
        f.getContentPane().add(t3);
        
        t4 = new JTextField();
        t4.setFont(new Font("굴림", Font.BOLD, 30));
        t4.setColumns(10);
        t4.setBounds(176, 456, 260, 47);
        f.getContentPane().add(t4);
        
        JButton btnNewButton = new JButton("회원탈퇴");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = t1.getText();
                String pw = t2.getText();
                String name = t3.getText();
                String tel = t4.getText();
                
                MemberDAO dao = new MemberDAO();
        		try {
					dao.delete(id);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
            }
        });
        btnNewButton.setBackground(Color.MAGENTA);
        btnNewButton.setFont(new Font("GangwonEduPower", Font.BOLD, 30));
        btnNewButton.setBounds(186, 574, 142, 67);
        f.getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("회원가입화면");
        btnNewButton_1.setBackground(SystemColor.info);
        btnNewButton_1.setFont(new Font("GangwonEduPower", Font.BOLD, 40));
        btnNewButton_1.setBounds(61, 25, 365, 185);
        f.getContentPane().add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("회원가입");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String id = t1.getText();
                String pw = t2.getText();
                String name = t3.getText();
                String tel = t4.getText();
                
                MemberDAO dao = new MemberDAO();
        		try {
//					dao.insert(id, pw, name, tel);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
        	}
        });
        btnNewButton_2.setFont(new Font("GangwonEduPower", Font.BOLD, 30));
        btnNewButton_2.setBackground(Color.MAGENTA);
        btnNewButton_2.setBounds(23, 574, 142, 67);
        f.getContentPane().add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("회원정보");
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String id = JOptionPane.showInputDialog("검색할 id 입력");
        		MemberDAO dao = new MemberDAO();
        		MemberVO bag = dao.one(id);
        		dao.one(id);
        		t1.setText(bag.getId());
        		t2.setText(bag.getPw());
        		t3.setText(bag.getName());
        		t4.setText(bag.getTel());
        	}
        });
        btnNewButton_3.setFont(new Font("GangwonEduPower", Font.BOLD, 30));
        btnNewButton_3.setBackground(Color.MAGENTA);
        btnNewButton_3.setBounds(340, 574, 142, 67);
        f.getContentPane().add(btnNewButton_3);
        f.setVisible(true);
    }
}

