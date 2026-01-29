async function loadChartData2() {
    try {
        const response = await fetch('/chart');
        const data = await response.json();
        const ctx = document.getElementById('pieChart').getContext('2d');

        if (window.pieChartInstance instanceof Chart) {
            window.pieChartInstance.destroy();
        }

        window.pieChartInstance = new Chart(ctx, {
            type: 'pie',
            data: {
                labels: ['Обязательные', 'Желанные', 'Имиджевые'],
                datasets: [{
                    data: [data.required, data.desirable, data.imageBased],
                    backgroundColor: ['rgba(75, 192, 192, 0.5)', 'rgba(255, 159, 64, 0.5)', 'rgba(153, 102, 255, 0.5)'],
                    borderWidth: 1
                }]
            },
            options: {
                responsive: true
            }
        });
    } catch (e) { console.error(e); }
}

loadChartData2();