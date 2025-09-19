/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *
 * @author Estudos em Códigos -> Joseph-VTs
*/

public class Carro {

    // Atributos
    private String Marca;
    private String Cor;
    private int Ano;
    private boolean Ar_Condicionado;

    // Método Construtor
    public Carro(String Marca, String Cor, int Ano, boolean Ar_Condicionado){
        this.Marca = Marca;
        this.Cor = Cor;
        this.Ano = Ano;
        this.Ar_Condicionado = Ar_Condicionado;
    }

    // Padrão de Fábrica
    public Carro(){
        System.out.println("Padrão de Fábrica");
        this.Marca = "Ford";
        this.Cor = "Branco";
        this.Ano = 2025;
        this.Ar_Condicionado = true;
    }

    public String getMarca(){
        return Marca;
    }
    public void setMarca(String Marca){
        this.Marca = Marca;
    }

    public String getCor(){
        return Cor;
    }
    public void setCor(String Cor){
        this.Cor = Cor;
    }

    public int getAno(){
        return Ano;
    }
    public void setAno(int Ano){
        this.Ano = Ano;
    }

    public boolean isAr_Condicionado(){
        return Ar_Condicionado;
    }
    public void setAr_Condicionado(boolean Ar_Condicionado){
        this.Ar_Condicionado = Ar_Condicionado;
    }

    @Override
    public String toString() {
        return
            "Marca: " + this.Marca +
            " | Cor: " + this.Cor +
            " | Ano: " + this.Ano +
            " | Ar Condicionado: " + this.Ar_Condicionado +
            "\n"
        ;
    }

    

    public static void main(String[] args) {
        System.out.println("\n-----------------------------------------------------------------------------");
        Carro c1 = new Carro();
        System.out.println(c1); // Default
        
        Carro c2 = new Carro("Ford", "Azul", 2023, true);
        System.out.println(c2);        
    }
}
