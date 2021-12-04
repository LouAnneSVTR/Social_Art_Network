import axios from "axios";

const POSTIMAGE_API_BASE_URL = 'http://localhost:8081/api/postimages'

class PostImageService {

    getPostImages() {
        return axios.get(POSTIMAGE_API_BASE_URL)
    }
}

export default new PostImageService()
