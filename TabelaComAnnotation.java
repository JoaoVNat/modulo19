package Natsu.Ebac;

@TabelaAnnotation(value = "Tabela Com Classes", sala = "Terceiro Ano A", numeroDaSala = 2)
public class TabelaComAnnotation {
    @TabelaAnnotation(value = "Tabela Com Classes", sala = "Terceiro Ano B", numeroDaSala = 3)
    private String salas;

}
