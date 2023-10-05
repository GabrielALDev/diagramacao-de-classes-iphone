package equipamento;

public interface aparelhoCelular {
    public void ligar(String numero);
    public void atender(String numero);
    public void colocarEmEspera();
    public void vivaVoz();
    public void iniciarCorreioDeVoz(String mensagem, String destinatario);
    public void silenciar();
    public void adicionarChamada();
}
