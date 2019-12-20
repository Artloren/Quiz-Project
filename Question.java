public abstract class Question
{
    protected String type;
    protected String question;
    protected String answer;

    public Question(String type, String question, String answer)
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

    public abstract boolean correctAnswer(String answer);
}
