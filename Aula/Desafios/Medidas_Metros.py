Medida = float(input("Digitem um Distância em Metros: "))

Km = float(Medida / 1000)
Hm = float(Medida / 100)
Dam = float(Medida / 10)
M = float(Medida)
Dm = int(Medida * 10)
Cm = int(Medida * 100)
Mm = int(Medida * 1000)


print(f'\nA medida de {M :.2f}m, Corresponde a:')
print(f'{Km :.3f} km')
print(f'{Hm :.2f} hm')
print(f'{Dam :.1f} dam')
print(f'{M :.0f} m')
print(f'{Dm} dm')
print(f'{Cm} cm')
print(f'{Mm} mm')