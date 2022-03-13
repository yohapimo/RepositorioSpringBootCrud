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
    url: "/contact/",
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
