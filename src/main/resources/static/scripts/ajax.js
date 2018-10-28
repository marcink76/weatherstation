const temp_value = document.getElementById('temp');
const humi_value = document.getElementById('humi');
const press_value = document.getElementById('pressure');
const pm01_value = document.getElementById('pm01');
const pm25_value = document.getElementById('pm25');
const pm10_value = document.getElementById('pm10');

const data_value = document.getElementById('date');
const time_value = document.getElementById('time');
const box = document.getElementById('last-mesurment-box');


document.addEventListener("DOMContentLoaded", function (event) {
    loadLastMeasurment();
});

let myVar = setInterval(loadLastMeasurment, 5000);

function loadLastMeasurment() {
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState === 4 && this.status === 200) {
            console.log(xhttp);
            const measurment = JSON.parse(xhttp.response);
            data_value.innerText = measurment.date;
            time_value.innerText = measurment.time;
            temp_value.innerHTML = measurment.temperature;
            humi_value.innerHTML = measurment.humidity;
            press_value.innerHTML = measurment.pressure;
            pm01_value.innerText = measurment.pm01;
            pm25_value.innerText = measurment.pm25;
            pm10_value.innerText = measurment.pm10;
            alert(measurment.pm01, 10, 100, pm01_value);
            alert(measurment.pm25, 10, 100, pm25_value);
            alert(measurment.pm10, 10, 100, pm10_value);

        }
    };
    xhttp.open("GET", "http://localhost:8080/api/last/", true);
    xhttp.send();
}

function alert(pm, min, max, box) {
    if (pm < min) {
        box.style.backgroundColor = 'green';
    }
    if (pm > min && pm < max) {
        box.style.backgroundColor = 'yellow';
    }
    if (pm >= max) {
        box.style.backgroundColor = 'red';
    }
}