package org.example.PadroesEstruturais.Facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Sistema {
    private List<Alexa> alexasComErro = new ArrayList<Alexa>();

    public void addAlexaComErro(Alexa alexa) {
        this.alexasComErro.add(alexa);
    }

    public boolean verificarAlexaComErro(Alexa alexa) {
        return this.alexasComErro.contains(alexa);
    }
}
