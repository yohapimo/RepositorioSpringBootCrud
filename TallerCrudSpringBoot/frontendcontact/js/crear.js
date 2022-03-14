function guardarInformacion() {
  var myData = {
    id: $("#id").val(),
    name: $("#name").val(),
    number: $("#number").val(),
    email: $("#email").val(),
    date: $("#date").val(),
  };

  var dataToSend = JSON.stringify(myData);
  $.ajax({
    url: "http://localhost:8081/api/contact",

    //url: "https://gc2648324623f36-db202203081956.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/contact/contact",
    //type: "POST",
    data: dataToSend,
    contentType: "application/JSON",
    dataType: "json",

    success: function (respuesta) {
      alert("Se ha Guardado.");
    },
  });
}
