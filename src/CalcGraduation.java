public abstract class CalcGraduation {
	/**
	 * 各コースの必要合計単位数を返す
	 * @return　必要合計単位数
	 */
	abstract int calcNeedSum(); //必要合計単位を返す
	/**
	 * 各コースの必要基礎・教養育成・専門基礎科目単位数を返す
	 * @return　必要基礎・教養育成・専門基礎科目単位数
	 */
	abstract int calcNeedBasic(); //必要基礎・教養育成・専門基礎科目数をを返す
	/**
	 * 各コースの必要専門教育・専門必修科目単位数を返す
	 * @return　必要専門教育・専門必修科目単位数
	 */
	abstract int calcNeedSpeciallty();//必要専門教育・専門必修科目数を返す
	/**
	 * 卒業研究着手か農家の判定を帰す
	 * @param p 個人の単位数情報
	 * @return 判定結果
	 */
	abstract String judgeGraduation(Person p);// 卒業研究可能かの判定
}
