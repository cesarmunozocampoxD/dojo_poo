const countEl = document.getElementById('count');
let count = 0;

function render() {
  countEl.textContent = count;
}

document.getElementById('increment').addEventListener('click', () => {
  count++;
  render();
});

document.getElementById('decrement').addEventListener('click', () => {
  count--;
  render();
});

document.getElementById('reset').addEventListener('click', () => {
  count = 0;
  render();
});
