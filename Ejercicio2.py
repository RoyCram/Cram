#2.-Supongamos que TEST es alguna función Booleana que toma cualquier entero dado y devuelve un valor igual o distinto a cero.
#Consideremos el siguiente segmento de código:

def TEST(value):
    return True

N = 3
p = []

for i in range(1, N+1):
    if TEST(i):
        print(i)
    else:
        p.append(i)

while p:
    tope = p[-1]
    p.pop()
    p.append(tope)
    print(tope)