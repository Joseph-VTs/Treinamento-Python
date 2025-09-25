"""
.strip() remove espaços no início e fim.
.split() divide o nome em palavras.
.isalpha() garante que o nome contém somente letras.
all(palavra.isalpha() for palavra in Nome.split()) garante que cada palavra contém só letras.
"""

while True:
    try:
        Custo = int(input("Valor do Custo: "))
        break
    except ValueError:
        print("❌ Erro: Digite apenas números inteiros para o valor do custo!")
        
while True:
    Venda = input("Digite o Valor da Venda: ")
    if Venda.isdigit():
        Venda = int(Venda)
        break
    else:
        print("❌ Erro: Digite apenas números inteiros para o valor do custo!")        
        
while True:
    Tipo = input("Tipo do Produto: ").strip()
    if all(palavra.isalpha() for palavra in Tipo.split()):
        break
    else:
        print("❌ Erro: Digite apenas Letras para o Tipo do produto!")
        
while True:
    Descricao = input("Descrição do Produto: ")
    if Descricao.strip():
        break
    else:
        print("❌ Erro: A descrição não pode estar vazia!")

while True:
    try:
        Desc_2 = input("Desc 2: ")
        break
    except ValueError:
        print("❌ Erro: A descrição não pode estar vazia!")

Lucro = Venda - Custo

Cadastro = {
    "Custo" : Custo,
    "Venda" : Venda,
    "Tipo" : Tipo,
    "Descrição" : Descricao,
    "Lucro" : Lucro,
    "Desc2" : Desc_2
}

print("\nProduto Cadastrado com Sucesso... ✅")
print('-' *31)
print(f"Tipo: {Cadastro['Tipo']}")
print(f"Descrição: {Cadastro['Descrição']}")
print(f"Custo: R${Cadastro['Custo']}")
print(f"Venda: R${Cadastro['Venda']}")
print(f"Lucro: R${Cadastro['Lucro']}")
print(f"Desc 2: {Cadastro['Desc2']}")
print('-' *31)