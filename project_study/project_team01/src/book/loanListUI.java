package book;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class loanListUI {
	private static JTable table;
	public static void open() {
		JFrame f = new JFrame();
		
		loanDAO dao  = new loanDAO();
		bookDAO dao1 = new bookDAO();
		ArrayList<loanVO> list = dao.list();
		
		String header[] = {"번호","제목","대여일", "반납일", "대여 기간", "연채료"};  //제목 
		
		for (loanVO bag : list) { //for-each
			System.out.println(bag.getLoan_bm());
			System.out.println(bag.getMember_id());
			System.out.println("-------------------");
		}
		Object[][] all = new String[list.size()][6];

		
		
		for (int i = 0; i<list.size(); i++) {
			loanVO bag = list.get(i);
			bookVO bag1 = dao1.select(i);
			bookVO real_bag = dao1.select(bag.getBook_id());

			all[i][0] = String.valueOf(i+1);
			all[i][1] = real_bag.getBook_name(); 
			all[i][2] = String.valueOf(list.get(i).getLoan_rental());
			all[i][3] = String.valueOf(list.get(i).getLoan_return());
			all[i][4] = String.valueOf(list.get(i).getLoan_day());
			all[i][5] = String.valueOf(list.get(i).getLoan_bm());
		}
		
        

        JPanel panel = new JPanel();
        f.getContentPane().add(panel,BorderLayout.CENTER);

        table = new JTable(all, header);
        
        JScrollPane scrollPane = new JScrollPane(table); 
        panel.add(scrollPane);
        
        JLabel la = new JLabel("");
        
        table.addMouseListener(new MouseAdapter() {
        	public void mouseclicked(MouseEvent e) {
        		int rowNo = table.getSelectedRow();
        		int colNo = table.getSelectedColumn();
        	
        	}
        });
        

        table.setFont(new Font("조선견고딕", Font.PLAIN, 10));
        String[] row = new String[3]; //테이블 들어갈 갯수

        
        f.setSize(1000, 1000);
        f.pack();
        f.getContentPane().add(la, BorderLayout.NORTH);
        f.setVisible(true);
	}
	 
}
