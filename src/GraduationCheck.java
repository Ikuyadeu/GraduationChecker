/**
 * �e�C���X�^���X���Ăяo�����C���̃N���X
 */
public class GraduationCheck {
	// �C���X�^���X�ϐ�
	private Person p;
	private CalcGraduation calc;
	private GraduationUI ui;
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
			calc = (CalcGraduation) Class.forName("Calc" + method +"Cource")
					.newInstance();
		}
		// ��O��\������
		catch (Exception e) {
			e.printStackTrace();
		}

		ui = new GraduationUI(); // GraduationUI�N���X�̃C���X�^���X�����A�C���X�^���X�ϐ�ui�ɑ������
	}

	/**
	 * �C���X�^���X�ϐ��ɕێ������I�u�W�F�N�g�̃��\�b�h���g���A���ƌ������蔻��̏������s��
	 */
	void doCheak(int[] credit) {
		// �f�[�^����
		p.setBasic(credit[0]);
		p.setLiberal(credit[1]);
		p.setSpecialltyBasic(credit[2]);
		p.setSpecialltyEducation(credit[3]);
		p.setCompulsory(credit[4]);

		// ���ƌ�������\���̔���Ɛݒ�
		p.setJudge(judgeGraduation());

		result = ui.getNeedCredit(calcNeedSum(), calcNeedBasic(), calcNeedSpeciallty());
		// ���茋�ʂ̕\��
		result += ui.getJudge(p.getJudge());
	}

	/**
	 * �K�v�P�ʂ̌v�Z���s��
	 * 
	 * @return �K�v�P�ʐ�
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
	 * ���ƌ�������\�̔��������
	 * 
	 * @return ���ƌ�������\���̔��茋��
	 */
	private String judgeGraduation() {
		return calc.judgeGraduation(p);
	}

	String getResult(){
		return result;
	}
}
