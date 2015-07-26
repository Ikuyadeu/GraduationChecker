/**
 * 各インスタンスを呼び出すメインのクラス
 */
public class GraduationCheck {
	// インスタンス変数
	private Person p;
	private CalcGraduation calc;
	private GraduationUI ui;
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
			calc = (CalcGraduation) Class.forName("Calc" + method +"Cource")
					.newInstance();
		}
		// 例外を表示する
		catch (Exception e) {
			e.printStackTrace();
		}

		ui = new GraduationUI(); // GraduationUIクラスのインスタンスを作り、インスタンス変数uiに代入する
	}

	/**
	 * インスタンス変数に保持したオブジェクトのメソッドを使い、卒業研究着手判定の処理を行う
	 */
	void doCheak(int[] credit) {
		// データ入力
		p.setBasic(credit[0]);
		p.setLiberal(credit[1]);
		p.setSpecialltyBasic(credit[2]);
		p.setSpecialltyEducation(credit[3]);
		p.setCompulsory(credit[4]);

		// 卒業研究着手可能かの判定と設定
		p.setJudge(judgeGraduation());

		result = ui.getNeedCredit(calcNeedSum(), calcNeedBasic(), calcNeedSpeciallty());
		// 判定結果の表示
		result += ui.getJudge(p.getJudge());
	}

	/**
	 * 必要単位の計算を行う
	 * 
	 * @return 必要単位数
	 */
	private int calcNeedSum() {
		return calc.calcNeedSum();
	}

	private int calcNeedBasic() {
		return calc.calcNeedBasic();
	}

	private int calcNeedSpeciallty() {
		return calc.calcNeedSpeciallty();
	}

	/**
	 * 卒業研究着手可能の判定をする
	 * 
	 * @return 卒業研究着手可能かの判定結果
	 */
	private String judgeGraduation() {
		return calc.judgeGraduation(p);
	}

	String getResult(){
		return result;
	}
}
