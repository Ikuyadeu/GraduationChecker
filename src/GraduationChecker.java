import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

import javax.swing.*;

/**
 * 実際に入出力をされるものを管理する役割のクラス
 */
public class GraduationChecker extends JFrame {
	/** デフォルトシリアルバージョンID */
	private static final long serialVersionUID = 1L;
	/** 入力フォームのフォーマット */
	private NumberFormat nf = NumberFormat.getNumberInstance();
	/** 中心で出力される文字列 */
	private JLabel title;
	/** ボタンやレイアウトを整える集合 */
	private JPanel southPanel, buttonPanel, creditPanel;
	/** ラジオボタンの集合 */
	private ButtonGroup bg;
	/** 工学コース・システムコースのラジオボタン */
	private JRadioButton sciencebtn, systembtn;
	/** 動作を決定するときのボタン */
	private JButton calcbtn;
	/** ６つの科目の単位数の入力を受け付ける入力フォーム */
	private JTextField[] creditNum;

	/**
	 * アプリケーションを起動すると実行される。 実行方法: java GraduationChecker
	 * 
	 * @param args
	 *            起動時に文字列の配列として渡される引数。計算方法（システムコースまたは工学コース）を指定する。
	 */
	public static void main(String[] args) {
		new GraduationChecker();
	}

	/**
	 * 見た目を設定する
	 */
	public GraduationChecker() {
		// タイトルの設定
		super("卒業研究着手チェッカー");

		// フォーマットを４桁までの整数に設定する
		nf.setParseIntegerOnly(true);
		nf.setMaximumIntegerDigits(4);
		nf.setGroupingUsed(false);

		// 真ん中の表示の初期化
		title = new JLabel("それぞれの単位数を入力してチェックボタンをを押してください");
		// 見やすいようにフォントと位置を調整
		title.setFont(new Font("TakaoGothic", Font.PLAIN, 15));
		title.setHorizontalAlignment(JLabel.CENTER);

		// それぞれのコースのラジオボタンを作成
		sciencebtn = new JRadioButton("工学コース", true);
		systembtn = new JRadioButton("システムコース", false);
		// ラジオボタンのグループを作成
		bg = new ButtonGroup();
		// グループに２つのボタンを設定
		bg.add(sciencebtn);
		bg.add(systembtn);

		// 計算をするためのボタンを作成
		calcbtn = new JButton("判定開始");
		// 計算ボタンの動作を設定
		calcbtn.addActionListener(new ButtonEvent());

		// 全体のレイアウトを作成
		southPanel = new JPanel();
		buttonPanel = new JPanel();
		creditPanel = new JPanel();
		// 科目名の配列の宣言
		String[] creditName = { "基礎科目", "教養育成", "専門基礎", "専門教育", "専門必修", "選択科目" };
		creditNum = new JTextField[6];

		// 下側のレイアウトを３×１に設定
		southPanel.setLayout(new GridLayout(3, 1));
		// ラジオボタンを並列に設定
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(sciencebtn);
		buttonPanel.add(systembtn);

		// 入力フォームを３×４に設定
		creditPanel.setLayout(new GridLayout(3, 4));

		// 入力フォームにそれぞれの名前とフォームの設定をレイアウトする。
		for (int i = 0; i < creditName.length; i++) {
			creditNum[i] = new JFormattedTextField(nf);
			// 初期値として0を設定
			creditNum[i].setText("0");
			creditPanel.add(new JLabel(creditName[i]));
			creditPanel.add(creditNum[i]);
		}

		// 下側のレイアウトにボタン、入力フォーム、判定ボタンの順に設定
		southPanel.add(buttonPanel);
		southPanel.add(creditPanel);
		southPanel.add(calcbtn);

		// 真ん中の出力をレイアウトする
		add(title, BorderLayout.CENTER);
		// 下側のレイアウトを設定
		add(southPanel, BorderLayout.SOUTH);

		// ウィンドウの動作を設定
		addWindowListener(new GraduationWindowListener());

		// (550,300)の位置に600×600のウィンドウを表示するよう設定
		setBounds(550, 300, 600, 600);
		// ウィンドウが透明にならないように設定
		setVisible(true);
	}

	/**
	 * ウィンドウの動作を設定するクラス
	 */
	class GraduationWindowListener extends WindowAdapter {
		/**
		 * ウィンドウを閉じたときにシステムを終了する
		 */
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	/**
	 * ボタンを押した後の動作を格納するクラス
	 * 
	 */
	class ButtonEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int[] intCreditNum = new int[6];

			// コンストラクタを呼び出し、自分自身のインスタンスを作る
			GraduationCheck check = new GraduationCheck();
			for (int i = 0; i < creditNum.length; i++) {
				// 中身になにもはいっていなければ0を設定
				if (creditNum[i].getText().equals("")) {
					creditNum[i].setText("0");
				}
				// それぞれのフォームの内容を整数型に変換して格納
				intCreditNum[i] = Integer.parseInt(creditNum[i].getText());
			}

			if (sciencebtn.isSelected()) { // 必要単位の判定をパラメタから受け取り、初期化する
				check.doInit("Science");
			} else {
				check.doInit("System");
			}

			// 単位数をチェックする
			check.doCheak(intCreditNum);
			// 判定結果を出力
			title.setText(check.getResult());
		}
	}

}
