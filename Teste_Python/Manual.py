# ✅ Como concatenar corretamente
# 1. Usando + com strings
print("Número: " + str(3.5) + " - Concatenação 1")

# 2. Usando vírgulas no print() (sem concatenação, mas funciona)
print("Número:", 3.5, "- Concatenação 2")

# 3. Usando f-strings (Python 3.6+)
numero = 3.5
print(f"Número: {numero} - Concatenação 3")

# 4. Usando .format()
print("Número: {} - {}".format(3.5, "Concatenação 4"))