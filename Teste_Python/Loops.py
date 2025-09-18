Inicio = 1
Final = 5

for Item in range(Inicio, Final):
    print(Item) # = 1 ao 4
    
Nomes = ["Ana", "Carol", "Arthur", "Steve", "Devid", "Bianca"]

print("Lista de Nomes")
for Nome in Nomes:
    print(f"{Nome + ", "}")
    
for i in range(10):
    if i == 5:
        break
    print(i)
    
# Printa Números divisiveis por 2
for i in range(10):
    if i % 2:
        continue
    print(i)
    
# Só irá parar
Contador = 1
while Contador <= 5:
    print("Contandor", Contador, "de 5")
    Contador += 1
    
# Percorrer
Contador = 1
while True:
    print(int(Contador))
    Contador += 1
    
    if Contador >= 100000:
        break