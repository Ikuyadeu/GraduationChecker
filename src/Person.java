/**
 * 入力データである体重と身長、計算結果である標準体重と判定結果を保持するクラス
 */
public class Person {

	//インスタンス変数
	/*基礎科目*/
	private int basic;
	/*教養教育*/
	private int liberal;
	/*専門基礎*/
	private int specialltyBasic;
	/*専門教育*/
	private int specialltyEducation;
	/*専門必修*/
	private int compulsory;
	
	/**
	 * 判定
	 */
	private String judge;
	
	/**
	 * インスタンスの体重の値を得る
	 * @return 体重
	 */
	public int getBasic(){
		return this.basic;
	}
	
	/**
	 * インスタンスの身長の値を得る
	 * @return 身長
	 */
	public int getLiberal(){
		return this.liberal;
	}
	/**
	 * インスタンスの身長の値を得る
	 * @return 身長
	 */
	public int getSpecialltyBasic(){
		return this.specialltyBasic;
	}
	/**
	 * インスタンスの身長の値を得る
	 * @return 身長
	 */
	public int getSpecialltyEducation(){
		return this.specialltyEducation;
	}

	/**
	 * インスタンスの標準体重の値を得る
	 * @return 標準体重
	 */
	public int getCompulsory(){
		return this.compulsory;
	}
	
	/**
	 * インスタンスの肥満度判定の結果を得る
	 * @return 肥満度判定の結果
	 */
	public String getJudge(){
	return this.judge;
	}

	/**
	 * インスタンスの体重の値を設定する
	 * @param height 体重
	 */
	public void setBasic(int basic){
		this.basic = basic;
	}
	/**
	 * インスタンスの体重の値を設定する
	 * @param height 体重
	 */
	public void setLiberal(int liberal){
		this.liberal = liberal;
	}
	/**
	 * インスタンスの体重の値を設定する
	 * @param height 体重
	 */
	public void setSpecialltyBasic(int specialltyBasic){
		this.specialltyBasic = specialltyBasic;
	}
	/**
	 * インスタンスの体重の値を設定する
	 * @param height 体重
	 */
	public void setSpecialltyEducation(int specialltyEducation){
		this.specialltyEducation = specialltyEducation;
	}
	/**
	 * インスタンスの体重の値を設定する
	 * @param height 体重
	 */
	public void setCompulsory(int compulsory){
		this.compulsory = compulsory;
	}

	/**
	 * インスタンスの肥満度判定の結果を設定する
	 * @param judge 肥満度判定の結果
	 */
	public void SetJudge(String judge)
	{
		this.judge = judge;
	}
	
}
	