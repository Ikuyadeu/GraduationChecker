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
	 * �C���X�^���X�̑̏d�̒l�𓾂�
	 * @return �̏d
	 */
	public int getBasic(){
		return this.basic;
	}
	
	/**
	 * �C���X�^���X�̐g���̒l�𓾂�
	 * @return �g��
	 */
	public int getLiberal(){
		return this.liberal;
	}
	/**
	 * �C���X�^���X�̐g���̒l�𓾂�
	 * @return �g��
	 */
	public int getSpecialltyBasic(){
		return this.specialltyBasic;
	}
	/**
	 * �C���X�^���X�̐g���̒l�𓾂�
	 * @return �g��
	 */
	public int getSpecialltyEducation(){
		return this.specialltyEducation;
	}

	/**
	 * �C���X�^���X�̕W���̏d�̒l�𓾂�
	 * @return �W���̏d
	 */
	public int getCompulsory(){
		return this.compulsory;
	}
	
	/**
	 * �C���X�^���X�̔얞�x����̌��ʂ𓾂�
	 * @return �얞�x����̌���
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
	public void SetJudge(String judge)
	{
		this.judge = judge;
	}
	
}
	