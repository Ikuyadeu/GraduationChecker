/**
 * 工学コースでの判定方法を実装したクラス
 */
public class CalcScienceCource extends CalcGraduation {

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
		return 12;
	}

	@Override
	int calcNeedElective() {
		return 9;
	}

	@Override
	int judgeSum(Person p) {
		return calcCreditSum(p) - calcNeedSum();
	}

	@Override
	int judgeBasic(Person p) {
		return calcCreditBasic(p) - calcNeedBasic();
	}

	@Override
	int judgeSpeciallty(Person p) {
		return calcCreditSpecilallty(p) - calcNeedSpeciallty();
	}
	
	@Override
	int judgeElective(Person p) {
		return p.getElective() - calcNeedElective();
	}
	
	@Override
	boolean judgeGraduation(Person p) {
		if (judgeSum(p)<0) return false;
		if (judgeBasic(p)<0) return false;
		if (judgeSpeciallty(p)<0) return false;
		if (judgeElective(p)<0) return false;
		return true;
	}

}
