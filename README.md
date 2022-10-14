# Práctica 2.5 Generador de números aleatorios

## Parte 1

Crea un generador de números aleatorios gráfico. Utiliza el elemento *JSpinner* (contadores) que mostrará el número aleatorio generado entre esos dos números en un campo *JTextField* al pulsar el botón generar.

La ventana deberá tener además un **menú** con los elementos Fichero y Edición. El menú fichero deberá tener un elemento salir y el menú *Edición* un elemento que permita borrar el contenido de los campos de la ventana.

Ayúdate de la función `Math.random()` entre dos números y de una **clase auxiliar** para realizar dichos cálculos.

![](media/ba18dcfdd7fd2df3ed8dfe1cefa04f24.png)


## Parte 2

Mejora el ejercicio anterior agregando un *checkbox* que en caso de estar marcado solo permita mostrar números **primos** entre los valores requeridos.

Agrega en el *menú edición* un elemento llamado **historial** que permita ver los últimos números generados en una ventana modal (*JDialog*). La opción del menú **borrar todo** borrará también dicho historial.

Agrega en el *menú fichero* una opción para **guardar** el historial del listado generado en un fichero de texto. Se deberá verificar si ya existe un fichero con el mismo nombre antes de sobreescribirlo.
 
