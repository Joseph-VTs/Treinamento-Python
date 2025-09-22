class Pessoa:
    
    # def = Função
    # self = this em Java
    def __init__(self, Nome: str, Idade: int):
        self.Nome = Nome
        self.Idade = Idade
        
    # Método / Função de Conversão
    def Exibir_Informacoes(self):
        print("Nome: ", self.Nome)
        print("Idade: ", self.Idade)
        
Pessoa_1 = Pessoa("Rebeca", 33)
# Pessoa_2 = Pessoa()

# se usar somente print(Pessoa_1) imprime <__main__.Pessoa object at 0x0000023292CC6A50> pois está sem os métodos de conversão
print(Pessoa_1)


print("\nPessoas Cadastradas")
print(Pessoa_1.Nome)
Pessoa_1.Exibir_Informacoes()

# Outros Cadastros
Pessoa_2 = Pessoa("Tito", 25)
Pessoa_2.Exibir_Informacoes()