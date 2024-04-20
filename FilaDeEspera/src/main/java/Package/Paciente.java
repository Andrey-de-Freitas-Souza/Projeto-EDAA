
package Package;

public class Paciente {
    
    private String nome;
    private int anos;
    private int meses;
    private double temperatura;
    private boolean gravida;
    private boolean idoso;
    private int dor;
    private int gravissimos;
    private int graves;
    private int medios;
    private int leves;
    private int posicao;
    private String prioridade;

    public Paciente(String nome, int anos, int meses ,double temperatura, boolean gravida, boolean idoso, int dor, int gravissimos, int graves, int medios, int leves, String prioridade, int posicao) {
        this.nome = nome;
        this.anos = anos;
        this.meses = meses;
        this.temperatura = temperatura;
        this.gravida = gravida;
        this.idoso = idoso;
        this.dor = dor;
        this.gravissimos = gravissimos;
        this.graves = graves;
        this.medios = medios;
        this.leves = leves;
        this.prioridade = prioridade;
        this.posicao = posicao;
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

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isGravida() {
        return gravida;
    }

    public void setGravida(boolean gravida) {
        this.gravida = gravida;
    }

    public boolean isIdoso() {
        return idoso;
    }

    public void setIdoso(boolean idoso) {
        this.idoso = idoso;
    }

    public int getDor() {
        return dor;
    }

    public void setDor(int dor) {
        this.dor = dor;
    }

    public int getGravissimos() {
        return gravissimos;
    }

    public void setGravissimos(int gravissimos) {
        this.gravissimos = gravissimos;
    }

    public int getGraves() {
        return graves;
    }

    public void setGraves(int graves) {
        this.graves = graves;
    }

    public int getMedios() {
        return medios;
    }

    public void setMedios(int medios) {
        this.medios = medios;
    }

    public int getLeves() {
        return leves;
    }

    public void setLeves(int leves) {
        this.leves = leves;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
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
    
        
}
