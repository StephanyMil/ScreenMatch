package com.github.StephanyMil.ScreenMatch.modelos;

import com.github.StephanyMil.ScreenMatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diteror;

    public String getDiteror() {
        return diteror;
    }

    public void setDiteror(String diteror) {
        this.diteror = diteror;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaDasAvaliacoes() / 2;
    }
}