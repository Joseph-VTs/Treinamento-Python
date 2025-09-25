# Exemplo Usando Animais

class Pato:
    def Emitir_Som(self):
        return "Quack!"
    
class Galinha:
    def Emitir_Som(self):
        return "Có! Có!"
    
class Peru:
    def Emitir_Som(self):
        return "Glu! Glu!"

def Barulho(Animal):
    return Animal.Emitir_Som()

Animais = [Pato(), Galinha(), Peru()]
for Animal in Animais:
    # print(f"{Animal} Som {Barulho(Animal)}") -> Erro
    print(f"{type(Animal).__name__}, está emitindo um Som 🔊: {Barulho(Animal)}")
    
# Excessões
def Dividir(a, b):
    try:
        
        return f""
    
    except:
        return f""