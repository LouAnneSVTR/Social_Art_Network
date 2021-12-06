import axios from "axios";

const IMAGE_API_BASE_URL = 'https://social-art-network.ew.r.appspot.com/api/postimages'

class ImageService {
    getImages() {
        return axios.get(IMAGE_API_BASE_URL)
    }
}

export default new ImageService()