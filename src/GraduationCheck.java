public class GraduationCheck {
	// �C���X�^���X�ϐ�
	private Person p;
	private CalcGraduation calc;
	private GraduationUI ui;

	/**
	 * ���ۂ̎d����S��3�̃N���X�̃C���X�^���X�����A�ϐ���������
	 * 
	 * @param method
	 *            �@�K�v�P�ʂ̌v�Z���@�̖���
	 */
	private void doInit(String method) {
		p = new Person(); // Person�N���X�̃C���X�^���X�����A�C���X�^���X�ϐ�p�ɑ������

		// �v�Z���@�ɉ������N���X�̃C���X�^���X�����A�C���X�^���X�ϐ�calc�ɑ������
		try {
			calc = (CalcGraduation) Class.forName("Calc" + method)
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
	private void doCheak() {
		// �f�[�^����
		p.setBasic(ui.getValue("��b�Ȗڂ̒P�ʂ���͂��Ă�������: "));
		p.setLiberal(ui.getValue("���{����̒P�ʂ���͂��Ă�������: "));
		p.setSpecialltyBasic(ui.getValue("����b�̒P�ʂ���͂��Ă�������: "));
		p.setSpecialltyEducation(ui.getValue("��勳��̒P�ʂ���͂��Ă�������: "));
		p.setCompulsory(ui.getValue("���K�C�̒P�ʂ���͂��Ă�������: "));

		// ���ƌ�������\���̔���Ɛݒ�
		p.setJudge(judgeGraduation());

		ui.printNeedCredit(calcNeedSum(), calcNeedBasic(), calcNeedSpeciallty());
		// ���茋�ʂ̕\��
		ui.printJudge(p.getJudge());
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

	/**
	 * �A�v���P�[�V�������N������Ǝ��s�����B ���s���@: java GraduationCheck SystemCource �܂��� java
	 * GraduationCheck ScienceCource
	 * 
	 * @param args
	 *            �N�����ɕ�����̔z��Ƃ��ēn���������B�v�Z���@�i�V�X�e���R�[�X�܂��͍H�w�R�[�X�j���w�肷��B
	 */
	public static void main(String args[]) {
		// �R���X�g���N�^���Ăяo���A�������g�̃C���X�^���X�����
		GraduationCheck check = new GraduationCheck();

		// �K�v�P�ʂ̔�����p�����^����󂯎��A����������
		check.doInit(args[0]);

		// �P�ʐ����`�F�b�N����
		check.doCheak();
	}
}
