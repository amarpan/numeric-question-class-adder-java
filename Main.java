/*
File Name: main.java
Name: Amar Panjwani
Description: This program adds a NumericQuestion class to the question hierarchy of Section 9.1's Question class in the textbook. 
Date: 05/03/21
Email: panjwania@student.vvc.edu
*/

import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);

    NumericQuestion q = new NumericQuestion();
    q.setText("What is 4 divided by 3?");
    q.setAnswer("1.33");
  
    q.display();
    System.out.print("Your answer: ");
    String response = in.next();
    System.out.println(q.checkAnswer(response));

    Question p = new Question();
    p.setText("How is test spelled?");
    p.setAnswer("test");
  
    p.display();
    System.out.print("Your answer: ");
    String response1 = in.next();
    System.out.println(p.checkAnswer(response1));
  }
}

  
  