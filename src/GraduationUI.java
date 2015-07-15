import java.io.*;//パッケージのクラスを使うことを宣言する

/*
 * キーボードから入力を得て、結果を画面に出力する役割を担うクラス
 */

public class GraduationUI {
	/*
	 * 標準入力からfloat型のデータを得る。入力がなかったり、数値として正しい値でなかった場合は0.0Fを返す
	 * @param str 何を入力するかを示すメッセージ
	 * @return float型の実数
	 */
	public float getValue(String str) {
		float f;

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
			f = Float.valueOf(line).floatValue();
		}

		catch (NumberFormatException e) {
			f = 0.0F;
		} catch (IOException e) {
			f = 0.0F;
		}

		return f;
	}

	/*
	 * 標準体重を画面に表示する
	 * @param w 標準体重
	 */
	public void printStdWeight(float w) {
		System.out.println("標準体重は" + w + "kg");
	}

	/*
	 * 肥満度判定を画面に表示する
	 * @param j 判定結果
	 */
	public void printJudge(String j) {
		System.out.println(j + "です");
	}

}
