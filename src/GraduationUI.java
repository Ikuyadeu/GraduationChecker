import java.io.*;//パッケージのクラスを使うことを宣言する

/**
 * キーボードから入力を得て、結果を画面に出力する役割を担うクラス
 */

public class GraduationUI {
	/**
	 * 標準入力からint型のデータを得る。入力がなかったり、数値として正しい値でなかった場合は0.0Fを返す
	 * 
	 * @param str
	 *            何を入力するかを示すメッセージ
	 * @return int型の実数
	 */
	public int getValue(String str) {
		int f;

		// キーボードから入力するため、標準入力をつかう準備をする
		InputStreamReader rin = new InputStreamReader(System.in);
		BufferedReader dis = new BufferedReader(rin);

		// 引数で渡された文字列を使って入力を求めるメッセージを標準出力に表示する
		System.out.println(str);
		System.out.flush();

		try {
			// 標準入力を１行読む
			String line = dis.readLine();

			// 入力した値をfloat型の実数（浮動小数点）に変換する
			f = Float.valueOf(line).intValue();
		}

		catch (NumberFormatException e) {
			f = 0;
		} catch (IOException e) {
			f = 0;
		}

		return f;
	}

	/**
<<<<<<< HEAD
	 * 必要単位数を画面に表示する
	 * 
	 * @param sum
	 *            必要合計単位数
	 * @param basic
	 *            必要基礎科目、教養育成科目及び専門基礎科目
	 * @param speciallty
	 *            必要専門教育科目　専門必修
=======
	 * 必要単位数を画面に表示する
	 * 
	 * @param sum
	 *            必要合計単位数
	 * @param basic
	 *            必要基礎科目、教養育成科目及び専門基礎科目
	 * @param speciallty
	 *            必要専門教育科目　専門必修
	 */

	public String getNeedCredit(int sum, int basic, int speciallty) {
		String result;
		result = "<html>必要合計単位数は" + sum + "単位<br>";
		result += "基礎科目、教養育成科目及び専門基礎科目は" + basic + "単位<br>";
		result += "専門教育科目　専門必修は" + speciallty + "単位<br><br>";
		return result;
	}

	/**
	 * 研究着手可能判定を画面に表示する
	 * 
	 * @param j
	 *            判定結果
	 */
	public String getJudge(String j) {
		String result;
		result = "計算結果：<br>";
		result += j + "<br></html>";
		return result;
	}

}
