import java.time.LocalDate;

public class CodificadorReverso implements Codificador {
    public String getNome() {
        return "Codificador Reverso";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 03, 19);
    }

    public int getNivelSeguranca(){
        return 10;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder(str);

        encoded.reverse();

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder(str);

        encoded.reverse();

        return encoded.toString();
    }
}