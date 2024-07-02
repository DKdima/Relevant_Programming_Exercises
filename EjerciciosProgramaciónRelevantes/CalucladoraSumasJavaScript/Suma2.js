document.addEventListener('DOMContentLoaded', function () {
  var cuadroTexto = document.getElementById('move-input');
  var botonMas = document.querySelector('.mas');
  var botonIgual = document.querySelector('.igual');
  var botonesNumericos = document.querySelectorAll('.botones button:not(.mas):not(.igual):not(.reseteo)');

  var Sumando_1 = "";
  var Sumando_2 = "";
  var operacionPendiente = "";
  var sumaRealizada = false;
  var masPresionado = false;

  // Función para sumar los números
  function Suma() {
    Resultado_suma = parseInt(Sumando_1) + parseInt(Sumando_2);
    cuadroTexto.value = Resultado_suma;
    // Reinicia variables
    Sumando_1 = "";
    Sumando_2 = "";
    operacionPendiente = "";
    sumaRealizada = true;
    botonMas.disabled = true; // Deshabilita el botón de suma
    botonIgual.disabled = true; // Deshabilita el botón de igual
    // Deshabilita los botones numéricos
    botonesNumericos.forEach(function (boton) {
      boton.disabled = true;
    });
  }

  // Inicialmente, deshabilita los botones de suma e igual
  botonMas.disabled = true;
  botonIgual.disabled = true;

  // Event listeners para botones numéricos
  botonesNumericos.forEach(function (boton) {
    boton.addEventListener('click', function () {
      if (!sumaRealizada) {
        if (!masPresionado) {
          botonMas.disabled = false; // Habilita el botón de suma
          masPresionado = true;
        }
        if (operacionPendiente === "") {
          Sumando_1 += boton.textContent;
        } else {
          Sumando_2 += boton.textContent;
          botonIgual.disabled = false; // Habilita el botón de igual después de introducir el segundo número
        }
        cuadroTexto.value += boton.textContent;
      }
    });
  });

  // Event listener para el botón de suma
  botonMas.addEventListener('click', function () {
    if (!sumaRealizada) {
      cuadroTexto.value += '+';
      botonMas.disabled = true; // Deshabilita el botón de suma
      botonIgual.disabled = true; // Deshabilita el botón de igual
      operacionPendiente = "+";
    }
  });

  // Event listener para el botón de igual
  botonIgual.addEventListener('click', function () {
    if (!sumaRealizada) {
      Suma();
    }
  });

  // Event listener para el botón de reseteo
  var botonReseteo = document.querySelector('.reseteo');
  botonReseteo.addEventListener('click', function () {
    cuadroTexto.value = '';
    Sumando_1 = "";
    Sumando_2 = "";
    operacionPendiente = "";
    sumaRealizada = false;
    masPresionado = false;
    botonMas.disabled = true; // Deshabilita el botón de suma
    botonIgual.disabled = true; // Deshabilita el botón de igual
    // Habilita los botones numéricos
    botonesNumericos.forEach(function (boton) {
      boton.disabled = false;
    });
  });

  // Validación de entrada para permitir solo números y operadores
  cuadroTexto.addEventListener('input', function (event) {
    var inputValue = event.target.value;
    var numericValue = inputValue.replace(/[^0-9\+\-\*\/]/g, '');
    event.target.value = numericValue;
  });
});
