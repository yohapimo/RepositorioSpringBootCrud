function borrarElemento(idElemento) {
  var myData = {
    id: idElemento,
  };

  var dataToSend = JSON.stringify(myData);
  $.ajax({
    url: "/contact/",
    type: "DELETE",
    data: dataToSend,
    contentType: "application/JSON",
    dataType: "json",

    success: function (respuesta) {
      $("#resultado").empty();
      traerInformacion();
      alert("Se ha Eliminado.");
    },
  });
}
