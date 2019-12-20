public class TextQuestion extends Question
{
    public TextQuestion(String type, String question, String answer)
    {
        super(type, question, answer);
    }

    @Override
    public boolean correctAnswer(String answer)
    {
        if (this.answer.toLowerCase().equals(answer.toLowerCase()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
