public class NumericQuestion extends Question
{
  private double numAnswer;

  public NumericQuestion()
  {
    numAnswer = 0.0;
  }

  /**
    Sets the answer for this question.
    @param correctResponse - the answer
  */
  public void setAnswer(String correctResponse)
  {
    numAnswer = Double.parseDouble(correctResponse);
  }

  /**
    Checks a given response for approximate numerical correctness within .01.
    @param response - the response to check
    @return true if response was correct, false otherwise
  */
  public boolean checkAnswer(String response)
  {
    final double EPSILON = .01;
    double numResponse = Double.parseDouble(response);
    if(Math.abs(numResponse - numAnswer) <= EPSILON)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

}