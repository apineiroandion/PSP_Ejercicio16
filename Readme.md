# Ejercicio 16
## Enunciado

Crea un programa usando hilos que simule el comportamiento de un ascensor en un edificio de 20 plantas. Cuando alguien llama el ascensor desde un piso, irá a ese piso cuando pueda (si está parado, sale de inmediato, si está en marcha, solo podrá ir cuando haya finalizado su recorrido, ya sea de subida o de bajada)

Para poder controlar este movimiento, necesitamos conocer cuál es el piso en el que se encuentra el ascensor.

----------------    

## Funcionamiento App

Al ejecutar la aplicaccion aparece un panel con 20 botones, del 0 al 19, y un panel que indica el piso en el que nos encontramos.
Cuando pulsamos cada boton se inicia el hilo correspondiente, y si el ascensor esta en movimiento, se guardan las peticions y se ç
ejecutan en cuanto haya finalizado el movimiento actual.

