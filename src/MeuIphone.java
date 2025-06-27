public class MeuIphone {
    public static void main(String[] args){
        Iphone meuCelular = new Iphone();

        System.out.println("\n--- Testando Reprodutor Musical ---");
        meuCelular.selecionarMusicar("Creed - Don't Stop Dancing");
        meuCelular.pausar();
        meuCelular.tocar();

        System.out.println("\n--- Testando Aparelho Telefonico ---");
        meuCelular.ligar("(11)7894-5612");
        meuCelular.atender();
        meuCelular.iniciarCorreioVoz();

        System.out.println("\n--- Testando Navegador de internet ---");
        meuCelular.exibirPagina("https://www.google.com");
        meuCelular.adicionarNovaAba();
        meuCelular.atualizarPagina();
    }
}
