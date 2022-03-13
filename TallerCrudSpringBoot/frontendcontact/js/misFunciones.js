function pintarRespuesta(items) {
  var myTable = "<table>";
  for (var i = 0; i < items.length; i++) {
    myTable += "<tr>";
    myTable += "<td>" + items[i].id + "</td>";
    myTable += "<td>" + items[i].name + "</td>";
    myTable += "<td>" + items[i].number + "</td>";
    myTable += "<td>" + items[i].email + "</td>";
    myTable += "<td>" + items[i].date + "</td>";
    myTable+="<td> <button onclick='borrarElemento("+items[i].id+")'>Borrar</button>"; // Borar
    myTable += "</tr>";
  }
  myTable += `</table>`;
  $("#resultado").append(myTable);
}
