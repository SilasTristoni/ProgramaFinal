public class Notificacao {
    private int idNotificacao;
    private String textoNotificacao;
    public Notificacao(
        int idNotificacao,
        String textoNotificacao
    ){
        this.idNotificacao=idNotificacao;
        this.textoNotificacao=textoNotificacao;
    }
    public void enviar(){
        
    }
    public int getIdNotificacao() {
        return idNotificacao;
    }
    public void setIdNotificacao(int idNotificacao) {
        this.idNotificacao = idNotificacao;
    }
    public String getTextoNotificacao() {
        return textoNotificacao;
    }
    public void setTextoNotificacao(String textoNotificacao) {
        this.textoNotificacao = textoNotificacao;
    }
}