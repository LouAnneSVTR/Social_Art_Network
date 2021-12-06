<template>
  <div class="gallery">
      <tr v-for="image in images" v-bind:key = "image.id">
        <a v-for="user in users" v-bind:key = "user.id">
        <figure>
          <figcaption v-if="image.userId === user.id">
            <label> {{user.userLastName}}</label>
            <img :src=image.imageURL class="gallery__img" alt="" v-if="image.userId === user.id">
          </figcaption>
        </figure>
        </a>
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
      users: []
    }
  },
  methods: {
    getImages(){
      ImageService.getImages().then((response) => {
        this.images = response.data;
      });
    },
    getUser() {
      UserService.getUsers().then((response) => {
        this.users = response.data;
      });
    }
  },
  created() {
    this.getImages();
    this.getUser()
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
  border-radius: 1rem 1rem 1rem 1rem;
}
figure {
  margin: 0;
}
figcaption {
  padding: 0.5rem 1rem 0.4rem;
  background: #f3f3f3;
  color: #333;
  border-radius: 1rem 1rem 1rem 1rem;
  text-align: end;
  box-shadow: 1rem 1rem 1rem rgba(200, 200, 200,20%);;
}

label {
  text-align: left;
}
</style>