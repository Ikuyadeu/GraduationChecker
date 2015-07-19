public abstract class CalcGraduation {
	abstract int calcNeedSum(); //必要合計単位を返す
	abstract int calcNeedBasic(); //必要基礎・教養育成・専門基礎科目数をを返す
	abstract int calcNeedSpeciallty();//必要専門教育・専門必修科目数を返す
	abstract String judgeGraduation(Person p);// 卒業研究可能かの判定
}
