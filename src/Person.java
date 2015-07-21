/**
 * 入力データである単位数、計算結果である卒業研究着手可能判定結果を保持するクラス
 */
public class Person {

	// インスタンス変数
	/** 基礎科目単位数 */
	private int basic;
	/** 教養教育単位数 */
	private int liberal;
	/** 専門基礎単位数 */
	private int specialltyBasic;
	/** 専門教育単位数 */
	private int specialltyEducation;
	/** 専門必修単位数 */
	private int compulsory;

	/**
	 * 判定
	 */
	private String judge;

	/**
	 * 基礎科目の単位数を得る
	 * 
	 * @return 単位数
	 */
	public int getBasic() {
		return this.basic;
	}

	/**
	 * 教養教育科目の単位数を得る
	 * 
	 * @return 単位数
	 */
	public int getLiberal() {
		return this.liberal;
	}

	/**
	 * 専門基礎科目の単位数を得る
	 * 
	 * @return 単位数
	 */
	public int getSpecialltyBasic() {
		return this.specialltyBasic;
	}

	/**
	 * 専門教育科目の単位数を得る
	 * 
	 * @return 単位数
	 */
	public int getSpecialltyEducation() {
		return this.specialltyEducation;
	}

	/**
	 * 専門必修科目の単位数を得る
	 * 
	 * @return 単位数
	 */
	public int getCompulsory() {
		return this.compulsory;
	}

	/**
	 * 卒業研究着手判定の結果を得る
	 * 
	 * @return 着手判定の結果
	 */
	public String getJudge() {
		return this.judge;
	}

	/**
	 * インスタンスの基礎科目の値を設定する
	 * 
	 * @param basic
	 *            基礎科目
	 */
	public void setBasic(int basic) {
		this.basic = basic;
	}

	/**
	 * インスタンスの教養教育科目の単位数の値を設定する
	 * 
	 * @param liberal
	 *            教養教育科目単位数
	 */
	public void setLiberal(int liberal) {
		this.liberal = liberal;
	}

	/**
	 * インスタンスの専門基礎科目単位数の値を設定する
	 * 
	 * @param specialltyBasic
	 *            専門基礎科目単位数
	 */
	public void setSpecialltyBasic(int specialltyBasic) {
		this.specialltyBasic = specialltyBasic;
	}

	/**
	 * インスタンスの専門教育科目単位数の値を設定する
	 * 
	 * @param specialltyEducation
	 *            専門教育科目単位数
	 */
	public void setSpecialltyEducation(int specialltyEducation) {
		this.specialltyEducation = specialltyEducation;
	}

	/**
	 * インスタンスの専門必修科目の単位数の値を設定する
	 * 
	 * @param compulsory
	 *            　専門必修科目単位数
	 */
	public void setCompulsory(int compulsory) {
		this.compulsory = compulsory;
	}

	/**
	 * インスタンスの卒業研究着可能か判定の結果を設定する
	 * 
	 * @param judge
	 *           卒業研究着可能かの判定の結果
	 */
	public void setJudge(String judge) {
		this.judge = judge;
	}

}
