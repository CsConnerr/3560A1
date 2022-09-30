package com.cs3560;

public class Student {

  // Student IDs and answers are generated randomly
  private final String ID;
  private final String answer;

  // String array for the answers and the student ID
  Student(String ids, String a) {
    ID = ids;
    answer = a;
  }

  // Getters for the student ID and the answer
  public String getID() {
    return ID;
  }

  public String getAnswer() {
    return answer;
  }
}
