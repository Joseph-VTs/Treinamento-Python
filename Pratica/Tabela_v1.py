vendas = [
    {
        "Produto": "Armário",
        "Descrição": "Armário de Madeira 2 Portas",
        "Custo": 50.00,
        "Venda": 90.00,
        "Lucro": 40.00,
        "Data Venda": "17/06/2025",
        "Cliente": "Anderson Silva"
    },
    {
        "Produto": "Armário",
        "Descrição": "Armário de Madeira 2 Portas",
        "Custo": 50.00,
        "Venda": 90.00,
        "Lucro": 40.00,
        "Data Venda": "17/06/2025",
        "Cliente": "Maria José"
    }
]

# Exibindo como tabela
print("📦 Tabela de Vendas de Produtos\n")
print(f"{'Produto':<10} | {'Descrição':<35} | {'Custo':<7} | {'Venda':<7} | {'Lucro':<7} | {'Data Venda':<12} | {'Cliente'}")
print("-" * 100)

for venda in vendas:
    print(f"{venda['Produto']:<10} | {venda['Descrição']:<35} | R$ {venda['Custo']:<5.2f} | R$ {venda['Venda']:<5.2f} | R$ {venda['Lucro']:<5.2f} | {venda['Data Venda']:<12} | {venda['Cliente']}")