public class Usuario {
    public static void main(String[] args) {
        GradeFilmesProxy proxy = new GradeFilmesProxy(new GradeFilmes());
        proxy.setIP(new IP(49,23,15,18));

        try {
            System.out.println(proxy.getFilme("Homem Aranha").getLink());
        } catch (FilmeNaoHabilitadoException e) {
            System.out.println(e);
        }
    }
}
