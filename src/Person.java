/**
 * ���̓f�[�^�ł���P�ʐ��A�v�Z���ʂł��鑲�ƌ�������\���茋�ʂ�ێ�����N���X
 */
public class Person {

	// �C���X�^���X�ϐ�
	/** ��b�ȖڒP�ʐ� */
	private int basic;
	/** ���{����P�ʐ� */
	private int liberal;
	/** ����b�P�ʐ� */
	private int specialltyBasic;
	/** ��勳��P�ʐ� */
	private int specialltyEducation;
	/** ���K�C�P�ʐ� */
	private int compulsory;

	/**
	 * ����
	 */
	private String judge;

	/**
	 * ��b�Ȗڂ̒P�ʐ��𓾂�
	 * 
	 * @return �P�ʐ�
	 */
	public int getBasic() {
		return this.basic;
	}

	/**
	 * ���{����Ȗڂ̒P�ʐ��𓾂�
	 * 
	 * @return �P�ʐ�
	 */
	public int getLiberal() {
		return this.liberal;
	}

	/**
	 * ����b�Ȗڂ̒P�ʐ��𓾂�
	 * 
	 * @return �P�ʐ�
	 */
	public int getSpecialltyBasic() {
		return this.specialltyBasic;
	}

	/**
	 * ��勳��Ȗڂ̒P�ʐ��𓾂�
	 * 
	 * @return �P�ʐ�
	 */
	public int getSpecialltyEducation() {
		return this.specialltyEducation;
	}

	/**
	 * ���K�C�Ȗڂ̒P�ʐ��𓾂�
	 * 
	 * @return �P�ʐ�
	 */
	public int getCompulsory() {
		return this.compulsory;
	}

	/**
<<<<<<< HEAD
<<<<<<< HEAD
	 * �C���X�^���X�̑̏d�̒l��ݒ肷��
	 * @param  �̏d
=======
	 * ���ƌ������蔻��̌��ʂ𓾂�
	 * 
	 * @return ���蔻��̌���
>>>>>>> refs/heads/last
=======
	 * ���ƌ������蔻��̌��ʂ𓾂�
	 * 
	 * @return ���蔻��̌���
>>>>>>> refs/heads/new
	 */
	public String getJudge() {
		return this.judge;
	}

	/**
	 * �C���X�^���X�̊�b�Ȗڂ̒l��ݒ肷��
	 * 
	 * @param basic
	 *            ��b�Ȗ�
	 */
	public void setBasic(int basic) {
		this.basic = basic;
	}

	/**
	 * �C���X�^���X�̋��{����Ȗڂ̒P�ʐ��̒l��ݒ肷��
	 * 
	 * @param liberal
	 *            ���{����ȖڒP�ʐ�
	 */
	public void setLiberal(int liberal) {
		this.liberal = liberal;
	}

	/**
	 * �C���X�^���X�̐���b�ȖڒP�ʐ��̒l��ݒ肷��
	 * 
	 * @param specialltyBasic
	 *            ����b�ȖڒP�ʐ�
	 */
	public void setSpecialltyBasic(int specialltyBasic) {
		this.specialltyBasic = specialltyBasic;
	}

	/**
	 * �C���X�^���X�̐�勳��ȖڒP�ʐ��̒l��ݒ肷��
	 * 
	 * @param specialltyEducation
	 *            ��勳��ȖڒP�ʐ�
	 */
	public void setSpecialltyEducation(int specialltyEducation) {
		this.specialltyEducation = specialltyEducation;
	}

	/**
	 * �C���X�^���X�̐��K�C�Ȗڂ̒P�ʐ��̒l��ݒ肷��
	 * 
	 * @param compulsory
	 *            �@���K�C�ȖڒP�ʐ�
	 */
	public void setCompulsory(int compulsory) {
		this.compulsory = compulsory;
	}

	/**
	 * �C���X�^���X�̑��ƌ������\������̌��ʂ�ݒ肷��
	 * 
	 * @param judge
	 *           ���ƌ������\���̔���̌���
	 */
	public void setJudge(String judge) {
		this.judge = judge;
	}

}
