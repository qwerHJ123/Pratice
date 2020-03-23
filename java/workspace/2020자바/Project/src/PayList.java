import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class PayList extends BaseFrame {
	String str[] = { "상품 번호", "상품명", "상품 가격", "주문 개수", "총 가격", "배달 주소" };
	JScrollPane jsc = new JScrollPane();

	public PayList() {
		super(800, 500, "구매리스트", new BorderLayout(), 2);
		setDesign();
		setVisible(true);
	}

	private void setDesign() {
		add(jp[0] = new JPanel(new GridLayout(1, 0)), BorderLayout.NORTH);
		add(jsc = new JScrollPane(jp[1] = new JPanel(new GridLayout(0, 1))), BorderLayout.CENTER);
		add(jp[2] = new JPanel(new FlowLayout(FlowLayout.RIGHT)), BorderLayout.SOUTH);
		for (int i = 0; i < 6; i++) {
			jp[0].add(jl[0] = new JLabel(str[i]));
			jl[0].setFont(new Font("", Font.BOLD, 15));
		}
		jp[2].add(jb[0] = new JButton("확인"));
		try (ResultSet rs = stmt.executeQuery("select * from purchaselist where u_no ='" + userNo + "' limit 3")) {
			while (rs.next()) {
				JPanel addjp = new JPanel(new GridLayout(1, 0));
				jp[1].add(addjp);
				addjp.add(new JLabel(rs.getString(3)));
				addjp.add(new JLabel(rs.getString(2)));
				addjp.add(new JLabel(rs.getString(4)));
				addjp.add(new JLabel(rs.getString(8)));
				addjp.add(new JLabel(rs.getString(9)));
				addjp.add(new JLabel(rs.getString(7)));
				addjp.setBorder(new LineBorder(Color.pink));
				addjp.setPreferredSize(new Dimension(0, 80));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		jb[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				openFrame(new ProductForm());
			}
		});
	}

	void openJFrame() {
		new ProductForm();
	}
	
	public static void main(String[] args) {
		new PayList().setVisible(true);
	}
}
