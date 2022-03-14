function borrarElemento(idElemento) {
  var myData = {
    id: idElemento,
  };

  var dataToSend = JSON.stringify(myData);
  $.ajax({
    url: "http://localhost:8081/api/contact/",

    // Api realizada en Servidor de Oracle Cloud para hacer pruebas.
    //url: "https://gc2648324623f36-db202203081956.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/contact/contact/",
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
