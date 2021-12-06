import axios from "axios";

const USER_API_BASE_URL = 'https://social-art-network.ew.r.appspot.com/api/users'

class UserService {
    getUsers() {
        return axios.get(USER_API_BASE_URL)
    }

    getUsersId(id) {
        return axios.get(USER_API_BASE_URL + "/" + id)
    }
}

export default new UserService()