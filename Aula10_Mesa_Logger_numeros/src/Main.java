import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Lista numeros = new Lista();

        try {
            numeros.isMaiorQue5();
        } catch (Exception e) {
            logger.error("A lista não tem números!", e);
        }

        try {
            numeros.mediaListaInteiros();
        } catch (Exception e) {
            logger.error("A lista não tem números!", e);
        }

        numeros.addListaInteiros(10);
        numeros.addListaInteiros(5);
        numeros.addListaInteiros(5);
        numeros.addListaInteiros(5);
        numeros.addListaInteiros(5);
        numeros.addListaInteiros(5);

        try {
            numeros.isMaiorQue5();
        } catch (Exception e) {
            logger.error("A lista não tem números!", e);
        }

        numeros.addListaInteiros(5);
        numeros.addListaInteiros(5);
        numeros.addListaInteiros(5);
        numeros.addListaInteiros(5);
        numeros.addListaInteiros(5);

        try {
            numeros.isMaiorQue10();
        } catch (Exception e) {
            logger.error("A lista não tem números!", e);
        }

        try {
            numeros.mediaListaInteiros();
        } catch (Exception e) {
            logger.error("A lista não tem números!", e);
        }
    }
}
