package book;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import javax.swing.JTextArea;


public class loanUI {
	private static JTextField textField;
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void open(int id5) {
		
		JFrame f = new JFrame();
        f.getContentPane().setLayout(null);
        f.setSize(500, 700);
        JLabel lblNewLabel = new JLabel("대출 화면");
        lblNewLabel.setFont(new Font("tway_fly", Font.PLAIN, 35));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(6, 6, 488, 56);
        f.getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1_1 = new JLabel("책 번호");
        lblNewLabel_1_1.setFont(new Font("tway_fly", Font.PLAIN, 20));
        lblNewLabel_1_1.setBounds(22, 354, 104, 30);
        f.getContentPane().add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("책 이름");
        lblNewLabel_1_1_1.setFont(new Font("tway_fly", Font.PLAIN, 20));
        lblNewLabel_1_1_1.setBounds(22, 396, 104, 30);
        f.getContentPane().add(lblNewLabel_1_1_1);
        
        JLabel lblNewLabel_1_1_1_1_1 = new JLabel("책 저자");
        lblNewLabel_1_1_1_1_1.setFont(new Font("tway_fly", Font.PLAIN, 20));
        lblNewLabel_1_1_1_1_1.setBounds(22, 438, 104, 30);
        f.getContentPane().add(lblNewLabel_1_1_1_1_1);
        
        JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("책 출판사");
        lblNewLabel_1_1_1_1_1_1.setFont(new Font("tway_fly", Font.PLAIN, 20));
        lblNewLabel_1_1_1_1_1_1.setBounds(22, 480, 104, 30);
        f.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
        
        
        textField = new JTextField();
        textField.setFont(new Font("tway_fly", Font.PLAIN, 15));
        textField.setBounds(38, 616, 238, 44);
        f.getContentPane().add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_1_1_1_1_2 = new JLabel("회원 아이디 입력");
        lblNewLabel_1_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1_1_1_2.setFont(new Font("tway_fly", Font.PLAIN, 25));
        lblNewLabel_1_1_1_1_2.setBounds(50, 586, 215, 30);
        f.getContentPane().add(lblNewLabel_1_1_1_1_2);
        
        JLabel book_id = new JLabel("책 번호1");
        book_id.setFont(new Font("tway_fly", Font.PLAIN, 20));
        book_id.setBounds(150, 354, 104, 30);
        f.getContentPane().add(book_id);
        
        JLabel book_name = new JLabel("책 이름1");
        book_name.setFont(new Font("tway_fly", Font.PLAIN, 20));
        book_name.setBounds(150, 396, 328, 30);
        f.getContentPane().add(book_name);
        
        JLabel book_author = new JLabel("책 저자1");
        book_author.setFont(new Font("tway_fly", Font.PLAIN, 20));
        book_author.setBounds(150, 438, 104, 30);
        f.getContentPane().add(book_author);
        
        JLabel book_publisher = new JLabel("책 출판사1");
        book_publisher.setFont(new Font("tway_fly", Font.PLAIN, 20));
        book_publisher.setBounds(150, 480, 223, 30);
        f.getContentPane().add(book_publisher);
        
        JLabel book_amount = new JLabel("책 수량1");
        book_amount.setFont(new Font("tway_fly", Font.PLAIN, 20));
        book_amount.setBounds(150, 522, 104, 30);
        f.getContentPane().add(book_amount);
        
        JLabel bo = new JLabel("책 수량");
        bo.setFont(new Font("tway_fly", Font.PLAIN, 20));
        bo.setBounds(22, 522, 152, 30);
        f.getContentPane().add(bo);
        
    	bookDAO dao = new bookDAO();
		bookVO bag = dao.select(id5);
		book_id.setText(String.valueOf(bag.getBook_id()));
		book_name.setText(bag.getBook_name());
		book_author.setText(bag.getBook_author());
		book_publisher.setText(bag.getBook_publisher());
		book_amount.setText(String.valueOf(bag.getBook_amount()));
		
		JButton btnNewButton = new JButton("대출하기");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		int book_id1 = Integer.parseInt(book_id.getText());
                String member_id = textField.getText();
                
                loanDAO dao = new loanDAO();
                ArrayList<loanVO> list = dao.list();
        		try {
        			loanListUI loan = new loanListUI();
					dao.insert(book_id1, member_id);
					loan.open();
					f.dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
        	}
        });
        btnNewButton.setFont(new Font("twayair", Font.PLAIN, 30));
        btnNewButton.setBounds(299, 583, 158, 77);
        f.getContentPane().add(btnNewButton);
        
        JLabel lblNewLabel_1 = new JLabel("");
        for (int i=1; i<= 7; i++) {
        	if (id5 == i) {
        		String image = "/Users/coco/Desktop/KDT 백엔드/workspace/project_study/project_team01/" + String.valueOf(i) + ".jpg";
        		lblNewLabel_1.setIcon(new ImageIcon(image));
        	}
        }
        
        
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(68, 74, 360, 268);
        f.getContentPane().add(lblNewLabel_1);
        f.setVisible(true);
		
	}
}

