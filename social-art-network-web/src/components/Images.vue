<template>
  <div class = "container">
    <tr v-for = "image in images" v-bind:key = "image.id">
      <img :src=image.imageURL alt="">
    </tr>
  </div>
</template>

<script>
import PostImageService from "../services/PostImageService";
  export default {
    name: 'images',
    data() {
      return {
        images: []
      }
    },
    methods: {
      getPostImages() {
        PostImageService.getPostImages().then((responce) => {
          this.images = responce.data;
        });
      }
    },
    created() {
      this.getPostImages()
    }
  }
</script>

<style scoped>

</style>