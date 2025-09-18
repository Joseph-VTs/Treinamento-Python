vendas = [
    {
        "Produto": "Armário 1.0",
        "Descrição": "Armário de Madeira 2 Portas",
        "Custo": 50.00,
        "Venda": 98.00,
        "Lucro": 48.00,
        "Data Venda": "17/08/2023",
        "Cliente": "Anderson Silva"
    },
    {
        "Produto": "Armário 1.0",
        "Descrição": "Armário de Madeira 2 Portas",
        "Custo": 50.00,
        "Venda": 98.00,
        "Lucro": 48.00,
        "Data Venda": "17/08/2023",
        "Cliente": "Maria José"
    }
]

# Cabeçalho da tabela
print("📦 Tabela de Vendas de Produtos\n")
print(f"{'Produto':<15} | {'Descrição':<35} | {'Custo':>7} | {'Venda':>7} | {'Lucro':>7} | {'Data Venda':<12} | {'Cliente'}")
print("-" * 110)

# Inicializando totais
total_lucro = 0
clientes = set()

# Linhas da tabela
for venda in vendas:
    total_lucro += venda["Lucro"]
    clientes.add(venda["Cliente"])
    
    print(f"{venda['Produto']:<15} | {venda['Descrição']:<35} | R$ {venda['Custo']:>5.2f} | R$ {venda['Venda']:>5.2f} | R$ {venda['Lucro']:>5.2f} | {venda['Data Venda']:<12} | {venda['Cliente']}")

# Rodapé com totais
print("-" * 110)
print(f"🧮 Total de Lucro: R$ {total_lucro:.2f}")
print(f"👥 Total de Clientes: {len(clientes)}")
