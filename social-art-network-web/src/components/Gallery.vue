<template>
  <div class="gallery">
      <tr v-for="image in images" v-bind:key = "image.id">
          <img :src=image.imageURL class="gallery__img" alt="">
      </tr>
  </div>
</template>

<script>
import ImageService from "../services/ImageService";

export default {
  name: "Gallery",
  data() {
    return {
      images: []
    }
  },
  methods: {
    getImages(){
      ImageService.getImages().then((response) => {
        this.images = response.data;
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
</style>