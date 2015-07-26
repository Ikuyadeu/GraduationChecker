import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

import javax.swing.*;

public class GraduationChecker extends JFrame {
	private NumberFormat nf = NumberFormat.getNumberInstance();
	private JLabel title;
	private JPanel southPanel, buttonPanel, creditPanel;
	private ButtonGroup bg;
	private JRadioButton sciencebtn, systembtn;
	private JButton calcbtn;
	private JTextField[] creditNum;

	/**
	 * アプリケーションを起動すると実行される。 実行方法: java GraduationCheck
	 * 
	 * @param args
	 *            起動時に文字列の配列として渡される引数。計算方法（システムコースまたは工学コース）を指定する。
	 */
	public static void main(String[] args) {
		new GraduationChecker();
	}

	public GraduationChecker() {
		// タイトルの設定
		super("卒業研究着手チェッカー");
		nf.setParseIntegerOnly(true);
		nf.setMaximumIntegerDigits(4);
		nf.setGroupingUsed(false);

		title = new JLabel("それぞれの単位数を入力してチェックボタンをを押してください");
		sciencebtn = new JRadioButton("工学コース", true);
		systembtn = new JRadioButton("システムコース", false);
		calcbtn = new JButton("判定開始");
		bg = new ButtonGroup();
		southPanel = new JPanel();
		buttonPanel = new JPanel();
		creditPanel = new JPanel();
		String[] creditName = { "基礎科目", "教養育成", "専門基礎", "専門教育", "専門必修", "選択科目" };
		creditNum = new JTextField[6];

		title.setFont(new Font("TakaoGothic",Font.PLAIN,20));
		title.setHorizontalAlignment(JLabel.CENTER);
		
		
		bg.add(sciencebtn);
		bg.add(systembtn);

		calcbtn.addActionListener(new ButtonEvent());

		southPanel.setLayout(new GridLayout(3, 1));
		buttonPanel.setLayout(new FlowLayout());
		creditPanel.setLayout(new GridLayout(3, 4));

		buttonPanel.add(sciencebtn);
		buttonPanel.add(systembtn);

		for (int i = 0; i < creditName.length; i++) {
			creditNum[i] = new JFormattedTextField(nf);
			creditNum[i].setText("0");
			creditPanel.add(new JLabel(creditName[i]));
			creditPanel.add(creditNum[i]);
		}

		southPanel.add(buttonPanel);
		southPanel.add(creditPanel);
		southPanel.add(calcbtn);

		add(title, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);

		addWindowListener(new GraduationWindowListener());

		setBounds(100, 200, 800, 400);
		setVisible(true);
	}

	class GraduationWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	class ButtonEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int[] intCreditNum = new int[6];

			// コンストラクタを呼び出し、自分自身のインスタンスを作る
			GraduationCheck check = new GraduationCheck();
			for (int i = 0; i < creditNum.length; i++) {
				if (creditNum[i].getText().equals(""))
					creditNum[i].setText("0");
				intCreditNum[i] = Integer.parseInt(creditNum[i].getText());
			}
			title.setText(creditNum[1].getText());

			if (sciencebtn.isSelected()) { // 必要単位の判定をパラメタから受け取り、初期化する
				check.doInit("Science");
			} else {
				check.doInit("System");
			}

			// 単位数をチェックする
			check.doCheak(intCreditNum);

			title.setText(check.getResult());
		}
	}

}
