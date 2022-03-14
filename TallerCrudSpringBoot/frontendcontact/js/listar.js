function traerInformacion() {
  $.ajax({
    url: "http://localhost:8081/api/contacts",

    // Api realizada en Servidor de Oracle Cloud para hacer pruebas.
    //url: "https://gc2648324623f36-db202203081956.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/contact/contact",
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
