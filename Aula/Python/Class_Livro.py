class Livro:
    
    def __init__(self, Titulo, Autor):
        self.Titulo = Titulo
        self.Autor = Autor
        self.Esta_Disponivel = True # Inicia Como Disponível
        
    def Emprestar(self): # Saída
        if self.Esta_Disponivel: # Ele já entende o Padrão que é = True
            self.Esta_Disponivel = False
            print(f"O livro {self.Titulo} foi Emprestado")
        else:
            print(f"O livro {self.Titulo}, já foi Emprestado") 

    def Devolver(self): # Entrada
        if not self.Esta_Disponivel:
            self.Esta_Disponivel = True
            print(f"O livro {self.Titulo}, foi Devolvido")
        else:
            print(f"O livro {self.Titulo}, já está disponivel")
            
    def Verificar(self): # Extrato / Status
        print(f"O livro {self.Titulo}, do Autor {self.Autor}, está Disponível = {self.Esta_Disponivel}")
        


Livro_1 = Livro("Casa de Formigas", "Tamandua")
Livro_1.Verificar()
Livro_1.Emprestar()
Livro_1.Verificar()
Livro_1.Emprestar()

print(" ")
Livro_1.Verificar()
Livro_1.Devolver()
Livro_1.Verificar()
Livro_1.Devolver()
Livro_1.Verificar()