
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
	String judgeGraduation(Person p) {
		return null;
	}//工学コースの判定




}
