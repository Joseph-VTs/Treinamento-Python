public class Controle_Pedidos {

    public static class Cliente {
        // Atributos
        private String CPF;
        private String Nome;
        private String E_Mail;
        private String Endereco;

        // Métodoo Construtor
        public Cliente(String CPF, String Nome, String E_Mail, String Endereco) {
            this.CPF = CPF;
            this.Nome = Nome;
            this.E_Mail = E_Mail;
            this.Endereco = Endereco;
        }

        public Cliente() {
            this.CPF = "";
            this.Nome = "";
            this.E_Mail = "";
            this.Endereco = "";
        }

        // Métodos Getters + Métodos Setters
        public String getCPF() { return CPF; }
        public void setCPF(String CPF) { this.CPF = CPF; }

        public String getNome() { return Nome; }
        public void setNome(String nome) { this.Nome = nome; }

        public String getE_Mail() { return E_Mail; }
        public void setE_Mail(String e_Mail) { this.E_Mail = e_Mail; }

        public String getEndereco() { return Endereco; }
        public void setEndereco(String endereco) { Endereco = endereco; }

        @Override
        public String toString() {
            return "Informações do Cliente: " + this.Nome + "\n" +
                "-> CPF: " + this.CPF +
                " | E-Mail: " + this.E_Mail +
                " | Endereço: " + this.Endereco
            ;
        }
    }

    public static class Produtos{

        //Atributos
        private int Codigo;
        private String Nome;
        private double Preco;

        // Métodoo Construtor
        public Produtos(int Codigo, String Nome, double Preco){
            this.Codigo = Codigo;
            this.Nome = Nome;
            this.Preco =Preco;
        }

        public Produtos(){
            this.Codigo = 0;
            this.Nome = "";
            this.Preco = 0.00;
        }

        // Getters + Setters
        public int getCodigo() {
            return Codigo;
        }
        public void setCodigo(int codigo) {
            this.Codigo = codigo;
        }

        public String getNome() {
            return Nome;
        }
        public void setNome(String nome) {
            this.Nome = nome;
        }

        public double getPreco() {
            return Preco;
        }
        public void setPreco(double preco) {
            this.Preco = preco;
        }

        @Override
        public String toString() {
            return "Informações do Produto: " + this.Nome + "\n" +
                "-> Código: " + this.Codigo +
                " | Preço: " + this.Preco
            ;
        }
    }

    public static void main(String[] args) {


        Controle_Pedidos.Cliente Cliente_01 = new Controle_Pedidos.Cliente();

        System.out.println("\n------------------------------------------------------------------------------------------");
        Cliente_01.setNome("João");
        Cliente_01.setCPF("000.000.000-00");
        Cliente_01.setE_Mail("João@gmial.com");
        Cliente_01.setEndereco("Rua Larga das Pombas");

        // System.out.println(Cliente_01.toString());
        System.out.println("Informações do Cliente: " + Cliente_01.getNome() +
                "\n-> CPF: " + Cliente_01.getCPF() + " | E-mail: " + Cliente_01.getE_Mail() + " | Endereço: " + Cliente_01.getEndereco());



        Controle_Pedidos.Produtos Produto_01 = new Controle_Pedidos.Produtos();
        System.out.println("\n------------------------------------------------------------------------------------------");
        Produto_01.setNome("Pastel");
        Produto_01.setCodigo(01);
        Produto_01.setPreco(5.50);

        // System.out.println(Produto_01.toString());
        System.out.println("Lista de Produtos:" + "\n-> Nome: " + Produto_01.getNome() + " | Código: " + Produto_01.getCodigo() + " | Preço: " + Produto_01.getPreco());
    }
}


