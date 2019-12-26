package stdResult;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;


public class reCal {

//	ArrayList<Student> arr = new ArrayList<Student>();
	ArrayList<String> nArr = new ArrayList<String>();
	ArrayList<Integer> sArr = new ArrayList<Integer>();
	ArrayList<Integer> kArr = new ArrayList<Integer>();
	ArrayList<Integer> eArr = new ArrayList<Integer>();
	ArrayList<Integer> mArr = new ArrayList<Integer>();
	Student stC;
	Object[][] data;
	private JFrame frame;
	private JPanel mpl;
	private JPanel rpl;
	private JTable resTb;
	private JLabel nLabel;
	private JTextField nText;
	private String[] heading = new String[] {"Rank","Name"," Std ID","Avr"};	
	private JLabel sLabel;
	private JTextField sText;
	
	private JLabel kLabel;
	private JTextField kText;
	
	private JLabel eLabel;
	private JTextField eText;
	
	private JLabel mLabel;
	private JTextField mText;
	
	private JButton subBtn;
	private JButton resBtn;
	private JButton endBtn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reCal window = new reCal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public reCal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Grade Calculator");
		frame.setBounds(100, 100, 300, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		rpl = new JPanel();
		frame.getContentPane().add(rpl);
		rpl.setLayout(null);
		
		mpl = new JPanel();
		frame.getContentPane().add(mpl);
		mpl.setLayout(null);
		
		nLabel = new JLabel("Name");
		nLabel.setFont(new Font("����", Font.PLAIN, 16));
		nLabel.setBounds(40,25,60,20);
		mpl.add(nLabel);
		
		nText = new JTextField();
		nText.setBounds(100,25,130,20);
		nText.addFocusListener(null);
		mpl.add(nText);
		
		sLabel = new JLabel("Std ID");
		sLabel.setFont(new Font("����", Font.PLAIN, 16));
		sLabel.setBounds(40,60,60,20);
		mpl.add(sLabel);
		
		sText = new JTextField();
		sText.setBounds(100,60,130,20);
		mpl.add(sText);
		
		kLabel = new JLabel("Kor");
		kLabel.setFont(new Font("����", Font.PLAIN, 16));
		kLabel.setBounds(40,95,40,20);
		mpl.add(kLabel);
		
		kText = new JTextField();
		kText.setBounds(100,95,130,20);
		mpl.add(kText);
		
		eLabel = new JLabel("Eng");
		eLabel.setFont(new Font("����", Font.PLAIN, 16));
		eLabel.setBounds(40,130,40,20);
		mpl.add(eLabel);
		
		eText = new JTextField();
		eText.setBounds(100,130,130,20);
		mpl.add(eText);
		
		mLabel = new JLabel("Math");
		mLabel.setFont(new Font("����", Font.PLAIN, 16));
		mLabel.setBounds(40,165,40,20);
		mpl.add(mLabel);
		
		mText = new JTextField();
		mText.setBounds(100,165,130,20);
		mpl.add(mText);
		
//		ResultPage 
		
		
	//BTN
		subBtn = new JButton("Input");
		subBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				stC = new Student();
				nArr.add(stC.getName(nText.getText()));
				sArr.add(stC.getStd(Integer.parseInt(sText.getText())));
				kArr.add(stC.getStd(Integer.parseInt(kText.getText())));
				eArr.add(stC.getStd(Integer.parseInt(eText.getText())));
				mArr.add(stC.getStd(Integer.parseInt(mText.getText())));
			
//				System.out.println(arr.size());
				// �ؽ�Ʈ�ʵ� �ʱ�ȭ
				nText.setText("");
				sText.setText("");
				kText.setText("");
				mText.setText("");
				eText.setText("");
			}
		});
		subBtn.setBounds(20,220,70,50);
		mpl.add(subBtn);

		resBtn = new JButton("Result");
		resBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mpl.setVisible(false);
				rpl.setVisible(true);
				for (int i = 0; i < nArr.size(); i++) {
					
				}
				rpl.add(resTb);
			}
		});
		resBtn.setBounds(100,220,90,50);
		mpl.add(resBtn);
		
		endBtn = new JButton("Exit");
		endBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.dispose();
			}
		});
		endBtn.setBounds(200,220,60,50);
		mpl.add(endBtn);
		//frame.pack();
		}
}
