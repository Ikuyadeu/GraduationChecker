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
	 * 卒業研究着手可能かの判定を返す
	 * 
	 * @param p
	 *            個人の単位数情報
	 * @return 判定結果
	 */
	abstract String judgeGraduation(Person p);// 卒業研究可能かの判定
}
