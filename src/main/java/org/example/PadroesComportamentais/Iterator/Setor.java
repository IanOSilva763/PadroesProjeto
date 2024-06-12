package org.example.PadroesComportamentais.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Setor implements Iterable<Funcionario>{
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public Setor(Funcionario... funcionarios) {
        this.funcionarios = Arrays.asList(funcionarios);
    }
    @Override
    public Iterator<Funcionario> iterator() {
        return funcionarios.iterator();
    }

}
