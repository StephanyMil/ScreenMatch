package com.github.StephanyMil.ScreenMatch.calculos;
import com.github.StephanyMil.ScreenMatch.modelos.Titulo;

import com.github.StephanyMil.ScreenMatch.modelos.Filme;
import com.github.StephanyMil.ScreenMatch.modelos.Serie;
import com.github.StephanyMil.ScreenMatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duranção em minutos de " + titulo);
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}