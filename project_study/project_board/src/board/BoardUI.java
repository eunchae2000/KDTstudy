package board;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import board.BoardDAO;
import board.boardVO;

public class BoardUI {
	private static JTextField t1;
    private static JTextField t2;
    private static JTextField t3;
    private static JTextField t4;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.getContentPane().setBackground(new Color(177, 255, 199));
        f.setSize(500, 700);
        f.getContentPane().setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("게시글 번호");
        lblNewLabel_1.setFont(new Font("GangwonEduPower", Font.BOLD, 25));
        lblNewLabel_1.setBounds(22, 255, 142, 40);
        f.getContentPane().add(lblNewLabel_1);
        
        JLabel label = new JLabel("게시글 제목");
        label.setFont(new Font("GangwonEduPower", Font.BOLD, 25));
        label.setBounds(22, 318, 142, 40);
        f.getContentPane().add(label);
        
        JLabel label_1 = new JLabel("게시글 내용");
        label_1.setFont(new Font("GangwonEduPower", Font.BOLD, 25));
        label_1.setBounds(22, 388, 142, 40);
        f.getContentPane().add(label_1);
        
        JLabel label_2 = new JLabel("게시글 작성자");
        label_2.setFont(new Font("GangwonEduPower", Font.BOLD, 25));
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
        
        JButton btnNewButton = new JButton("게시글 삭제");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int no = Integer.parseInt(t1.getText()); 
                String title  = t2.getText();
                String content = t3.getText();
                String writer = t4.getText();
                
                BoardDAO dao = new BoardDAO();
        		try {
					dao.delete(no);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
            }
        });
        btnNewButton.setBackground(Color.MAGENTA);
        btnNewButton.setFont(new Font("GangwonEduPower", Font.BOLD, 25));
        btnNewButton.setBounds(93, 542, 299, 33);
        f.getContentPane().add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("게시판");
        btnNewButton_1.setBackground(SystemColor.info);
        btnNewButton_1.setFont(new Font("GangwonEduPower", Font.BOLD, 40));
        btnNewButton_1.setBounds(61, 25, 365, 185);
        f.getContentPane().add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("게시글 작성");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int no = Integer.parseInt(t1.getText());
                String title = t2.getText();
                String content = t3.getText();
                String writer = t4.getText();
                
                BoardDAO dao = new BoardDAO();
        		try {
					dao.insert(no, title, content, writer);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
        	}
        });
        btnNewButton_2.setFont(new Font("GangwonEduPower", Font.BOLD, 25));
        btnNewButton_2.setBackground(Color.MAGENTA);
        btnNewButton_2.setBounds(93, 508, 299, 33);
        f.getContentPane().add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("게시글 수정");
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		int no = Integer.parseInt(t1.getText());
                String title = t2.getText();
                String content = t3.getText();
                String writer = t4.getText();
                
                BoardDAO dao = new BoardDAO();
        		try {
					dao.update(no, title, content, writer);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
        	}
        });
        btnNewButton_3.setFont(new Font("GangwonEduPower", Font.BOLD, 25));
        btnNewButton_3.setBackground(Color.MAGENTA);
        btnNewButton_3.setBounds(93, 576, 299, 33);
        f.getContentPane().add(btnNewButton_3);
        
        JButton btnNewButton_3_1 = new JButton("게시글 조회");
        btnNewButton_3_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		String no1 = JOptionPane.showInputDialog("검색할 id 입력");
        		BoardDAO dao = new BoardDAO();
        		boardVO bag = dao.select(Integer.parseInt(no1));
        		t1.setText(String.valueOf(bag.getNo()));
        		t2.setText(bag.getTitle());
        		t3.setText(bag.getContent());
        		t4.setText(bag.getWriter());
        		
        	}
        });
        btnNewButton_3_1.setFont(new Font("GangwonEduPower", Font.BOLD, 25));
        btnNewButton_3_1.setBackground(Color.MAGENTA);
        btnNewButton_3_1.setBounds(93, 610, 299, 33);
        f.getContentPane().add(btnNewButton_3_1);
        f.setVisible(true);
    }
}
