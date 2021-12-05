import axios from "axios";

const IMAGE_API_BASE_URL = 'http://localhost:8081/api/postimages'

class ImageService {
    getImages() {
        return axios.get(IMAGE_API_BASE_URL)
    }
}

export default new ImageService()