/**
 * システムコースでの判定方法を実装したクラス
 */
public class CalcSystemCource extends CalcGraduation {

	@Override
	int calcNeedSum() {
		return 100;
	}

	@Override
	int calcNeedBasic() {
		return 44;
	}

	@Override
	int calcNeedSpeciallty() {
		return 39;
	}

	@Override
	int calcNeedElective() {
		return 0;
	}
	
	@Override
	boolean judgeGraduation(Person p) {
		if (judgeSum(p)<0) return false;
		if (judgeBasic(p)<0) return false;
		if (judgeSpeciallty(p)<0) return false;
		return true;
	}


}
