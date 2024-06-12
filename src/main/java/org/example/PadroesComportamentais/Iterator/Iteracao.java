package org.example.PadroesComportamentais.Iterator;

import java.util.Iterator;

public class Iteracao {
    public static Integer qtFuncionariosAdministradoresSetor(Setor setor) {
        int quantidade = 0;
        for (Funcionario funcionario : setor) {
            if (funcionario.isAdministrador()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer qtTotalFuncionariosSetor(Setor setor) {
        int quantidade = 0;
        for (Iterator a = setor.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
