package equipamento;

public class iPhone implements aparelhoCelular, navegadorInternet, reprodutorMusical {


    @Override
    public void ligar(String numero) {
        System.out.println("Fazendo ligação");
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void colocarEmEspera() {
        System.out.println("Chamada em espera...");
    }

    @Override
    public void iniciarCorreioDeVoz(String mensagem, String destinatario) {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void vivaVoz() {
        System.out.println("Viva voz ativado");
    }

    @Override
    public void silenciar() {
        System.out.println("Chamada silenciada");
    }

    @Override
    public void adicionarChamada() {
        System.out.println("Adicionando outro contato a chamada");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo pagina do navegador...");
    }

    @Override
    public void fecharAbaNavegador() {
        System.out.println("Fechando aba do navegador");
    }
    
    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void parar() {
        System.out.println("Parando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando nova música");
    }

        @Override
    public void selecionarAlbum() {
        System.out.println("Selecionando nova música");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando o volume");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo o volume");
    }
}