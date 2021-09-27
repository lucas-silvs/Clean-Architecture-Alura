package escola;

import java.util.List;

public class Aluno {
    private CPF cpf;
    private String nome;
    private List<Telefone> telefones;
    private  Email email;

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero){
        Telefone telefonenovo = new Telefone(ddd,numero);
        telefones.add(telefonenovo);

    }

    public static void main(String[] args) {
        CPF cpfaluno = new CPF("123.456.789-90");
        Email alunoEmail = new Email("lucas@aluno.faculdadeimpacta.com");
        Aluno a = new Aluno(cpfaluno,"Lucas da Silva Santos",alunoEmail);

        System.out.println(a.getEmail().getEmail()+ a.getNome() +a.getCpf().getCpf());
    }

}
