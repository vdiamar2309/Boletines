// Creamos un elemento <p> en memoria
const parrafo = document.createElement("p");

// Le asignamos texto al párrafo
parrafo.textContent = "Hola soy nuevo";

// Añadimos el párrafo al final del body
document.body.appendChild(parrafo);

// Obtenemos el contenedor con id="contenedor" del HTML
const contenedorcito = document.getElementById("contenedor");

// Movemos el párrafo dentro del contenedo (ya no estará en el body directamente)
contenedorcito.appendChild(parrafo);

// append() permite añadir texto y varios nodos a la vez
div.append("Hola");
div.append(p1, p2, "Texto");

// Creamos otro párrafo
const p = document.createElement("p");
p.textContent = "Soy el primero";

// prepend() lo inserta al principio del body
document.body.prepend(p);
