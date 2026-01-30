const input = document.getElementById("texto");
const lista = document.getElementById("lista");

const btnAdd = document.getElementById("btnAdd");
const btnEdit = document.getElementById("btnEdit");
const btnDelete = document.getElementById("btnDelete");

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

btnEdit.addEventListener("click", () => {
  const primero = lista.querySelector("li");

  if (!primero) {
    alert("No hay elementos");
    return;
  }

  primero.textContent = "➤Editado";
});


btnDelete.addEventListener("click", () => {
  const ultimo = lista.lastElementChild;

  if (!ultimo) {
    alert("Nada que borrar");
    return;
  }

  ultimo.remove();
});

