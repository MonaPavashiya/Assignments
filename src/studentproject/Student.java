package studentproject;

public class Student 
{

	String name;
	int mathScore;
	int engScore;
	int sciScore;
	int totalScore;

	public Student(String name, int mathScore, int engScore, int sciScore) 
	{
	
		this.name = name;
		this.mathScore = mathScore;
		this.engScore = engScore;
		this.sciScore = sciScore;
		this.totalScore = this.mathScore + this.engScore + this.sciScore;

	}

	public int gettotalScore()
	{
		return totalScore;
	}

	@Override
	public String toString() 
	{
		return "Student [name=" + name + ", mathScore=" + mathScore + ", engScore=" + engScore + ", sciScore="
				+ sciScore + ", totalScore=" + totalScore + "]";
	}
	
}
