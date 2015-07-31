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
	public String getNeedCredit(int sum, int basic, int speciallty, int elective) {
		String result;
		result = "<html>必要合計単位数は" + sum + "単位<br>";
		result += "基礎科目、教養育成科目及び専門基礎科目は" + basic + "単位<br>";
		result += "専門教育科目　専門必修は" + speciallty + "単位<br>";
		if (elective != 0)
			result += "選択科目は" + elective + "単位<br>";
		result += "<br>";
		return result;
	}

	/**
	 * 判定結果の文字列を作成して返す
	 * 
	 * @param j
	 *            卒業研究に着手できるかどうか
	 * @param sum
	 *            合計単位数の必要分との差
	 * @param basic
	 *            基礎科目、教養育成科目および専門基礎科目の必要分との差
	 * @param specially
	 *            //専門教育、専門必修の必要分との差
	 * @param elective
	 *            //選択科目の必要分との差
	 * @return　判定結果の文字列
	 */
	public String makeJudge(boolean j, int sum, int basic, int specially,
			int elective) {
		String judge = "";
		if (j) {
			judge = "卒業研究に着手できます。<br></html>";
		} else {
			if (sum < 0) {
				judge += "合計単位が" + -1 * sum + "単位足りません。<br>";
			}

			if (basic < 0) {
				judge += "基礎科目、教養育成科目及び専門基礎科目が" + -1 * basic + "単位足りません。<br>";
			}

			if (specially < 0) {
				judge += "専門教育科目　専門必修（コース別）欄の科目が" + -1 * specially
						+ "単位足りません。<br>";
			}

			if (elective < 0) {
				judge += "選択科目科目が" + -1 * elective + "単位足りません。<br>";
			}
			judge += "卒業研究に着手できません<br></html>";
		}

		return judge;
	}

}
