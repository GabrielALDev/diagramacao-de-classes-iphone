package equipamento;

public interface navegadorInternet {
    public void exibirPagina(String url);
    public void fecharAbaNavegador();
    public void adicionarNovaAba(String url);
    public void fecharPagina();
    public void atualizarPagina();
}

