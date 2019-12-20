public class TextQuestion extends Question
{
	
	public TextQuestion(String type, String question, String answer)
	{
		super(type, question, answer);
	}
	
	public String getType()
	{
		return type;
	}
	
	public String getQuestion()
	{
		return question;
	}
	
	public String getAnswer()
	{
		return answer;
	}
	
	
}
