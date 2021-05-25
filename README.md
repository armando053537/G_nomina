# Descripción general
  - Descripción: El programa está orientado a calcular el sueldo de un empleado y guardarlo a una tabla para añadir a múltiples empleados y generar una nómina.
  - Problema identificado: Se identificó dentro de la tienda que el proceso de administración, principalmente en las nóminas, se realizan la documentación de manera manual.
  - Solución: Al utilizar una aplicación para que genere la nómina, facilitará la documentación y ahorrará de manera eficiente el tiempo que se tomará.
# Requerimientos
  • Softwares: 
    ○ Java (TM) SE Development Kit 15.0.2
    ○ Apache NetBeans IDE 12.3
  • Librerías:
    • commons-collections4-4.4
    • commons-compress-1.2
    • poi-4.1.2
    • poi-ooxml-4.1.2
    • poi-ooxml-schemas-4.1.2
    • xmlbeans-3.1.0
# Instalación
  Cómo instalarlo: Primero se debe de clonar el repositorio del proyecto de GitHub. Después en NetBeans, se procederá a abrir un proyecto; se deberá seleccionar el proyecto clonado. Al añadir el proyecto a NetBeans, darán clic al botón derecho del ratón y seleccionarán limpiar y construir. Ya una vez que el programa termine de construir, irán a la carpeta clonada del proyecto y abrirán la carpeta dist, esta carpeta se encontrará un archivo .jar, este será el ejecutable del proyecto.
# Configuración
  Habrá una pestaña en el programa que se llama empleados, este apartado se podrá añadir, modificar y eliminar la información de los empleados de manera local, por lo que se podrá utilizar siempre este programa sin necesidad de internet.
# Uso
  Pestaña de Nomina:
    • En el campo de Empleado, aparecerán diferentes opciones que se podrán añadir en la Pestaña de Empleados.
    • En el campo de Sueldos se rellenará automáticamente con la información proporcionada del campo de Empleado; si no es correcta se podrá modificar.
    • En el campo de Seguro se rellenará automáticamente con la información proporcionada del campo de Empleado; si no es correcta se podrá modificar, este restará al empleado de su sueldo el pago de su seguro.
    • En el campo de Dia de descanso podrás añadir un saldo que se añadirá al sueldo del empleado si ha trabajado en su día de descanso.
    • En el campo de Incentivo podrás añadir un saldo que se añadirá al sueldo del empleado dependiendo si se lo ha ganado.
    • En el campo de Adeudo se restará del sueldo una deuda pendiente de parte de la tienda.
    • En el campo de Días que falto, se restará la paga de los días que falto a su sueldo, contando un día más como parte de penalización.
    • Al tener todos los campos llenos o solo los campos de interés, el botón de Realizar nómina añadirá toda la información y la añadirá a una tabla junto con la calculación de su sueldo que se ganará el empleado.
    • Si una información fue errónea, tendrás que seleccionarla en la tabla y da clic al botón Eliminar para que elimine completamente la fila.
    • Al tener toda la información necesaria de los empleados en la tabla, el botón de Imprimir generará una tabla de Excel con toda la información realizada y podrás imprimirla.
  Pestaña de Empleados
    • En el campo de Nuevo empleado podrás añadir el nombre completo del nuevo empleado a contratar.
    • En el campo de Sueldo del empleado podrás añadir el sueldo que ganará el nuevo empleado a contratar.
    • En el campo de Seguro del empleado podrás añadir el seguro que se descontará del sueldo al nuevo empleado a contratar.
    • El botón de Ingresar se guardará la información del nuevo empleado y se añadirá a la tabla.
    • Si ocurre la necesidad de modificar la información de un empleado, solo necesitarás dar doble clic en la tabla y podrás modificarla, al terminar de modificar la información, el botón Modificar guardará la información de la tabla.
    • Si quieres eliminar la información de un empleado por cualquier motivo, selecciona en la tabla al empleado y da clic al botón de Eliminar para borrar toda la información del empleado.
