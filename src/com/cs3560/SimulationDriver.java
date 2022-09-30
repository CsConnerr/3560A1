package com.cs3560;

import java.util.Random;
import java.util.UUID;

public class SimulationDriver {

  public static void main(String[] args) {
    // Question TYPE is generated randomly if 0 is generated the question is multiple choice,
    // and if 1 is generated the question is true or false.
    int type;
    Random rand = new Random();
    type = rand.nextInt(2);

    if (type == 0) {
      System.out.println("Multiple Choice");

    } else {
      System.out.println("True or False");
    }
    System.out.println("-------------------------------------------------");

    // The types of answers that a student can give
    String[] mutipleChoice = {"A", "B", "C", "D"};
    String[] twoChoice = {"t", "f"};

    // this is going to generate the specific type of question from the multiple choice or true
    // false
    Question qg = new Question(type);
    Questions generatedQuestion = qg.getQuestion();

    // Print out the question and then generating the student IDS
    // 3-10 student IDS will be generated
    System.out.println(generatedQuestion.getQuestion());
    Student[] studentArray = new Student[(rand.nextInt(10) + 3)];

    // Tells the user how many students are in the array/answered
    System.out.println(studentArray.length + " Students Answered");
    System.out.println("-------------------------------------------------");

    // Uses UUID to generate random student IDs then will pick a student answer based on the
    // question typ
    for (int i = 0; i < studentArray.length; i++) {
      String randUUID = UUID.randomUUID().toString();

      if (type == 0) {
        studentArray[i] = new Student(randUUID, mutipleChoice[rand.nextInt(4)]);
      } else {
        studentArray[i] = new Student(randUUID, twoChoice[rand.nextInt(2)]);
      }
      // Shows what the student ID is and how they answered
      System.out.println(
          "Student ID: "
              + studentArray[i].getID()
              + "\nAnswered: "
              + studentArray[i].getAnswer());
      System.out.println("-------------------------------------------------");
    }

    // generating question and retrieving questions
    System.out.println("Results:");
    VotingService votingService = new VotingService(studentArray, generatedQuestion);
    votingService.runVotingService();
    System.out.println("-------------------------------------------------");
  }
}
