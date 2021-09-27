package escola;

public class Telefone {
    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if(numero == null || ddd == null || !ddd.matches("[0-9]{2}") || !numero.matches("[0-9]{8,9}")){
            throw new IllegalArgumentException("numero de telefone invalido");
        }
        this.ddd = ddd;
        this.numero = numero;
    }
}
