package com.cs3560;

import java.util.Random;

// This class is used to generate the question and the answer
class Questions {

  private final String question;
  private final int type;

  public Questions(String q, int t) {
    question = q;
    type = t;
  }

  public String getQuestion() {
    return question;
  }

  public int getType() {
    return type;
  }
}

// Parent class for the question types
public class Question {

  private final int questionType;
  // multiple choice questions and answers for the questions
  // pokemon based ;)
  private final String[] multi = {
      "What type is Charmander?\nA:Fire\nB:Water\nC:Grass\nD:Ghost",
      "Which Pokemon has 9 tails?\nA:Ditto\nB:Piplup\nC:Fuecoco\nD:Ninetails",
      "Which of these is not a starter type?\nA:Fairy\nB:Fire\nC:Water\nD:Grass",
      "How can you become a Champion?\nA:Beat Elite 4 + Champion\nB:Make Curry\nC:Magikarp\nD:Contests"};
  // single choice questions for the true or false
  private final String[] single = {"A Pokeball is red and white?",
      "Arceus was the first pokemon?",
      "Pokemon Centers are all run by Nurse Joy?", "Water is weak against Electric?"};
  // generates a question and answer based on the type
  private final Random rand = new Random();
  private final Questions multiq = new Questions(multi[rand.nextInt(4)], 0);
  private final Questions singleq = new Questions(single[rand.nextInt(4)], 1);

  // qType is the type of question that is generated
  public Question(int qType) {
    questionType = qType;
  }

  // Determine what type of question is being asked
  // 0 -> multiple choice question type 1 -> true or false
  public Questions getQuestion() {
    if (questionType == 0) {
      return multiq;
    } else {
      return singleq;
    }
  }

}


