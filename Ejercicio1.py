#1.-Escribir una función Reemplazar que tenga como argumentos una pila con tipo de elemento int y dos valores int: 
#nuevo y viejo de forma que si el segundo valor aparece en algún lugar de la pila, sea reemplazado por el segundo. 

def reemplazar(pila, nuevo, viejo):
    q = []

    while len(pila) > 0:
        aux = pila.pop()
        if aux == viejo:
            q.append(nuevo)
        else:
            q.append(aux)

    while len(q) > 0:
        aux = q.pop()
        pila.append(aux)

mi_pila=[5,2,7,9,4]
reemplazar(mi_pila, 7, 4)
print(mi_pila)