/**
 * 各インスタンスを呼び出すメインのクラス
 */
public class GraduationCheck {
	// インスタンス変数
	private Person p;
	private CalcGraduation calc;
	private DataDocumentation dd;
	private String result;

	/**
	 * 実際の仕事を担う3つのクラスのインスタンスを作り、変数を代入する
	 * 
	 * @param method
	 *            　必要単位の計算方法の名称
	 */
	void doInit(String method) {
		p = new Person(); // Personクラスのインスタンスを作り、インスタンス変数pに代入する

		// 計算方法に応じたクラスのインスタンスを作り、インスタンス変数calcに代入する
		try {
			calc = (CalcGraduation) Class.forName("Calc" + method + "Cource")
					.newInstance();
		}
		// 例外を表示する
		catch (Exception e) {
			e.printStackTrace();
		}

		dd = new DataDocumentation(); // GraduationUIクラスのインスタンスを作り、インスタンス変数uiに代入する
	}

	/**
	 * インスタンス変数に保持したオブジェクトのメソッドを使い、卒業研究着手判定の処理を行う
	 */
	void doCheak(int[] credit) {
		// データ設定
		p.setBasic(credit[0]);
		p.setLiberal(credit[1]);
		p.setSpecialltyBasic(credit[2]);
		p.setSpecialltyEducation(credit[3]);
		p.setCompulsory(credit[4]);
		p.setElective(credit[5]);

		// 卒業研究着手可能かの判定を設定
		p.setJudge(judgeGraduation());
		// 判定結果に必要単位数を設定
		result = dd.getNeedCredit(calcNeedSum(), calcNeedBasic(),
				calcNeedSpeciallty(), calc.calcNeedElective());
		// 判定結果に計算の結果を加える
		result += dd.makeJudge(p.getJudge(), calc.judgeSum(p),
				calc.judgeBasic(p), calc.judgeSpeciallty(p),
				calc.judgeElective(p));
	}

	/**
	 * 必要合計単位の計算を行う
	 * 
	 * @return 必要合計単位数
	 */
	private int calcNeedSum() {
		return calc.calcNeedSum();
	}

	/**
	 * 必要基礎・教養育成・専門基礎科目単位数を返す
	 * 
	 * @return　必要基礎・教養育成・専門基礎科目単位数
	 */
	private int calcNeedBasic() {
		return calc.calcNeedBasic();
	}

	/**
	 * 必要専門教育・専門必修科目単位数を返す
	 * 
	 * @return　必要専門教育・専門必修科目単位数
	 */
	private int calcNeedSpeciallty() {
		return calc.calcNeedSpeciallty();
	}

	/**
	 * 卒業研究着手可能の判定をする
	 * 
	 * @return 卒業研究着手可能かの判定結果
	 */
	private boolean judgeGraduation() {
		return calc.judgeGraduation(p);
	}

	/**
	 * 判定結果を返す。
	 * 
	 * @return 判定結果
	 */
	String getResult() {
		return result;
	}
}
