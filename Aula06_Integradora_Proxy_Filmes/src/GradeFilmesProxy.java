public class GradeFilmesProxy implements IGradeFilmes {

    private GradeFilmes grade;
    private IP ip;

    public IP getIp() {
        return ip;
    }

    public void setIP(IP ip) {
        this.ip = ip;
    }

    public GradeFilmesProxy(GradeFilmes grade) {
        this.setGrade(grade);
    }

    public void setGrade(GradeFilmes grade) {
        this.grade = grade;
    }

    @Override
    public Filme getFilme(String nomeFilme) throws FilmeNaoHabilitadoException {
        Filme filme = grade.getFilme(nomeFilme);
        if (! (getIp().getPais()).equalsIgnoreCase(filme.getPais())) {
            throw new FilmeNaoHabilitadoException(nomeFilme + " não disponível no seu páis" + getIp().getPais());
        }

        return filme;
    }

}
