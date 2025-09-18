## Conversões

# de String para Inteiro
# Se entrar String "Letras" gera Erro
Idade_Str = "31"
Idade = int(Idade_Str) # Convertendo
print("Ao Receber um valor Inteiro em uma String", type(Idade_Str), "Tranformar em Inteiro", type(Idade), "Valor Convertido:", Idade, "\n") # = 31

# de Inteiro para Float
Numero_int = 10
Numero_Float = float(Numero_int)
print("Numero:", Numero_int, "Convertido para Float:", Numero_Float, "\n") # = 10.0

# de Float para Inteiro
Numero_Float = 10.9 # 10.1 á 10.9 = 10
Numero_int = int(Numero_Float)
print("Numero Float:", Numero_Float, "Convertido para Inteiro:", Numero_int, "\n") # = 10