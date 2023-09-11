#3.-Construir una función que sume los elementos de una cola de enteros recursivamente. 

def sumar_digitos_recursivo(numero):
    if numero == 0:
        return 0
    else:
        ultimo_digito = numero % 10
        resto_numero = numero // 10
        suma_restante = sumar_digitos_recursivo(resto_numero)
    suma_total=ultimo_digito + suma_restante
    return suma_total

numero=int(input("Ingresa un número para sumar sus digitos"))
suma_digitos = sumar_digitos_recursivo(numero)
print(f"La suma de sus digitos de {numero} es: {suma_digitos}")
        