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
		String judge;

		if (calcCreditSum(p) < calcNeedSum()) {
			judge = "合計単位が" + (calcNeedSum() - calcCreditSum(p)) + "単位足りません。\n";
		} else {
			judge = "";
		}

		if (calcCreditSum(p) < calcNeedSum()) {
			judge += "基礎科目、教養育成科目及び専門基礎科目が"
					+ (calcNeedBasic() - calcCreditBasic(p)) + "単位足りません。\n";
		}

		if (calcCreditSum(p) < calcNeedSum()) {
			judge += "専門教育科目　専門必修（コース別）欄の科目が"
					+ (calcNeedSpeciallty() - calcCreditSpecilallty(p))
					+ "単位足りません。\n";
		}

		if ("".equals(judge)) {
			judge = "卒業研究に着手できます。";
		}

		return judge;
	}

	private int calcCreditSum(Person p) {
		return p.getBasic() + p.getLiberal() + p.getCompulsory()
				+ p.getSpecialltyBasic() + p.getSpecialltyEducation();
	}

	private int calcCreditBasic(Person p) {
		return p.getBasic() + p.getLiberal() + p.getSpecialltyBasic();
	}

	private int calcCreditSpecilallty(Person p) {
		return p.getSpecialltyBasic() + p.getSpecialltyEducation();
	}

}
