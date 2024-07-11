
    public class IphoneApp {
        public static void main(String[] args) {
            // Criando instâncias das funcionalidades
            RecursosIphone aparelhoTelefonico = new AparelhoTelefonico();
            RecursosIphone navegadorInternet = new NavegadorInternet();
            RecursosIphone reprodutorMusical = new ReprodutorMusical();

            // Testando as funcionalidades de fazer ligações
            System.out.println("Funcionalidades de Fazer Ligações:");
            aparelhoTelefonico.executarAcao("ligar");
            aparelhoTelefonico.executarAcao("atender");
            aparelhoTelefonico.executarAcao("iniciarCorreio");

            // Testando as funcionalidades de navegar na internet
            System.out.println("\nFuncionalidades de Navegar na Internet:");
            navegadorInternet.executarAcao("exibir pagina");
            navegadorInternet.executarAcao("adicionar nova aba");
            navegadorInternet.executarAcao("atualizar");

            // Testando as funcionalidades de reproduzir música
            System.out.println("\nFuncionalidades de Reproduzir Música:");
            reprodutorMusical.executarAcao("tocar");
            reprodutorMusical.executarAcao("pausar");
            reprodutorMusical.executarAcao("selecionarMusica");
        }
    }

