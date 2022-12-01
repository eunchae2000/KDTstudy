package book;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataInput;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class bookListUI {
	private static JTable table;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		bookDAO dao = new bookDAO();
		ArrayList<bookVO> list = dao.list();
		
		String header[] = {"번호","제목", "장르", "출판사", "작가", "수량"};  //제목 
		
		for (bookVO bag : list) { //for-each
			System.out.println(bag.getBook_name());
			System.out.println(bag.getBook_author());
			System.out.println("-------------------");
		}
		Object[][] all = new String[list.size()][6];

		
		for (int i = 0; i<list.size(); i++) {
			bookVO bag = list.get(i);
			all[i][0] = String.valueOf(i+1);
			all[i][1] = bag.getBook_name();
			all[i][2] = bag.getBook_genre();
			all[i][3] = bag.getBook_publisher();
			all[i][4] = bag.getBook_author();
			all[i][5] = String.valueOf(bag.getBook_amount());
		}
		
        

        JPanel panel = new JPanel();
        f.getContentPane().add(panel,BorderLayout.CENTER);

        table = new JTable(all, header);
        table.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
                int rowNO = table.getSelectedRow();
                
                int colNo = table.getSelectedColumn();
                
                Object id = table.getModel().getValueAt(rowNO, 0);
                Object name = table.getModel().getValueAt(rowNO, 1);
                Object genre = table.getModel().getValueAt(rowNO, 2);
                Object publisher = table.getModel().getValueAt(rowNO, 3);
                Object author = table.getModel().getValueAt(rowNO, 4);
                Object amount = table.getModel().getValueAt(rowNO, 5);
                
             
                loanUI loan = new loanUI();
                int idn = Integer.parseInt(id.toString());
                bookVO bag1 = dao.select(idn);
    			int id5 = bag1.getBook_id();
    			System.out.println("id5: " + id5);
    			System.out.println("bag1: " + bag1);
    			
    			loan.open(idn);
    			f.dispose();
        	}
        });
        
        JScrollPane scrollPane = new JScrollPane(table); 
        panel.add(scrollPane);
        
        JLabel la = new JLabel("");
        

        

        table.setFont(new Font("조선견고딕", Font.PLAIN, 10));
        String[] row = new String[3]; //테이블 들어갈 갯수

        
        f.setSize(1000, 1000);
        f.pack();
        f.getContentPane().add(la, BorderLayout.NORTH);
        f.setVisible(true);
	}

}
