import os

class Task:
    def __init__(self, title, description):
        self.title = title
        self.description = description
        self.completed = False

    def mark_completed(self):
        self.completed = True

class TaskManager:
    def __init__(self):
        self.tasks = []

    def add_task(self, task):
        self.tasks.append(task)

    def list_tasks(self):
        for i, task in enumerate(self.tasks, start=1):
            status = "Completada" if task.completed else "Pendiente"
            print(f"{i}. Título: {task.title}, Descripción: {task.description}, Estado: {status}")

    def complete_task(self, task_index):
        if 1 <= task_index <= len(self.tasks):
            task = self.tasks[task_index - 1]
            task.mark_completed()
            print(f"Tarea '{task.title}' marcada como completada.")
        else:
            print("Índice de tarea no válido.")

def main():
    task_manager = TaskManager()

    while True:
        os.system('clear' if os.name == 'posix' else 'cls')  

        print("\nSistema de Gestión de Tareas")
        print("1. Agregar Tarea")
        print("2. Listar Tareas")
        print("3. Marcar Tarea como Completada")
        print("4. Salir")
        choice = input("Seleccione una opción: ")

        if choice == '1':
            title = input("Ingrese el título de la tarea: ")
            description = input("Ingrese la descripción de la tarea: ")
            task = Task(title, description)
            task_manager.add_task(task)
        elif choice == '2':
            print("\nLista de Tareas:")
            task_manager.list_tasks()
        elif choice == '3':
            task_index = int(input("Ingrese el número de la tarea a marcar como completada: "))
            task_manager.complete_task(task_index)
        elif choice == '4':
            print("¡Hasta luego!")
            break
        else:
            print("Opción no válida. Por favor, seleccione una opción válida.")

if __name__ == "__main__":
    main() 





