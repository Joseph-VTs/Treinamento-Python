public class Producao {
    
    static int Previsao_Demanda = 200;
    static int Producao_Normal = 250;
    static int Estoque_Inicial = 50;
    static int Estoque_Final;
    
    public static void main(String [] args){
    
    Estoque_Final = (Estoque_Inicial + Producao_Normal)-Previsao_Demanda;
    
    System.out.print("\n O estoque final previsto para o mês é de: " +Estoque_Final + " Unidades");
    }   
}

class Producao1 {
    // Atributos da produção
    int Previsao_Demanda;
    int Producao_Normal;
    int Estoque_Inicial;
    int Estoque_Final;

    // Construtor para inicializar os dados
    public Producao1(int demanda, int producao, int estoque) {
        this.Previsao_Demanda = demanda;
        this.Producao_Normal = producao;
        this.Estoque_Inicial = estoque;
    }

    // Método para calcular o estoque final
    public void Calcular_Estoque_Final() {
        Estoque_Final = (Estoque_Inicial + Producao_Normal) - Previsao_Demanda;
    }

    @Override
    public String toString() {
        return " " + this.Estoque_Final;
    }
    
    
    // Método principal
    public static void main(String[] args) {
        // Criando um objeto da classe Producao
        Producao1 Producao = new Producao1(200, 250, 50);
        
        // Calculando e exibindo o estoque final
        Producao.Calcular_Estoque_Final();
        System.out.println("\nO estoque final previsto para o mês é de:" + Producao + " unidades.");
        
    }
}