import junit.framework.TestCase;

import org.junit.Test;


public class CalcScienceCourceTest extends TestCase{
	CalcScienceCource calc;
	Person p;
	
	/**計算法のインスタンス生成*/
	private void makeCalc(){
		calc = new CalcScienceCource();
	}
	
	/**Personのインスタンス生成*/
	private void makePerson(){
		p = new Person();
	}
	
	/**Personを単位を完璧にとらせた状態に設定する*/
	private void setPerfectPerson(){
		p.setBasic(100);
		p.setCompulsory(100);
		p.setLiberal(100);
		p.setSpecialltyBasic(100);
		p.setSpecialltyEducation(100);
		p.setElective(100);
	}
	
	/**Personを単位をとれてない状態に設定する*/
	private void setBadPerson(){
		p.setBasic(0);
		p.setCompulsory(0);
		p.setLiberal(0);
		p.setSpecialltyBasic(0);
		p.setSpecialltyEducation(0);
	}

	@Test
	public void testJudgeGraduation1() {
		makeCalc();
		makePerson();
		setBadPerson();
		assertFalse(calc.judgeGraduation(p));
	}

	@Test
	public void testJudgeGraduation2() {
		makeCalc();
		makePerson();
		setBadPerson();
		p.setElective(100);
		assertFalse(calc.judgeGraduation(p));
	}
	
	@Test
	public void testJudgeGraduation3() {
		makeCalc();
		makePerson();
		setBadPerson();
		p.setBasic(100);
		assertFalse(calc.judgeGraduation(p));
	}
	
	@Test
	public void testJudgeGraduation4() {
		makeCalc();
		makePerson();
		setBadPerson();
		p.setBasic(100);
		p.setSpecialltyBasic(100);
		assertFalse(calc.judgeGraduation(p));
	}
	
	@Test
	public void testJudgeGraduation5() {
		makeCalc();
		makePerson();
		setPerfectPerson();
		assertTrue(calc.judgeGraduation(p));
	}
	

}
