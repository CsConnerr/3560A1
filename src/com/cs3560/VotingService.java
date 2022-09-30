package com.cs3560;

// VotingService class is used to count the number of votes for each answer
public class VotingService {

  private final Student[] students;
  private final Questions genQs;

  // Constructor for the VotingService
  public VotingService(Student[] s, Questions q) {
    genQs = q;
    students = s;

  }

  // runVotingService is used to run the voting service
  public void runVotingService() {
    votingService();
  }

  private void votingService() {

// Changes depending on the type of question
    switch (genQs.getType()) {
      case 0:
        mType();
        break;
      case 1:
        sType();
    }
  }

  // mTypeis used to count the number of votes for the multiple choice questions
  private void mType() {
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
// Count the number of votes for each answer
    for (Student stud : students) {
      switch (stud.getAnswer()) {
        case "A":
          a++;
          break;
        case "B":
          b++;
          break;
        case "C":
          c++;
          break;
        case "D":
          d++;
          break;

      }

    }
// Prints out the number of votes for each multiple choice answer
    System.out.println("A: " + a + "\nB: " + b + "\nC: " + c + "\nD: " + d);

  }

  // sType is used to count the number of votes for true and false
  private void sType() {
    int t = 0;
    int f = 0;
// Counts the number of true and false answers
    for (Student stu : students) {
      switch (stu.getAnswer()) {
        case "t":
          t++;
          break;
        case "f":
          f++;
      }
    }
// Prints out the number of true and false answers
    System.out.println("t: " + t + "\nf: " + f);
  }

}