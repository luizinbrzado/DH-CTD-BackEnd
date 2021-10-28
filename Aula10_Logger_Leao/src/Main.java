import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Leao leao = new Leao();
        leao.setIdade(4);
        leao.setNome("Gaspar");
        leao.setAlpha(true);
        leao.correr();

        try {
            leao.isMaiorQue10();
        } catch(Exception e) {
            logger.error("A Idade do leão " + leao.getNome() + " está incorreto", e);
        }

        Leao leao2 = new Leao();
        leao2.setIdade(-5);
        leao2.setNome("Nerçu");
        leao2.setAlpha(false);
        leao2.correr();

        try {
            leao2.isMaiorQue10();
        } catch(Exception e) {
            logger.error("A Idade do leão " + leao2.getNome() + " está incorreto!", e);
        }
    }
}
