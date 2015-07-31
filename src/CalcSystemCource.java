/**
 * システムコースでの判定方法を実装したクラス
 */
public class CalcSystemCource extends CalcGraduation {

	@Override
	int calcNeedSum() {
		return 100;
	}

	@Override
	int calcNeedBasic() {
		return 44;
	}

	@Override
	int calcNeedSpeciallty() {
		return 39;
	}

	@Override
	String judgeGraduation(Person p) {
		String judge;

		if (calcCreditSum(p) < calcNeedSum()) {
			judge = "合計単位が" + (calcNeedSum() - calcCreditSum(p)) + "単位足りません。<br>";
		} else {
			judge = "";
		}

		if (calcCreditBasic(p) < calcNeedBasic()) {
			judge += "基礎科目、教養育成科目及び専門基礎科目が"
					+ (calcNeedBasic() - calcCreditBasic(p)) + "単位足りません。<br>";
		}

		if (calcCreditSpecilallty(p) < calcNeedSpeciallty()) {
			judge += "専門教育科目　専門必修（コース別）欄の科目が"
					+ (calcNeedSpeciallty() - calcCreditSpecilallty(p))
					+ "単位足りません。<br>";
		}

		if ("".equals(judge)) {
			judge = "卒業研究に着手できます。<br>";
		}

		return judge;
	}

	/**
	 * 合計単位数を計算して返す
	 * 
	 * @param p
	 *            個人の単位数状況
	 * @return 合計単位数
	 */
	private int calcCreditSum(Person p) {
		return p.getBasic() + p.getLiberal() + p.getCompulsory()
				+ p.getSpecialltyBasic() + p.getSpecialltyEducation() + p.getElective();
	}

	/**
	 * 基礎科目、教養育成科目及び専門基礎科目単位数を計算して返す
	 * 
	 * @param p
	 *            個人の単位数状況
	 * @return 基礎科目、教養育成科目及び専門基礎科目単位数
	 */
	private int calcCreditBasic(Person p) {
		return p.getBasic() + p.getLiberal() + p.getSpecialltyBasic();
	}

	/**
	 * 基礎科目、教養育成科目及び専門基礎科目単位数を計算して返す
	 * 
	 * @param p
	 *            個人の単位数状況
	 * @return 基礎科目、教養育成科目及び専門基礎科目単位数
	 */
	private int calcCreditSpecilallty(Person p) {
		return p.getSpecialltyBasic() + p.getSpecialltyEducation();
	}

}
