package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class 영화앨범만들기 {
	static int start = 2;
	public static void main(String[] args) {
		
		// 영화 제목
		String[] title = {"한산","헤어질결심","라라랜드","헌트","접속"};
		
		// 포스터파일(파일이름)
		String[] img = {"한산.png","헤어질결심.png","라라랜드.png","헌트.png","접속.png"};
		
		// 평점
		double[] jumsu = {99.9, 88.9, 77.9, 66.9, 55.9};
		
		JFrame f = new JFrame();
	      f.setSize(500, 500);
	      
	      JLabel top = new JLabel(title[start]);
	      top.setBackground(Color.YELLOW);
	      top.setHorizontalAlignment(SwingConstants.CENTER);
	      top.setFont(new Font("굴림", Font.BOLD, 40));
	      f.getContentPane().add(top, BorderLayout.NORTH);
	      
	      JLabel under = new JLabel(jumsu[start]+"");
	      under.setBackground(Color.YELLOW);
	      under.setHorizontalAlignment(SwingConstants.CENTER);
	      under.setFont(new Font("굴림", Font.BOLD, 40));
	      f.getContentPane().add(under, BorderLayout.SOUTH);
	      
	      JLabel center = new JLabel("");
	      center.setHorizontalAlignment(SwingConstants.CENTER);
	      center.setIcon(new ImageIcon("/Users/coco/Desktop/KDT 백엔드/workspace/java03/라라랜드.png"));
	      f.getContentPane().add(center, BorderLayout.CENTER);
	      
	      JButton btnNewButton = new JButton(">>");
	      btnNewButton.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	        	 if(start < 4) {
	        		//<<버튼을 클릭했을 때 처리하고 싶은 내용이 있으면, 여기서 처리
	 	            //제목이 표시된 라벨에 제목을 변경해야함.
	 	            start = start + 1;
	 	            top.setText(title[start]);
	 	            under.setText(jumsu[start]+"");
	 	            ImageIcon icon = new ImageIcon(img[start]);
	 	            center.setIcon(icon);
	        	 }else {
	        		 JOptionPane.showMessageDialog(f, "여기가 오른쪽 끝 입니다.");
	        	 }
	            
	            
	         }
	      });
	      btnNewButton.setBackground(Color.GREEN);
	      btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
	      f.getContentPane().add(btnNewButton, BorderLayout.EAST);
	      
	      JButton btnNewButton_1 = new JButton("<<");
	      btnNewButton_1.addActionListener(new ActionListener() {
	         
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            //<<버튼을 클릭했을 때 처리하고 싶은 내용이 있으면, 여기서 처리
	            //제목이 표시된 라벨에 제목을 변경해야함.
	        	 if(start>0) {
	        		start = start - 1;
	 	            top.setText(title[start]);
	 	            under.setText(jumsu[start]+"");
	 	            ImageIcon icon = new ImageIcon(img[start]);
	 	            center.setIcon(icon);
	        	 }else {
	        		 JOptionPane.showMessageDialog(f, "여기가 왼쪽 끝입니다.");
	        	 }
	            
	         }
	      });
	      btnNewButton_1.setBackground(Color.GREEN);
	      btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 40));
	      f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
	      f.setVisible(true);

	}

}
