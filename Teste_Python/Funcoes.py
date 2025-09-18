## Funções

def Saudacao(Nome):
    print(f"Olá {Nome}")

print("José")
print("Fim...")

def Operacoes(a, b):
    Soma = a + b
    Produto = a * b
    return Soma, Produto

Lista = [12, 2, 10, 9, 5, 22, 7]
print(Lista)
Lista.append(32)
print(Lista)

# Tupla -> Imutavel = Constante não Muda
Tupla = (12, 2, 10)

Resultado = Operacoes(10, 3)
print(Resultado) # = Tupla (13, 30)

#Isolar Valores
print("Soma:", Resultado[0])
print("Produto:", Resultado[1])

# Desenpacotar 
Soma1, Produto1 = Operacoes(10, 3)
print(f"Soma é: {Soma1}. O Produto é: {Produto1}") 