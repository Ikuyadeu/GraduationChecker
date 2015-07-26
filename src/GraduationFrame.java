import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraduationFrame extends JFrame {
	private JLabel title;
	private JPanel southPanel, buttonPanel, creditPanel;
	private ButtonGroup bg;
	private JRadioButton sciencebtn, systembtn;
	private JButton calcbtn;
	private JTextField[] creditNum;

	public static void main(String[] args) {
		new GraduationFrame();
	}

	public GraduationFrame() {
		// タイトルの設定
		super("卒業研究着手チェッカー");

		title = new JLabel("それぞれの単位数を入力してチェックボタンをを押してください");
		sciencebtn = new JRadioButton("工学コース", true);
		systembtn = new JRadioButton("システムコース", false);
		calcbtn = new JButton("判定開始");
		bg = new ButtonGroup();
		southPanel = new JPanel();
		buttonPanel = new JPanel();
		creditPanel = new JPanel();
		String[] creditName = { "基礎", "教養育成", "専門基礎", "専門教育", "専門必修", "選択" };
		creditNum = new JTextField[6];

		bg.add(sciencebtn);
		bg.add(systembtn);

		southPanel.setLayout(new GridLayout(3, 1));
		buttonPanel.setLayout(new FlowLayout());
		creditPanel.setLayout(new GridLayout(3, 4));

		buttonPanel.add(sciencebtn);
		buttonPanel.add(systembtn);

		for (int i = 0; i < creditName.length; i++) {
			creditNum[i] = new JTextField();
			creditPanel.add(new JLabel(creditName[i]));
			creditPanel.add(creditNum[i]);
		}

		southPanel.add(buttonPanel);
		southPanel.add(creditPanel);
		southPanel.add(calcbtn);		

		add(title, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);

		addWindowListener(new GraduationWindowListener());

		setSize(800, 400);
		setVisible(true);
	}

	class GraduationWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
