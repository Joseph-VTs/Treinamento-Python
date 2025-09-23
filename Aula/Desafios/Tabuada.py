Numero = int(input("Digite um Número para Gerar a Tábuada: "))
Repetir = int(input("Quantas vezes quer Repetir: "))


print(f'-' * 21)
for i in range(Repetir + 1): # +1 Pra por ir até o Número Digitado kkk
    print(f'{Numero} x {i} = {Numero * i}')
print(f'-' * 21)


"""
    print(f'-' * 15)
    print(f'{Numero} x 0 = {Numero * 0}')
    print(f'{Numero} x 1 = {Numero * 1}')
    print(f'{Numero} x 2 = {Numero * 2}')
    print(f'{Numero} x 3 = {Numero * 3}')
    print(f'{Numero} x 4 = {Numero * 4}')
    print(f'{Numero} x 5 = {Numero * 5}')
    print(f'{Numero} x 6 = {Numero * 6}')
    print(f'{Numero} x 7 = {Numero * 7}')
    print(f'{Numero} x 8 = {Numero * 8}')
    print(f'{Numero} x 9 = {Numero * 9}')
    print(f'{Numero} x 10 = {Numero * 10}')
    print(f'-' * 15)
"""