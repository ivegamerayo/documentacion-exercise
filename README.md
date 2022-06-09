# Ejercicio de Git para la asignatura de Despliegues de Aplicaciones Web


- [x] Crea un repositorio en GITHUB 

- [x] Crea una clase calculadora en java utilizando netbeans o eclipse y otra clase calculadora en PHP , la clase debe tener una función suma, resta, multiplicación y división. En la clase división se debe controlar las excepciones de las divisiones por 0. 

- [x] Guarda ambas clases en el repositorio github. 

- [x] Desde el repositorio local conectate al repositorio github y descarga las clases del repositorio github a tu repositorio local.

- [x] Actualiza las clases, añadiendo todos los parametros de documentación necesarios. 

- [x] Genera la documentación de las clases

- [x] Sube al repositorio github los cambios de las clases desde líneas de comando y la documentación generada desde web. 

- [x] Documenta los pasos necesarios para realizar todo el proceso  y sube el documento al repositorio github. 

- [x] Adjunta el enlace en la tarea par poder verlo.

# Creación de repositorio local
Para ello creamos una carpeta, por terminal en Windows puedes usar el comando
```bash
mkdir documentacion
cd documentacion
```
Con los dos comandos anteriores hemos creado la carpeta y hemos accedido a la misma, ahora vamos a iniciar el repositorio de git con el comando

```git
git init
```

Creamos los archivos necesarios y cuando queramos hacer un commit volvemos a la terminal.

```git
git status
git add .
git commit -m "Primer commit"
```

Con esos comandos estamos viendo el estado de git, hemos añadido todos los archivos y hemos puesto un commit con su respectivo comentario. Una vez hecho todo hacemos un push para guardarlos.


# Creación de repositorio en GitHub
Abrimos la pagina web [Github](https://github.com) e iniciamos sesion con nuestra cuenta. En nuestra foto de perfil. Como podemos ver hay un botón que dice **New**


## Importando el proyecto
Cuando terminamos de hacer la creación del repositorio nos aparece la siguiente información:

	En mi caso como ya tengo un repositorio local usare los comandos de la segunda opcion, para ello nos vamos a la carpeta donde se encuentra nuestro repositorio local y escribimos los siguientes comandos.

```git
	git remote add origin nuestra_rama
	git branch -M main
	git push -u origin main
```


Una vez hecho eso, nos podemos ir a nuestro repositorio de github y veremos que se han subido correctamente nuestros datos.


# Descargando desde el repositorio online al local

Para esto existen dos formas totalmente distintas, en caso de que ya tengamos el repositorio pero por algun casual algun compañero ha hecho un push y tu tienes una version antigua, puedes realizar el siguiente comando

```git
	git pull
```

En caso de que sea por que tu no tienes el repositorio en tu ordenador puedes hacer lo siguiente para clonarlo

```git 
git clone https://github.com/ivegamerayo/documentacion.git
```

# Generando documentación de las clases
## Java
En este caso estamos usando la version de __Netbeans 12.5__ la cual de una forma muy sencilla nos genera automaticamente la documentación.


Haciendo click derecho sobre nuestro proyecto, podemos ver que hay una opcion que dice __Generate Javadoc__ pulsando en ella automaticamente nos genera una web HTML con la documentacion. En este caso la documentacion se guarda en la ruta del proyecto pero en la subcarpeta _target/site_ con el nombre de _apidocs_.

## PHP
En este caso se ha usado el programa __Doxygen__ que es de codigo abierto. Aunque habria que rellenar mas parametros que con Java su uso sigue siendo igual de fácil.

Hemos puesto la misma ruta para que nos la genere en el mismo sitio que el archivo completo.

Seleccionamos los parametros que mas se ajusten a lo que estamos buscando

Marcamos como preferimos que se nos muestre

Pulsamos en el boton de ejecutar y ¡Listo!

## Subiendo la documentacion a nuestro repositorio online
Para ello nos llevamos la documentacion a nuestra carpeta del repositorio local, y ejecutamos una terminal de comandos

Como podemos ver nos dice que se han creado unos nuevos archivos que todavia no se han subido, para ello ejecutamos los siguientes comandos

```git
git add .
git commit -m "Añadida la documentacion de PHP"
git push
```
Como podemos ver, nos ha confirmado que todo se ha subido correctamente
