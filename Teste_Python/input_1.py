# Nome = input("Digite seu Nome: ")
# print("Seu Nome é:", Nome)
# print(f"Seu Nome é: {Nome}")
# print("Seu Nome é: {}".format(Nome))

Idade = int(input("Digite sua Idade: "))

if Idade >= 100:
    print("Railander")
elif Idade >= 60:
    print("Idoso")
elif Idade >= 18:
    print("Maior de Idade")
elif Idade >= 12:
    print("Adolescente")
elif Idade >=5:
    print("Criança")
elif Idade >= 0:
    print("Bebê")
else:
    print("Maior de Idade")
print("Fim")