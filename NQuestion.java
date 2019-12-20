public class NumberQuestion extends Question
{

    public NumberQuestion(String type, String question, String[] answer)
    {
      this.type = type;
      this.question = question;
      this.answer = answer;
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
