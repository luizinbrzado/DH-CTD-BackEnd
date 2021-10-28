public class GradeFilmes implements IGradeFilmes {

    @Override
    public Filme getFilme(String nomeFilme) throws FilmeNaoHabilitadoException {
        Filme filme = null;

        switch (nomeFilme) {
            case "Homem Aranha":
                filme = new Filme("Homem Aranha", "Brasil", "www.homemaranha.com.br");
                break;
            case "Colombiano em busca de vigança":
                filme = new Filme("Colombiano em busca de vigança", "Colombia", "www.vinganca.com.co");
                break;
            case "De volta para o futuro":
                filme = new Filme("De volta para o futuro", "Argetina", "www.futuro.com.ar");
                break;
            case "Matrix":
                filme = new Filme("Matrix", "Brasil", "www.matrix.com.br");
                break;
            case "Boneco Assassino":
                filme = new Filme("Boneco Assassino", "Colombia", "www.boneco.com.co");
                break;
        }

        return filme;
    }
}
