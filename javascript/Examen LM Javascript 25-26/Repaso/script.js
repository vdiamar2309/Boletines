// ==========================
// CE.c — Selección DOM
// ==========================


const btnAdd = document.getElementsByClassName("btnAdd");
const input = document.getElementsByClassName("texto");
const btnDelete = document.getElementsByClassName("btnDelete");
const lista =document.getElementByIdClassname("lista");
const btnDark =document.getElementByIdClassname("btnDark");


// ==========================
// CE.d — Crear y modificar
// ==========================
btnAdd.addEventListener("click", () => {
  const texto = input.value.trim();

  if (texto === "") {
    alert("Escribe algo antes de añadir");
    return;
  }

  const li = document.createElement("li");
  li.textContent = texto;

  lista.appendChild(li);

  input.value = "";
  input.focus();
});

btnDelete.addEventListener("click", () => {
  const ultimo = lista.lastElementChild;

  if (!ultimo) {
    alert("Nada que borrar");
    return;
  }

  ultimo.remove();
});


  // CE.b — condicional
 

  // Crear elemento
  

  // Modificar contenido
  

  // Evento seleccionar + editar
  

  // Insertar en DOM
  

  // limpieza input



// ==========================
// CE.e — Eliminar
// ==========================






// ==========================
// CE.f — Estilos dinámicos
// ==========================




