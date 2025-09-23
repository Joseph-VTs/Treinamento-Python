/* Encapsulamento = Métodos Getters e Setters + Tipo Private

Em POO modificador de acesso é a palavra que define um atributo, método ou classe e pode ser público, privado ou protegido. Entre os três modificadores
existem quatro níveis de visibilidade: private, default, protected e public. Público (public) significa que qualquer classe pode ter acesso; privado (private),
que somente têm acesso métodos da própria classe, podendo manipular o atributo; protegido (protected) pode ser acessado somente pela própria classe
ou subclasses; e default tem acesso as  classes que estiverem no mesmo pacote que a classe que possui o atributo.

Segundo Lima (2014, p. 49), “uma classe é uma descrição de um conjunto
de objetos que compartilham os mesmos atributos, operações, relacionamentos e semântica”.
*/

public class Encapsulamento{ // Conta
    
    // Atributos
    private int Numero;
    private double Saldo;
    private double Juros;
    
    // Métodos Construtores
    public Encapsulamento(int Numero, double Saldo, double Juros){
        this.Numero = Numero;
        this.Saldo = Saldo;
        this.Juros = Juros;
    }
    
    // Métodos de Acesso
    public int getNumeros(){return this.Numero; }
    public double getSaldo(){ return this.Saldo; }
    public double getJuros(){ return this.Juros; }
    
    public void setNumero(int Numero ){ this.Numero = Numero; }
    public void setJuros( double Juros ){ this.Juros = Juros; }
    
    // Métodos
    public void Debito(double Valor){ this.Saldo += Valor; }
    public void Credito(double Valor){ this.Saldo += Valor; }
    
    public static void main (String[] args) {
        Encapsulamento a1 = new Encapsulamento(12345, 334.54, 1.3);
        
        System.out.println(a1.getNumeros() + " }{ " + a1.getSaldo() + " }{ " + a1.getJuros());
    }
    
}