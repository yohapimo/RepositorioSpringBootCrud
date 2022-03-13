function traerInformacion() {
  $.ajax({
    url: "http://localhost:8081/api/contacts",
    type: "GET",
    dataType: "json",

    success: function (respuesta) {
      console.log(respuesta);
      pintarRespuesta(respuesta.items);
    },

    // código a ejecutar si la petición falla;
    // son pasados como argumentos a la función
    // el objeto de la petición en crudo y código de estatus de la petición
    error: function (xhr, status) {
      $("#mensajes").html(
        "Ocurrio un problema al ejecutar la petición..." + status
      );
    },

    // código a ejecutar sin importar si la petición falló o no
    complete: function (xhr, status) {
      $("#mensajes").html("Obteniendo Listado de contactos..");
      $("#mensajes").hide(1000);
    },
  });
}
