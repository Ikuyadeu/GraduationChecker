/**
 * ���̓f�[�^�ł���̏d�Ɛg���A�v�Z���ʂł���W���̏d�Ɣ��茋�ʂ�ێ�����N���X
 */
public class Person {

	//�C���X�^���X�ϐ�
	/*��b�Ȗ�*/
	private int basic;
	/*���{����*/
	private int liberal;
	/*����b*/
	private int specialltyBasic;
	/*��勳��*/
	private int specialltyEducation;
	/*���K�C*/
	private int compulsory;
	
	/**
	 * ����
	 */
	private String judge;
	
	/**
	 * ��b�Ȗڂ̒P�ʐ��𓾂�
	 * @return �P�ʐ�
	 */
	public int getBasic(){
		return this.basic;
	}
	
	/**
	 * ���{����Ȗڂ̒P�ʐ��𓾂�
	 * @return �P�ʐ�
	 */
	public int getLiberal(){
		return this.liberal;
	}
	/**
	 * ����b�Ȗڂ̒P�ʐ��𓾂�
	 * @return �P�ʐ�
	 */
	public int getSpecialltyBasic(){
		return this.specialltyBasic;
	}
	/**
	 * ��勳��Ȗڂ̒P�ʐ��𓾂�
	 * @return �P�ʐ�
	 */
	public int getSpecialltyEducation(){
		return this.specialltyEducation;
	}

	/**
	  * ���K�C�Ȗڂ̒P�ʐ��𓾂�
	 * @return �P�ʐ�
	 */
	public int getCompulsory(){
		return this.compulsory;
	}
	
	/**
	 * ���ƌ������蔻��̌��ʂ𓾂�
	 * @return ���蔻��̌���
	 */
	public String getJudge(){
	return this.judge;
	}

	/**
	 * �C���X�^���X�̑̏d�̒l��ݒ肷��
	 * @param height �̏d
	 */
	public void setBasic(int basic){
		this.basic = basic;
	}
	/**
	 * �C���X�^���X�̑̏d�̒l��ݒ肷��
	 * @param height �̏d
	 */
	public void setLiberal(int liberal){
		this.liberal = liberal;
	}
	/**
	 * �C���X�^���X�̑̏d�̒l��ݒ肷��
	 * @param height �̏d
	 */
	public void setSpecialltyBasic(int specialltyBasic){
		this.specialltyBasic = specialltyBasic;
	}
	/**
	 * �C���X�^���X�̑̏d�̒l��ݒ肷��
	 * @param height �̏d
	 */
	public void setSpecialltyEducation(int specialltyEducation){
		this.specialltyEducation = specialltyEducation;
	}
	/**
	 * �C���X�^���X�̑̏d�̒l��ݒ肷��
	 * @param height �̏d
	 */
	public void setCompulsory(int compulsory){
		this.compulsory = compulsory;
	}

	/**
	 * �C���X�^���X�̔얞�x����̌��ʂ�ݒ肷��
	 * @param judge �얞�x����̌���
	 */
	public void setJudge(String judge)
	{
		this.judge = judge;
	}
	
}
	