public class Polimorfismo{
    
    public static class Produtos{
        protected String Nome;
        protected String Descricao;
        protected double Custo;
        protected boolean Na_Prateleira;
        
        public Produtos(String Nome, String Descricao, double Custo, boolean Na_Prateleira){
            this.Nome = Nome;
            this.Descricao = Descricao;
            this.Custo = Custo;
            this.Na_Prateleira = Na_Prateleira;
        }
        
        public void Exibir_Informacoes(){
            System.out.println("Nome: " + Nome);
            System.out.println("Descrição: " + Descricao);
            System.out.println("Preço de Custo: " + Custo);
            System.out.println("Produto Está na Prateleira? " + Na_Prateleira + " Está na Prateleira");
        }
    }
    
    public static class Livro extends Produtos{
        private String Autor;
        
        public Livro(String Nome, String Descricao, double Custo, boolean Na_Prateleira, String Autor){
            super(Nome, Descricao, Custo, Na_Prateleira);
            this.Autor = Autor;
        }
        
        @Override
        public void Exibir_Informacoes(){
            super.Exibir_Informacoes();
            System.out.println("Nome do Autor: " + Autor);
        }
    }
    
    public static class Eletronicos extends Produtos{
        private String Marca;
        
        public Eletronicos(String Nome, String Descricao, double Custo, boolean Na_Prateleira, String Marca){
            super(Nome, Descricao, Custo, Na_Prateleira);
            this.Marca = Marca;
        }
        
        @Override
        public void Exibir_Informacoes(){
            super.Exibir_Informacoes();
            System.out.println("Marca: " + Marca);
        }
    }
    
    public static void main(String[] args) {
        
        Livro Livro_1 = new Livro("1984", "Distopia clássica", 29.90, true, "George Orwell");
        Eletronicos Celular_1 = new Eletronicos("Smartphone", "Android 12", 1200.00, false, "Samsung");
    
        Livro_1.Exibir_Informacoes();
        System.out.println("--------------------------------------------");
        Celular_1.Exibir_Informacoes();
    }
}