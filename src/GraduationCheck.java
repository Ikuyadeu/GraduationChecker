/**
 * �e�C���X�^���X���Ăяo�����C���̃N���X
 */
public class GraduationCheck {
	// �C���X�^���X�ϐ�
	private Person p;
	private CalcGraduation calc;
	private DataDocumentation dd;
	private String result;

	/**
	 * ���ۂ̎d����S��3�̃N���X�̃C���X�^���X�����A�ϐ���������
	 * 
	 * @param method
	 *            �@�K�v�P�ʂ̌v�Z���@�̖���
	 */
	void doInit(String method) {
		p = new Person(); // Person�N���X�̃C���X�^���X�����A�C���X�^���X�ϐ�p�ɑ������

		// �v�Z���@�ɉ������N���X�̃C���X�^���X�����A�C���X�^���X�ϐ�calc�ɑ������
		try {
			calc = (CalcGraduation) Class.forName("Calc" + method + "Cource")
					.newInstance();
		}
		// ��O��\������
		catch (Exception e) {
			e.printStackTrace();
		}

		dd = new DataDocumentation(); // GraduationUI�N���X�̃C���X�^���X�����A�C���X�^���X�ϐ�ui�ɑ������
	}

	/**
	 * �C���X�^���X�ϐ��ɕێ������I�u�W�F�N�g�̃��\�b�h���g���A���ƌ������蔻��̏������s��
	 */
	void doCheak(int[] credit) {
		// �f�[�^�ݒ�
		p.setBasic(credit[0]);
		p.setLiberal(credit[1]);
		p.setSpecialltyBasic(credit[2]);
		p.setSpecialltyEducation(credit[3]);
		p.setCompulsory(credit[4]);
		p.setElective(credit[5]);

		// ���ƌ�������\���̔����ݒ�
		p.setJudge(judgeGraduation());
		// ���茋�ʂɕK�v�P�ʐ���ݒ�
		result = dd.getNeedCredit(calcNeedSum(), calcNeedBasic(),
				calcNeedSpeciallty(), calc.calcNeedElective());
		// ���茋�ʂɌv�Z�̌��ʂ�������
		result += dd.makeJudge(p.getJudge(), calc.judgeSum(p),
				calc.judgeBasic(p), calc.judgeSpeciallty(p),
				calc.judgeElective(p));
	}

	/**
	 * �K�v���v�P�ʂ̌v�Z���s��
	 * 
	 * @return �K�v���v�P�ʐ�
	 */
	private int calcNeedSum() {
		return calc.calcNeedSum();
	}

	/**
	 * �K�v��b�E���{�琬�E����b�ȖڒP�ʐ���Ԃ�
	 * 
	 * @return�@�K�v��b�E���{�琬�E����b�ȖڒP�ʐ�
	 */
	private int calcNeedBasic() {
		return calc.calcNeedBasic();
	}

	/**
	 * �K�v��勳��E���K�C�ȖڒP�ʐ���Ԃ�
	 * 
	 * @return�@�K�v��勳��E���K�C�ȖڒP�ʐ�
	 */
	private int calcNeedSpeciallty() {
		return calc.calcNeedSpeciallty();
	}

	/**
	 * ���ƌ�������\�̔��������
	 * 
	 * @return ���ƌ�������\���̔��茋��
	 */
	private boolean judgeGraduation() {
		return calc.judgeGraduation(p);
	}

	/**
	 * ���茋�ʂ�Ԃ��B
	 * 
	 * @return ���茋��
	 */
	String getResult() {
		return result;
	}
}
