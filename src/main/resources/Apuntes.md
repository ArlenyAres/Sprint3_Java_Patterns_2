# Observer 
es un patrón de diseño de comportamiento que permite a un objeto notificar a otros objetos sobre cambios en su estado


## ¿Cómo funciona el patrón Observer?

El patrón de diseño Observer permite observar los cambios producidos por un objeto, de esta forma, cada cambio que afecte el estado del objeto observado lanzará una notificación a los observadores;
a esto se le conoce como Publicador-Suscriptor.
Observer es uno de los principales patrones de diseño utilizados en interfaces gráficas de usuario (GUI), ya que permite desacoplar al componente gráfico de la acción a realizar.

![Estructura del patrón de diseño Observer.png](/resources/Estructura del patrón de diseño Observer.png)

## Los componentes del patrón se explican a continuación:

### IObservable:
Interface que deben de implementar todos los objetos que quieren ser observados, en ella se definen los métodos mínimos que se deben implementar.
### ConcreteObservable:
Clase que desea ser observada, ésta implementa IObservable y debe implementar sus métodos.
### IObserver:
Interfaces que deben implementar todos los objetos que desean observar los cambios de IObservable.
### ConcreteObserver:
Clase concreta que está atenta de los cambios de IObserver, esta clase hereda de IObserver y debe de implementar sus métodos.

![Diagrama de secuencia del patrón Observer.png](/resources/Diagrama de secuencia del patrón Observer.png)


El ObserverA se registra con el objeto Observable para ser notificado de algún cambio.

El ObserverB se registra con el objeto Observable para ser notificado de algún cambio .

Ocurre algún cambio en el estado del Observable.

Todos los Observers son notificados con el cambio ocurrido.

## Ejemplo del mundo real
Mediante la implementación del patrón de diseño Observer desarrollaremos una aplicación que cargue desde el inicio la 
configuración del sistema. Dicha configuración notificara de forma automática a todos los objetos que estén interesado 
en los cambios, todo esto con la finalidad de que los objetos interesados en la configuración no tenga que consultar cada
momento si existe algún cambio importante para reflejarlo al usuario.



![Observer nos ayuda a resolver este problema.png](/resources/Observer nos ayuda a resolver este problema.png)  

### Ejercicicio

#### Interface Observable: Define los métodos necesarios para agregar, eliminar y notificar observadores.

#### nterface Observer: Define el método update que se llamará cuando haya una actualización en el Observable.

#### Clase BrokerObservable:
- Utiliza un HashSet para almacenar los observadores.
- Implementa los métodos para agregar, eliminar y notificar observadores.
- Tiene un método setPrice que actualiza el valor de la bolsa y notifica a los observadores.

#### Clases BrokerageHouse1, BrokerageHouse2 y  BrokerageHouse3: 

Implementan la interface Observer y proporcionan su propia implementación del método update para manejar las actualizaciones del valor de la bolsa.






https://reactiveprogramming.io/blog/es/patrones-de-diseno/