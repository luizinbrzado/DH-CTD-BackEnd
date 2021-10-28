import org.apache.log4j.Logger;

public class Leao {
    private static final Logger logger = Logger.getLogger(Leao.class);

    private String nome;
    private int idade;
    private boolean isAlpha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAlpha() {
        return isAlpha;
    }

    public void setAlpha(boolean alpha) {
        isAlpha = alpha;
    }

    public void correr() {
        logger.info("O leão " + this.nome + " está correndo!");
    }

    public void isMaiorQue10() throws Exception {
        if(this.idade > 10 && isAlpha()) {
            logger.info("O leão " + this.nome + " tem mais de 10 anos!");
        } else if (this.idade < 0) {
            logger.error("A idade não pode ser negativa!");
            throw new Exception();
        }
    }
}
