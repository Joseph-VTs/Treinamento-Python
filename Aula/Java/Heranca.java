// Heranças
// Polimorfismo
// Sub Classes
// Construtores

public class Heranca{
    
    public static class Animal{
        private String Nome;
        private String Sexo;
        private String Raca;
        private int Peso;
        private boolean Tem_Dono;
        private double Idade;
    
        public Animal(String Nome, String Sexo, String Raca, int Peso, boolean Tem_Dono, double Idade){
            this.Nome = Nome;
            this.Sexo = Sexo;
            this.Raca = Raca;
            this.Peso = Peso;
            this.Tem_Dono = Tem_Dono;
            this.Idade = Idade;
            System.out.println("Foi Cadastrado...");
        }
        
        public Animal(String Sexo, String Raca, int Peso){
            System.out.println("Animal foi Encontrado na Rua...");
            this.Nome = "Sem Nome";
            this.Sexo = Sexo;
            this.Raca = Raca;
            this.Peso = Peso;
            this.Tem_Dono = false;
            this.Idade = 0.0;
        }
        
        public String getNome(){
            return this.Nome;
        }
        public void setNome(String nome){
            this.Nome = nome;
        }
        
        public String getSexo(){
            return this.Sexo;
        }
        public void setSexo(String sexo){
            this.Sexo = sexo;
        }
        
        public String getRaca(){
            return this.Raca;
        }
        public void setRaca(String raca){
            this.Raca = raca;
        }
        
        public int getPeso(){
            return this.Peso;
        }
        public void setPeso(int peso ){
            this.Peso = peso;
        }
        
        public boolean isTem_Dono(){
            return this.Tem_Dono;
        }
        public void setTem_Dono(boolean temDono){
            this.Tem_Dono = temDono;
        }
        
        public double getIdade(){
            return this.Idade;
        }
        public void setIdade(double idade){
            this.Idade = idade;
        }
        
        public void Emitir_Som(){
            System.out.println("Animal Emitindo Som...");
        }
        
        @Override
        public String toString(){
            return "Cadastrado: " + "\n" +
                "-> Nome: " + this.Nome +
                " | Sexo: " + this.Sexo +
                " | Raça: " + this.Raca +
                " | Peso: " + this.Peso + "kg" +
                " | Tem Dono: " + this.Tem_Dono +
                " | Idade: : " + this.Idade + ""
            ;
        }
    }
    
    
    public static class Cachorro extends Animal{
        
        public Cachorro(String Sexo, String Raca, int Peso){
            super(Sexo, Raca, Peso);
        }
        public Cachorro(String Nome, String Sexo, String Raca, int Peso, boolean Tem_Dono, double Idade){
            super(Nome, Sexo, Raca, Peso, Tem_Dono, Idade);
        }
        public Cachorro(){
            super("Indefinido", "Desconhecida", 0);
        }
        
        public void Latir(){
            System.out.println("Au! Au!");
        }
        
        public void Emitir_Som(){
            System.out.println("O cachorro está Latindo...");
        }
    }
    
    public static class Gato extends Animal{
        
        public Gato(String Sexo, String Raca, int Peso){
            super(Sexo, Raca, Peso);
        }
        public Gato(String Nome, String Sexo, String Raca, int Peso, boolean Tem_Dono, double Idade){
            super(Nome, Sexo, Raca, Peso, Tem_Dono, Idade);
        }
        
        public void Miar(){
            System.out.println("Miau! Miau!");
        }
        
        public void Emitir_Som(){
            System.out.println("O gato está Miando...");
        }
    }
    
    public static void main (String[] args) {
        System.out.println("\n Cadastro de Cachoros");
        System.out.println("-----------------------------------------------------------------");
        Heranca.Cachorro c1 = new Heranca.Cachorro("M", "Pastor Alemão", 17);
        System.out.println("1°- " + c1);
        c1.Emitir_Som();
        c1.Latir();
        
        System.out.println("\n-----------------------------------------------------------------");
        Heranca.Cachorro c2 = new Heranca.Cachorro("Tobi", "M", "Vira-Lata", 12, true, 8.4);
        System.out.println("2°- " + c2);
        
        
        
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("Com Getters e Setters");
        System.out.println("-----------------------------------------------------------------");
        Heranca.Cachorro c3 = new Heranca.Cachorro();
        c3.setSexo("F");
        c3.setRaca("Kilonbo");
        c3.setPeso(14);
        System.out.println("3°- " + c3.getNome() + " | " + c3.getSexo() + " | " + c3.getRaca() + " | " +
                            c3.getIdade() + " | " + c3.isTem_Dono() + " | " + c3.getIdade());
        
        
        
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("Cadastro de Gatos");
        
        System.out.println("-----------------------------------------------------------------");
        Heranca.Gato g1 = new Heranca.Gato("F", "Cianes", 8);
        System.out.println("1°- " + g1);
        g1.Emitir_Som();
        g1.Miar();
        
        System.out.println("\n-----------------------------------------------------------------");
        Heranca.Gato g2 = new Heranca.Gato("Garfield", "M", "Holandes", 10, true, 5.7);
        System.out.println("2°- " + g2);
        
        
        
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("Com Getters e Setters");
        System.out.println("-----------------------------------------------------------------");
    }
}