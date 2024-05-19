
package Package;

public class Paciente  implements Comparable<Paciente>{
    private String nome;
    private int anos;
    private int meses;
    private String sintoma;
    private String prioridade;
    private String senha;
    private double posicaoFila;

    public Paciente(String nome, int anos, int meses,String sintoma, String prioridade,String senha,double posicaoFila) {
        this.nome = nome;
        this.anos = anos;
        this.meses = meses;
        this.sintoma =sintoma;
        this.prioridade = prioridade;
        this.senha = senha;
        this.posicaoFila = posicaoFila;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int Meses) {
        this.meses = Meses;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getPosicaoFila() {
        return posicaoFila;
    }

    public void setPosicaoFila(double posicaoFila) {
        this.posicaoFila = posicaoFila;
    }

    @Override
    public int compareTo(Paciente o) {
        throw new UnsupportedOperationException("Erro compareTo"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
}
