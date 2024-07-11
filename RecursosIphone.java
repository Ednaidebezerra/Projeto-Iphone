// Classe base para as funcionalidades do smartphone
abstract class RecursosIphone {
    abstract void executarAcao(String action);
}

// Classe para fazer ligações
class AparelhoTelefonico extends RecursosIphone {
    @Override
    void executarAcao(String action) {
        switch (action) {
            case "ligar":
                System.out.println("Ligando...");
                break;
            case "atender":
                System.out.println("Atendendo chamada...");
                break;
            case "iniciarCorreio":
                System.out.println("Iniciando correio de voz...");
                break;
            default:
                System.out.println("Ação desconhecida para chamadas.");
        }
    }
}

// Classe para navegar na internet
class NavegadorInternet extends RecursosIphone {
    @Override
    void executarAcao(String action) {
        switch (action) {
            case "exibir":
                System.out.println("Exibindo página web...");
                break;
            case "adicionar":
                System.out.println("Adicionando nova página aos favoritos...");
                break;
            case "atualizar":
                System.out.println("Atualizando página web...");
                break;
            default:
                System.out.println("Ação desconhecida para navegação na internet.");
        }
    }
}

// Classe para reproduzir música
class ReprodutorMusical extends RecursosIphone {
    @Override
    void executarAcao(String action) {
        switch (action) {
            case "tocar":
                System.out.println("Tocando música...");
                break;
            case "pausar":
                System.out.println("Pausando música...");
                break;
            case "selecionarMusica":
                System.out.println("Selecionando música...");
                break;
            default:
                System.out.println("Ação desconhecida para reprodução de música.");
        }
    }
}


