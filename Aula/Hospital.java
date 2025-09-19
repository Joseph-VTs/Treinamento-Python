// Testes com Java

public class Hospital {
    // Atributos
    private String Nome;
    private int Capacidade;
    private boolean Possui_UTI;


    // Métodoo Construtor
    public Hospital(String Nome, int Capacidade, boolean Possui_UTI){
        this.Nome = Nome;
        this.Capacidade = Capacidade;
        this.Possui_UTI = Possui_UTI;
    }


    // Métodos
    // Realiza o atendimento de um paciente no hospital
    public void Realizar_Atendimento(String Paciente){
        System.out.println("Paciente: " + Paciente + ", está em Atendimento no Hospital: " + Nome);
    }

    public void Adicionar_Leito(){
        Capacidade++;
        System.out.println("Foi adicionado mais um Leito ao Hospital " + Nome);
    }


    // Verifica se o hospital possui UTI
    public void Verificar_Disponibilidade(){
        if(Possui_UTI){
            System.out.println("Hospital " + Nome + " Yes!... Possui UTI");
        }else{
            System.out.println("Hospital " + Nome + " Not!... Possui UTI");
        }
    }


    // Getters e Setters
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }


    public int getCapacidade() {
        return Capacidade;
    }
    public void setCapacidade(int capacidade) {
        Capacidade = capacidade;
    }


    public boolean isPossui_UTI() {
        return Possui_UTI;
    }
    public void setPossui_UTI(boolean possui_UTI) {
        this.Possui_UTI = possui_UTI;
    }

    @Override
    public String toString() {
        return  "Hospital: " + this.Nome +
                ". Capacidade: " + this.Capacidade +
                ". UTI: " + this.Possui_UTI +
                "\n";
    }

    public static void main(String[] args) {
        Hospital h1 = new Hospital("Saliduram", 100, true);

        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("Nome do Hospital: " + h1.getNome());
        System.out.println("Capacidade dp Hospital: " + h1.getCapacidade());
        
        System.out.println("\nInformações do Hospital: \n-> " + h1);
        
        System.out.println("-------------------------------------------------------------------");
        h1.Realizar_Atendimento("Joaquim");
        h1.Verificar_Disponibilidade();
        h1.Adicionar_Leito();
        System.out.println("\nInformações do Hospital: \n-> " + h1);
        
        
        System.out.println("-------------------------------------------------------------------");
        // Modificando os atributos do objeto
        h1.setNome("Paulistonho");
        h1.setCapacidade(152);
        h1.setPossui_UTI(false);
        System.out.println("Novo Nome do Hospital: " + h1.getNome());
        System.out.println("Nova Capacidade do Hospital: " + h1.getCapacidade());
        h1.Verificar_Disponibilidade();
        System.out.println("\nInformações do Hospital: \n-> " + h1);
    }
}
