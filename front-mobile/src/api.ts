import axios from "axios";

//const API_URL = 'http://192.168.0.105:8080'; qualquer coisa mudar para o endereço da Heroku
const API_URL = 'https://sergio-sds2.herokuapp.com';
export function fetcOrders() {
    return axios(`${API_URL}/orders`);
}