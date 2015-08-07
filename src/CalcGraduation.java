/**
 * 必要な単位数や卒業研究着手可能かを調べて返す抽象クラス
 */
public abstract class CalcGraduation {
	/**
	 * 各コースの必要合計単位数を返す
	 * 
	 * @return　必要合計単位数
	 */
	abstract int calcNeedSum();

	/**
	 * 各コースの必要基礎・教養育成・専門基礎科目単位数を返す
	 * 
	 * @return　必要基礎・教養育成・専門基礎科目単位数
	 */
	abstract int calcNeedBasic();

	/**
	 * 各コースの必要専門教育・専門必修科目単位数を返す
	 * 
	 * @return　必要専門教育・専門必修科目単位数
	 */
	abstract int calcNeedSpeciallty();

	/**
	 * 必要選択科目単位数を返す
	 * 
	 * @return　必要選択科目単位数
	 */
	abstract int calcNeedElective();
	
	/**
	 * 必要合計単位と実際の単位数の差を返す
	 * 足りていない場合は不の値を返す
	 * 
	 * @param p 個人の単位数情報
	 * @return　単位数の差
	 */
	int judgeSum(Person p) {
		return calcCreditSum(p) - calcNeedSum();
	}

	/**
	 * 必要な基礎・教養育成・専門基礎科目単位と実際の単位数の差を返す
	 * 
	 * @param p 個人の単位数情報
	 * @return　単位数の差
	 */
	int judgeBasic(Person p) {
		return calcCreditBasic(p) - calcNeedBasic();
	}

	/**
	 * 必要な専門教育・専門単位と実際の単位数の差を返す
	 * 
	 * @param p 個人の単位数情報
	 * @return　単位数の差
	 */
	int judgeSpeciallty(Person p) {
		return calcCreditSpecilallty(p) - calcNeedSpeciallty();
	}
	
	/**
	 * 必要な選択科目単位と実際の単位数の差を返す
	 * 
	 * @param p 個人の単位数情報
	 * @return　単位数の差
	 */
	int judgeElective(Person p) {
		return p.getElective() - calcNeedElective();
	}
	
	/**
	 * 卒業研究着手可能かの判定を返す
	 * 
	 * @param p
	 *            個人の単位数情報
	 * @return 判定結果
	 */
	abstract boolean judgeGraduation(Person p);
	
	/**
	 * 合計単位数を計算して返す
	 * 
	 * @param p
	 *            個人の単位数状況
	 * @return 合計単位数
	 */
	protected int calcCreditSum(Person p) {
		return p.getBasic() + p.getLiberal() + p.getCompulsory()
				+ p.getSpecialltyBasic() + p.getSpecialltyEducation()
				+ p.getElective();
	}
	
	/**
	 * 基礎科目、教養育成科目及び専門基礎科目単位数を計算して返す
	 * 
	 * @param p
	 *            個人の単位数状況
	 * @return 基礎科目、教養育成科目及び専門基礎科目単位数
	 */
	protected int calcCreditBasic(Person p) {
		return p.getBasic() + p.getLiberal() + p.getSpecialltyBasic();
	}

	/**
	 * 基礎科目、教養育成科目及び専門基礎科目単位数を計算して返す
	 * 
	 * @param p
	 *            個人の単位数状況
	 * @return 基礎科目、教養育成科目及び専門基礎科目単位数
	 */
	protected int calcCreditSpecilallty(Person p) {
		return p.getSpecialltyBasic() + p.getSpecialltyEducation();
	}
}
