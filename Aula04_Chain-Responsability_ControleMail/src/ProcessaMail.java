public class ProcessaMail {

    public static void main(String[] args) {
        CheckMail check = new CheckMail();
        check.verificar( new Mail("luiz@gmail.com", "tecnico@colmeia.com", "Teste 1"));
        check.verificar( new Mail("luiz@gmail.com", "gerencia@colmeia.com", "Teste 2"));
        check.verificar( new Mail("luiz@gmail.com", "comercial@colmeia.com", "Teste 3"));
        check.verificar( new Mail("luiz@gmail.com", "batata@colmeia.com", "Teste 4"));
    }
}
