public class Filme {
    private int codigo;
    private String nome;
    private char genero;
    private double avaliacao;
    private int numAvaliacoes = 1;
    private double preco;
    private int ano;
    private int duracao;

    public Filme() { };

    public Filme(int codigo, String nome, char genero, double avaliacao, double preco, int ano, int duracao){
        this.codigo = codigo;
        this.nome = nome;
        this.genero = genero;
        this.avaliacao = avaliacao;
        this.preco = preco;
        this.ano = ano;
        this.duracao = duracao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getAvaliacao() {
        return avaliacao/numAvaliacoes;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao += avaliacao;
        this.numAvaliacoes++;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String toString(){
        return "Código do filme: "+ (this.codigo+1) +
                "\nNome do filme: "+ this.nome +
                "\nGenero do filme: "+ this.genero +
                "\nAvaliação: "+ (this.avaliacao/numAvaliacoes) +
                "\nPreço: "+ this.preco +
                "\nAno de lançamento: "+ this.ano +
                "\nDuração do filme: "+ this.duracao;
    }
}
