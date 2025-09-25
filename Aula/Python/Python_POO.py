#Encapsulamento
class Produtos:
    def __init__(self, Nome: str, Estoque: int): # Class Produtos Converte-se para Self
        # Para encapsular usar 2x o Underline __ antes do Atributo
        self.__Nome = Nome
        self.__Estoque = Estoque
        self.__Obter_Nome_Produto()
        
    def Adicionar_Estoque(self, Quantidade): # Depositar
        if Quantidade > 0:
            self.__Estoque += Quantidade
            print(f"✅ Estoque Atualizado! {self.__Estoque}")
        else:
            print("❌ ERRO! Digite uma valor inteiro!")
            
    def Consultar_Estoque(self):
        print(f"🚚 Estoque: {self.__Estoque}")
        
    def __Obter_Nome_Produto(self): # Sacar
        print(f"🛒 Produto: {self.__Nome}")
        

print("-" * 21 + " Produtos " + "-" * 21)
Produto_01 = Produtos("Cadeira", 4)
Produto_02 = Produtos("Mesa", 1)
print("-" * 51)

print("Consultar Produto: Cadeira")
Produto_01.Consultar_Estoque()
print("-" * 51)

Produto_01.Adicionar_Estoque(0)
Produto_01.Consultar_Estoque()
print("-" * 51)

Produto_01.Adicionar_Estoque(-5)
Produto_01.Consultar_Estoque()
print("-" * 51)

Produto_01.Adicionar_Estoque(3)
Produto_01.Consultar_Estoque()
print("-" * 51)

# Produto_01.Obter_Nome_Produto() # Não existe pois está Encapsulado


class Pessoa:
    def __init__(self, Nome: str):
        self.__Nome = Nome
        
    @property # Método Get ou o Método toString "Formatação"
    def Nome(self):
        return f"Nome: {self.__Nome}" # self.__Nome
    
    @Nome.setter # Método Set
    def Nome(self, Novo_Nome):
        if isinstance(Novo_Nome, str) and Novo_Nome:
            self.__Nome = Novo_Nome
        
Pessoa_01 = Pessoa("Jorge")
print(Pessoa_01.Nome)
Pessoa_01.Nome = "Caio"
print(Pessoa_01.Nome)



print()
# Herança
class Animal:
    def __init__(self, Nome: str):
        self.Nome = Nome
        
    def Emitir_Som(self):
        return f"🔊 {self.Nome}, Está Emitindo um Som!"
    
    def Movendo(self):
        return f"🧭 {self.Nome}, Está se Movimentando!"
        
class Baleia(Animal):
    pass

class Vaca(Animal):
    def Emitir_Som(self):
        return f"🔊 {self.Nome}, Está Mugindo!"

Jubarte = Baleia("Jubarte Marron")
print(Jubarte.Emitir_Som())
print(Jubarte.Movendo())

print()
Mimosa = Vaca("Vaca Holandesa")
print(Mimosa.Emitir_Som())
print(Mimosa.Movendo())



print()
#Polimorfismo = mesmo Método entre as classes com corpotamentos diferentes
class Funcionario:
    def __init__(self, Nome, Salario_Base):
        self.Nome = Nome
        self.Salario_Base = Salario_Base
        
    def Calcular_Salario(self):
        return f"{self.Salario_Base :.2f}"
    
    def Apresentar(self):
        return f"Nome: {self.Nome}, recebe um Salário de R$: {self.Calcular_Salario()}"
    
class Desenvolvedor(Funcionario):
    def __init__(self, Nome, Salario_Base, Linguagem):
        super().__init__(Nome, Salario_Base)
        self.Linguagem = Linguagem
    
    def Calcular_Salario(self):
        return f"{self.Salario_Base * 1.2 :.2f}"
    
    def Apresentar(self):
        return f"Nome: {self.Nome}, recebe um Salário de R$: {self.Calcular_Salario()}"
        
Funcionario_01 = Funcionario("Carlos", 1000)
Desenvolvedor_01 = Desenvolvedor("Bianca", 1000, "Python")

print("1°- " + Funcionario_01.Apresentar())
print(Funcionario_01.Calcular_Salario())
print("2°- " + Desenvolvedor_01.Apresentar()) # = 1000
print(Desenvolvedor_01.Calcular_Salario()) # = 1200 
