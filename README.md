# ImageViewer
Muestra una ventana en la que se muestra una serie de imágenes cargadas desde una ruta, se permite navegar entre ellas, es decir avanzar o retroceder. Se tiene en cuenta si la carpeta está vacía. Asimismo, se ha implementado el patrón proxy sobre las imágenes, de forma que controlamos su acceso. De esta manera, no se crean todas las imágenes nada más abrir la ventana, sino que se ahorra el coste de crear la imagen hasta que no sea necesario. Proxy se comporta como una imagen normal, pero solo se carga cuando se necesita. Cabe destacar, que a parte del patrón proxy hemos implementado también el patrón Singleton y MVC. 
Hay una carpeta con imágenes de muestra para visualizarlo, si descarga la carpeta ponga la ruta de esta en la clase Main en la décima línea donde se especifica "path".

Se adjunta el diagrama de clases y el diagrama de casos de uso, se han realizado con el programa StarUML versión 4.1.6.
