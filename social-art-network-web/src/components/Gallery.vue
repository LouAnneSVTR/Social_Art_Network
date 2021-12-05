<template>
  <div class="gallery">
      <tr v-for="image in images" v-bind:key = "image.id">
        <figure>
          <figcaption>
            1
          </figcaption>
          <img :src=image.imageURL class="gallery__img" alt="">
        </figure>
      </tr>
  </div>
</template>

<script>
import ImageService from "../services/ImageService";
import UserService from "../services/UserService";

export default {
  name: "Gallery",

  data() {
    return {
      images: [],
      user: []
    }
  },
  methods: {
    getImages(){
      ImageService.getImages().then((response) => {
        this.images = response.data;
      });
    },
    getOneUser(id) {
      UserService.getUsersId(id).then((response) => {
        this.user = response.data;
      });
    }
  },
  created() {
    this.getImages()
  }
}
</script>

<style>
.gallery {
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  grid-template-rows: repeat(2, 1fr);
  grid-gap: 15px;
}
.gallery__img {
  width: 100%;
  height: 100%;
  object-fit: fill;
}


img {
  width:650px;
  display: block;
  border-radius: 0px 0px 25px 25px;
}
figure {
  margin: 0;
}
figcaption {
  padding: 0.5rem 1rem 0.4rem;
  background: #ddd;
  color: #333;
  border-radius: 1rem 1rem 0 0;
  text-align: end;
}
</style>