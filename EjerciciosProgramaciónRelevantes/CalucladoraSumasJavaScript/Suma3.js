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

  function updateButtonState(state) {
    switch (state) {
      case 'inicial':
        botonMas.disabled = true;
        botonIgual.disabled = true;
        botonesNumericos.forEach(function (boton) {
          boton.disabled = false;
        });
        break;
      case 'sumando_1':
        botonMas.disabled = false;
        botonIgual.disabled = true;
        botonesNumericos.forEach(function (boton) {
          boton.disabled = false;
        });
        break;
      case 'mas':
        botonMas.disabled = true;
        botonIgual.disabled = true;
        botonesNumericos.forEach(function (boton) {
          boton.disabled = false;
        });
        break;
      case 'sumando_2':
        botonMas.disabled = true;
        botonIgual.disabled = false;
        botonesNumericos.forEach(function (boton) {
          boton.disabled = false;
        });
        break;
      case 'resultado':
        botonMas.disabled = true;
        botonIgual.disabled = true;
        botonesNumericos.forEach(function (boton) {
          boton.disabled = true;
        });
        break;
      default:
        break;
    }
  }

  updateButtonState('inicial');

  botonesNumericos.forEach(function (boton) {
    boton.addEventListener('click', function () {
      if (!masPresionado) {
        masPresionado = true;
        updateButtonState('sumando_1');
      }
      if (operacionPendiente === "") {
        Sumando_1 += boton.textContent;
        cuadroTexto.value = Sumando_1;
      } else {
        Sumando_2 += boton.textContent;
        cuadroTexto.value = Sumando_2;
        updateButtonState('sumando_2');
      }
    });
  });

  botonMas.addEventListener('click', function () {
    cuadroTexto.value = '';
    masPresionado = true;
    updateButtonState('mas');
    operacionPendiente = "+";
  });

  botonIgual.addEventListener('click', function () {
    Resultado_suma = parseInt(Sumando_1) + parseInt(Sumando_2);
    cuadroTexto.value = Resultado_suma;
    Sumando_1 = "";
    Sumando_2 = "";
    operacionPendiente = "";
    sumaRealizada = true;
    updateButtonState('resultado');
  });

  var botonReseteo = document.querySelector('.reseteo');
  botonReseteo.addEventListener('click', function () {
    cuadroTexto.value = '';
    Sumando_1 = "";
    Sumando_2 = "";
    operacionPendiente = "";
    sumaRealizada = false;
    masPresionado = false;
    updateButtonState('inicial');
  });

  cuadroTexto.addEventListener('input', function (event) {
    var inputValue = event.target.value;
    var numericValue = inputValue.replace(/[^0-9\+\-\*\/]/g, '');
    event.target.value = numericValue;
  });
});
