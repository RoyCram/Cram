#4.-Construir una función imprimeInverso que imprima los elementos de una pila 
#enlazada de enteros en orden inverso a partir de una posición p 

class NodoPila:
    def __init__(self, valor):
        self.valor = valor
        self.siguiente = None

class PilaEnlazada:
    def __init__(self):
        self.cima = None

    def apilar(self, valor):
        nuevo_nodo = NodoPila(valor)
        if not self.cima:
            self.cima = nuevo_nodo
        else:
            nuevo_nodo.siguiente = self.cima
            self.cima = nuevo_nodo

def imprime_Inverso(pila, p):

    pila_aux = PilaEnlazada()
    
  
    for _ in range(p):
        if pila.cima:
            pila_aux.apilar(pila.cima.valor)
            pila.cima = pila.cima.siguiente

   
    while pila_aux.cima:
        print(pila_aux.cima.valor)
        pila_aux.cima = pila_aux.cima.siguiente


if __name__ == "__main__":
    mi_pila = PilaEnlazada()
    mi_pila.apilar(1)
    mi_pila.apilar(2)
    mi_pila.apilar(3)
    mi_pila.apilar(4)

    posicion = 2

    print("Imprimiendo en orden inverso desde la posición", posicion)
    imprime_Inverso(mi_pila, posicion)
