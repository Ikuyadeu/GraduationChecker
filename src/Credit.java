/**
 * 単位の情報を格納するクラス
 * 
 */
public class Credit {
	/**科目名*/
	public String name;
	/** 科目分類*/
	public String category;
	/** 科目分類2*/
	public String category2;
	/** 取得単位数*/
	public int creditnum;
	
	Credit(String name,String category,String category2,int creditnum){
		this.name = name;
		this.category = category;
		this.category2 = category2;
		this.creditnum = creditnum;
	}
}
