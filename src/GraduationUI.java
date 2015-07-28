import java.io.*;//パッケージのクラスを使うことを宣言する

/**
 * 数値を得て、文字列にまとめた結果を返す役割を担うクラス
 */

public class GraduationUI {
	/**
	 * 必要単位数をあらわす文字列を返す
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
	 * 研究着手可能判定を文字列にして返す。
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
