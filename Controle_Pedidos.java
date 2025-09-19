public class Controle_Pedidos {

}

class Cliente{
    private  String CPF;
    private  String Nome;
    private  String E_Mail;
    private  String Endereco;

    public Cliente(String CPF, String Nome, String E_Mail, String Endereco){
        this.CPF = CPF;
        this.Nome = Nome;
        this.E_Mail = E_Mail;
        this.Endereco = Endereco;
    }

    @Override
    public String toString() {
        return "\n" +
            "CPF: " + this.CPF +

        ;
    }
}

