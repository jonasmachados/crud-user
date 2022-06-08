import axios from 'axios'

const USERS_REST_API_URL = 'http://localhost:8080/users';

class Userservice{
    
    getUsers(){
        return axios.get(USERS_REST_API_URL);
    }
}

export default new Userservice();