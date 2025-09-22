public class Pessoa{
    // Atributos
    private String Nome;
    private String SobreNome;
    private String DataNasc;
    private String RG;
    private String[] Telefone;
    
    public String getNome(){ return this.Nome;}
    public void setNome(String N ){ this.Nome = N;}
    
    public String getSobreNome(){ return this.SobreNome; }
    public void setSobreNome(String S){ this.SobreNome = S;}
    
    public String getDataNasc(){ return this.DataNasc;}
    public void setDataNasc(String D){ this.DataNasc = D;}
    
    public String getRG(){ return this.RG;}
    public void setRG(String R){ this.RG = R;}
    
    public String[] getTelefone(){ return this.Telefone;}
    public void setTelefone(String[] Telefone){ this.Telefone = Telefone;}
    
    
    public static void main (String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Joseph");
        p1.setSobreNome("Silva");
        p1.setDataNasc("21/09/1990");
        p1.setRG("123456789");
        p1.setTelefone(new String[]{"(51) 99999-0000", "(51) 98888-1111"});

        System.out.println("Nome completo: " + p1.getNome() + " " + p1.getSobreNome());
        System.out.println("Data de nascimento: " + p1.getDataNasc());
        System.out.println("RG: " + p1.getRG());
        System.out.println("Telefones:");
        for (String tel : p1.getTelefone()) {System.out.println(" - " + tel);}
    }
}