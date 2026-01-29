async function loadChartData1() {
    try {
        const response = await fetch('/chart');
        const data = await response.json();
        const ctx = document.getElementById('barChart').getContext('2d');

        if (window.barChartInstance instanceof Chart) {
            window.barChartInstance.destroy();
        }

        window.barChartInstance = new Chart(ctx, {
            type: 'bar',
            data: {
                labels: ['Обязательные', 'Желанные', 'Имиджевые'],
                datasets: [{
                    label: 'Расходы (руб.)',
                    data: [data.required, data.desirable, data.imageBased],
                    backgroundColor: ['rgba(75, 192, 192, 0.5)', 'rgba(255, 159, 64, 0.5)', 'rgba(153, 102, 255, 0.5)'],
                    borderColor: ['rgb(75, 192, 192)', 'rgb(255, 159, 64)', 'rgb(153, 102, 255)'],
                    borderWidth: 1
                }]
            }
        });
    } catch (e) { console.error(e); }
}

loadChartData1();