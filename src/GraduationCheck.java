	
	public class GraduationCheck {
		//インスタンス変数
			private Person p;
			private CalcGraduation calc;
			private GraduationUI ui;
			
			/**
			 * 実際の仕事を担う3つのクラスのインスタンスを作り、変数を代入する
			 * @param method　肥満度の計算方法の名称
			 */
			private void doInit(String method)
			{
		      p=new Person(); //Personクラスのインスタンスを作り、インスタンス変数pに代入する
		 
		      //計算方法に応じたクラスのインスタンスを作り、インスタンス変数calcに代入する
		      try
		      {
		          calc=(CalcGraduation)Class.forName("Calc"+method).newInstance();
		      }
		      //例外を表示する
		      catch (Exception e)
		      {
		    	  e.printStackTrace();
		      }
		      
		      ui=new GraduationUI(); //HalthUIクラスのインスタンスを作り、インスタンス変数uiに代入する
		    }
				
			/**
			 * インスタンス変数に保持したオブジェクトのメソッドを使い、肥満度判定の処理を行う
		     */
			private void doCheak()
		    {
			  //データ入力
		      p.setBasic(ui.getValue("基礎科目の単位を入力してください: "));
		      p.setLiberal(ui.getValue("教養教育の単位を入力してください: "));
		      p.setSpecialltyBasic(ui.getValue("専門基礎の単位を入力してください: "));
		      p.setSpecialltyEducation(ui.getValue("専門教育の単位を入力してください: "));
		      p.setCompulsory(ui.getValue("専門必修の単位を入力してください: "));

		      
		      //卒業研究着手可能かの判定と設定
		      p.setJudge(judgeGraduation());
		      
		      ui.printNeedCredit(calcNeedCredit());
		      //判定結果の表示
		      ui.printJudge(p.getJudge());
		    }
			
		    /**
		     * 必要単位の計算を行う
		     * @return 必要単位数
			 */
		    private int calcNeedCredit()
		    {
		      return calc.calcNeedCredit(p);	
		    }
			
		    /**
		     * 肥満度の判定をする
		     * @return 肥満度の判定結果
			 */
		    private String judgeGraduation()
		    {
		      return calc.judgeGraduation(p);
		    }
	
		    /**
		     * アプリケーションを起動すると実行される。
		     * 実行方法:
		     * java HealthCheck2 Broker
			 * または
			 * java HealthCheck2 BMI
		     * @param args 起動時に文字列の配列として渡される引数。計算方法（BMIまたはBroker）を指定する。
		     */
		    public static void main(String args[])
		    {
		    	//コンストラクタを呼び出し、自分自身のインスタンスを作る
		    	GraduationCheck check=new GraduationCheck();
			
		    	//必要単位の判定をパラメタから受け取り、初期化する
		    	check.doInit(args[0]);
			
		    	//単位数をチェックする
		    	check.doCheak();
		    }
	}
