package com.cs3560;

public abstract class Question{
    protected String preguntas;

    public Question(String preguntas) {
        this.preguntas = preguntas;
    }

    public String getQuestion(){
        return this.preguntas;
    }
}