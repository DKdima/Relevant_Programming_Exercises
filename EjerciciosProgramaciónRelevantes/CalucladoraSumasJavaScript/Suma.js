// Las variables Resultado_suma, Sumando_1 y Sumando_2 son globales; tienen que estar declaradas en index.html
/*
function Suma()
{
	Resultado_suma=Sumando_1+Sumando_2;
}
*/
document.addEventListener('DOMContentLoaded', function () {
  var cuadroTexto = document.getElementById('move-input');
  var botonMas = document.querySelector('.mas');
  var botonIgual = document.querySelector('.igual');
  var botonesNumericos = document.querySelectorAll('.botones button:not(.mas):not(.igual):not(.reseteo)');

  var Sumando_1 = "";
  var Sumando_2 = "";
  var operacionPendiente = "";
  var sumaRealizada = false;

  // Función para sumar los números
  function Suma() {
    Resultado_suma = parseInt(Sumando_1) + parseInt(Sumando_2);
    cuadroTexto.value = Resultado_suma;
  }

  // Inicialmente, deshabilita los botones de suma e igual
  botonMas.disabled = true;
  botonIgual.disabled = true;

  // Event listeners para botones numéricos
  botonesNumericos.forEach(function (boton) {
    boton.addEventListener('click', function () {
      if (!sumaRealizada) {
        if (operacionPendiente === "") {
          Sumando_1 += boton.textContent;
          cuadroTexto.value = Sumando_1;  // Actualiza el cuadroTexto solo con Sumando_1
        } else {
          Sumando_2 += boton.textContent;
          cuadroTexto.value += boton.textContent;
          botonIgual.disabled = false; // Habilita el botón de igual después de introducir el segundo número
        }
        botonMas.disabled = false; // Habilita el botón de suma
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
      botonMas.disabled = true; // Deshabilita el botón de suma después de la operación
      botonIgual.disabled = true; // Deshabilita el botón de igual después de la operación

      // Deshabilita los botones numéricos y solo deja disponible el botón de reseteo
      botonesNumericos.forEach(function (boton) {
        boton.disabled = true;
      });
      sumaRealizada = true;
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

    // Habilita los botones numéricos y deshabilita el botón de reseteo
    botonesNumericos.forEach(function (boton) {
      boton.disabled = false;
    });
    botonMas.disabled = true;
    botonIgual.disabled = true;
  });

  // Validación de entrada para permitir solo números y operadores
  cuadroTexto.addEventListener('input', function (event) {
    var inputValue = event.target.value;
    var numericValue = inputValue.replace(/[^0-9\+\-\*\/]/g, '');
    event.target.value = numericValue;
  });
});
