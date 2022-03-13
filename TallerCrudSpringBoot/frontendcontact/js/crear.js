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
    type: "POST",
    data: dataToSend,
    contentType: "application/JSON",
    dataType: "json",

    success: function (respuesta) {
      alert("Se ha Guardado.");
    },
  });
}
