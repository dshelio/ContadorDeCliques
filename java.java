// Inicialize o contador
let clickCount = 0;

// Referência ao botão e ao contador na página
const clickButton = document.getElementById('click-button');
const clickCountDisplay = document.getElementById('click-count');

// Função que incrementa o contador
clickButton.addEventListener('click', function() {
    clickCount++;
    clickCountDisplay.textContent = clickCount;
});
