package org.example.PadroesComportamentais.Chainofresponsability;

public class TipoDocumentoNotaFiscal implements TipoDocumento {

    private static TipoDocumentoNotaFiscal TipoDocumentoNotaFiscal = new TipoDocumentoNotaFiscal();

    private TipoDocumentoNotaFiscal() {};

    public static TipoDocumentoNotaFiscal getTipoDocumentoNotaFiscal() {
        return TipoDocumentoNotaFiscal;
    }
}
