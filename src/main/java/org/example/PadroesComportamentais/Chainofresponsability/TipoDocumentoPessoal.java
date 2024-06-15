package org.example.PadroesComportamentais.Chainofresponsability;

public class TipoDocumentoPessoal implements TipoDocumento {

    private static TipoDocumentoPessoal TipoDocumentoPessoal = new TipoDocumentoPessoal();

    private TipoDocumentoPessoal() {};

    public static TipoDocumentoPessoal getTipoDocumentoPessoal() {
        return TipoDocumentoPessoal;
    }
}
