// Rede de Farnmácias
// Aplicação de Cadastro
// No sistema, devem ser cadastrados os estabelecimentos e farmácias associadas à matriz, fornecedores de medicamentos e colaboradores.
/*
    — associados (ID, nome, logradouro, número, CEP, bairro, cidade, UF, telefone, CPF/CNPJ, situação e número de associado);
    — colaborador (ID, nome, logradouro, número, CEP, bairro, cidade, UF, telefone, CPF/CNPJ, cargo ou função);
    — fornecedores (ID, nome, logradouro, número, CEP, bairro, cidade, UF, telefone, CPF/CNPJ, nome fantasia e website).
*/

public class Rede_Farmacias{
    // Atributos Padrão
    protected int ID;
    protected String Nome;
    protected String Logradouro;
    protected int Numero;
    protected String CEP;
    protected String Bairro;
    protected String Estado_UF;
    protected String Telefone;
    protected String CPF_CNPJ;
    
    // Métodoo Construtor
    public Rede_Farmacias(int ID, String Nome, String Logradouro, int Numero, String CEP, String Bairro, String Estado_UF, String Telefone, String CPF_CNPJ){
        this.ID = ID;
        this.Nome = Nome;
        this.Logradouro = Logradouro;
        this.Numero = Numero;
        this.CEP = CEP;
        this.Bairro = Bairro;
        this.Estado_UF = Estado_UF;
        this.Telefone = Telefone;
        this.CPF_CNPJ = CPF_CNPJ;
    }
    
    public void Exibir_Informacoes(){
        System.out.println("ID: " + ID);
        System.out.println("Nome: " + Nome);
        System.out.println("Logradouro: " + Logradouro);
        System.out.println("Número: " + Numero);
        System.out.println("CEP: " + CEP);
        System.out.println("Bairro: " + Bairro);
        System.out.println("Estado_UF");
        System.out.println();
    }
    
    public static class Associados extends Rede_Farmacias{
        //Atributos
        private String Situação;
        private int Num_Associado;
        
    public Rede_Farmacias(int ID, String Nome, String Logradouro, int Numero, String CEP, String Bairro, 
                    String Estado_UF, String Telefone, String CPF_CNPJ, String Situação, int Num_Associado){
                        
        super(ID, Nome, Logradouro, Numero, CEP, Bairro, Estado_UF, CPF_CNPJ);
        this.Situação = Situação;
        this.Num_Associado = Num_Associado;
    }
        
    }
    
    
    
    public static void main (String[] args) {
        System.out.print("Olá Mundo");
    }
}