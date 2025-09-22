
# Venda de Produtos
Nome_Produto = str(input("Nome do Produto: "))
Descricao_Produto = str(input("Descrição: "))

# Valores
Custo = int(input("Valor do Custo: "))
Venda = int(input("Valor da Venda: "))
Lucro = Venda - Custo
Data_Venda = str(input("Data da Venda: "))
Nome_Cliente = str(input("Nome do Cliente: "))

print(f"\nNome do Produto: {Nome_Produto}")
print(f"Descrição: {Descricao_Produto}")
print(f"Valor do Custo: R$ {Custo:.2f}")
print(f"Valor da Venda: R$ {Venda:.2f}")
print(f"Valor do Lucro: R$ {Lucro:.2f}")
print(f"Data da Venda: {Data_Venda}")
print(f"Nome do Cliente: {Nome_Cliente}")

print("")
# Venda_Caixa = (Nome_Produto + Descricao_Produto + Custo + Venda + Lucro + Data_Venda + Nome_Cliente)
Venda_Caixa = (
    Nome_Produto + " | " +
    Descricao_Produto + " | " +
    str(Custo) + " | " +
    str(Venda) + " | " +
    str(Lucro) + " | " +
    Data_Venda + " | " +
    Nome_Cliente
)


print(Venda_Caixa)

print("")
Tabela = [Venda_Caixa]
print(Venda_Caixa)

print(Tabela)

print("")
Tabela = [{
    "Produto": Nome_Produto,
    "Descrição": Descricao_Produto,
    "Custo": Custo,
    "Venda": Venda,
    "Lucro": Lucro,
    "Data": Data_Venda,
    "Cliente": Nome_Cliente
}]
print(Tabela)