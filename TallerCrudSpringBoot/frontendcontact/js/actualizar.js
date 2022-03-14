function editarInformacion() {
  var myData = {
    id: $("#id").val(),
    name: $("#name").val(),
    number: $("#number").val(),
    email: $("#email").val(),
    date: $("#date").val(),
  };

  var dataToSend = JSON.stringify(myData);
  $.ajax({
    url: "http://localhost:8081/api/contact/",

    // Api realizada en Servidor de Oracle Cloud para hacer pruebas.
    //url: "https://gc2648324623f36-db202203081956.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/contact/contact/",

    type: "PUT",
    data: dataToSend,
    contentType: "application/JSON",
    dataType: "json",

    success: function (respuesta) {
      $("#resultado").empty(),
        $("#id").val(),
        $("#name").val(),
        $("#number").val(),
        $("#email").val(),
        $("#date").val(),
        traerInformacion();
      alert("Se ha Actualizado.");
    },
  });
}
