Nome1 = input("Nome: ")
Idade1 = input("Idade: ") # Considerado como String
Idade2 = int(input("Idade Inteira: "))
Idade3 = float(input("Idade com Float: "))

print("Nome: ", Nome1)
print(type(Nome1))
print("Idade String: ", Idade1) # 22 & Teste = 22 & Teste
print(type(Idade1))
print("Idade Inteira: ", Idade2) # 22 = 22
print(type(Idade2))
print("Idade Float: ", Idade3) # 22 = 22.0
print(type(Idade3))

# Ordem Matemática
# 1°- () | 2°- ** | 3°- * / // % | 4°- + -

Nome2 = 'João'
Nome3 = 'Lemos'
Nome4 = 'Rebeca'
Nome5 = 'Liziane'
print('Seja Bem-Vindo {:^20}!'.format(Nome2)) # :^ Centraliza
print('Seja Bem-Vindo {:>20}!'.format(Nome3)) # :> Direita
print('Seja Bem-Vindo {:<20}!'.format(Nome4)) # :< Esquerda
print('Seja Bem-Vindo {:-^20}!'.format(Nome5)) # :-^ Preenche Espaço

print()
# Ou também
print(f'Seja Bem-Vindo {Nome2:^20}')
print(f'Seja Bem-Vindo {Nome3:>20}')
print(f'Seja Bem-Vindo {Nome4:<20}')
print(f'Seja Bem-Vindo {Nome5:-^20}')

print()
# Depois da Vírgula
S = 4 + 3
M = 4 * 3
D = 7 / 3
Di = 4 // 3
E = 4 ** 3

print(f"S: {S}, M: {M}, D: {D}, Di: {Di}, E: {E}")
print(f"D: {D : .3f}") # 3 depois da Virgula

print()
# Juntar os Prints
print("Começando uma Fra", end='')
print("se Continuando a Frase", end=' ')
print("na mesma linha")
