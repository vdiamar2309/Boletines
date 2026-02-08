// ==========================
// CE.c — Selección DOM
// ==========================
const input = document.getElementById("texto");
const btnAdd = document.getElementById("btnAdd");
const btnDelete = document.getElementById("btnDelete");
const btnDark = document.getElementById("btnDark");
const lista = document.getElementById("lista");
const titulo = document.getElementById("titulo");

let liSeleccionado = null;

// ==========================
// CE.d — Crear y modificar
// ==========================
btnAdd.addEventListener("click", () => {

  // CE.b — condicional
  if (input.value === "") {
    return;
  }

  // Crear elemento
  const li = document.createElement("li");

  // Modificar contenido
  li.textContent = input.value;

  // Evento seleccionar + editar
  li.addEventListener("click", () => {
    if (liSeleccionado) {
      liSeleccionado.classList.remove("seleccionado");
    }

    liSeleccionado = li;
    li.classList.add("seleccionado");
    li.textContent = "Editado: " + li.textContent.replace("Editado: ", "");
  });

  // Insertar en DOM
  lista.appendChild(li);

  // limpieza input
  input.value = "";
});

// ==========================
// CE.e — Eliminar
// ==========================
btnDelete.addEventListener("click", () => {
  if (liSeleccionado) {
    lista.removeChild(liSeleccionado);
    liSeleccionado = null;
  } else {
    alert("No hay ninguna tarea seleccionada");
  }
});

// ==========================
// CE.f — Estilos dinámicos
// ==========================
btnDark.addEventListener("click", () => {
  titulo.classList.toggle("oscuro");
});
