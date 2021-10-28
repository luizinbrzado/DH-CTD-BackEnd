import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

public class Lista {
    DecimalFormat df = new DecimalFormat("#.00");
    private static final Logger logger = Logger.getLogger(Lista.class);

    private List<Integer> listaInteiros = new ArrayList<>();

    public List<Integer> getListaInteiros() {
        return listaInteiros;
    }

    public void setListaInteiros(List<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
    }

    public void addListaInteiros(int num) {
        this.listaInteiros.add(num);
    }

    public void isMaiorQue5() throws Exception {
        if(this.listaInteiros.size() > 5) {
            logger.info("O comprimento da lista é maior que 5!");
        } else if(this.listaInteiros.size() == 0) {
            throw new Exception();
        }
    }

    public void isMaiorQue10() throws Exception {
        if(this.listaInteiros.size() > 10) {
            logger.info("O comprimento da lista é maior que 10!");
        } else if(this.listaInteiros.size() == 0) {
            throw new Exception();
        }
    }

    public void mediaListaInteiros() throws Exception {
        if(this.listaInteiros.size() > 0) {
            double qtdNumeros = this.listaInteiros.size();
            double total = this.listaInteiros.stream().mapToInt(item -> item).sum();
            double media = total / qtdNumeros;
            logger.info("A média da lista é " + df.format(media));
        } else {
            throw new Exception();
        }
    }
}
