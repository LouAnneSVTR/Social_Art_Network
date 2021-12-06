<template>
  <div class="container-fluid">
    <div class="nav">
      <span style="font-family: Helvetica,sans-serif " v-for="user in userS" v-bind:key = "user.id">
        <img :src=user.photoURL class="gallery__img" alt="" >
        <div class="name">
        {{user.userFirstName}}
        {{user.userLastName}}
        </div>
        <div class="post_button">
          <input type="button" value="Poster contenu">
        </div>
    </span>
    </div>
  </div>
</template>

<script>
import UserService from "../services/UserService";

export default {
  name: 'Users',
  data(){
    return {
      userS: []
    }
  },

  methods: {
    getOneUsers(){
      UserService.getUsersId("2").then((response) => {
        this.userS = response.data;
      });
    }
  },
  created() {
    this.getOneUsers()
  }
}
</script>

<style scoped>
.nav {
  background-color: #ffffff;
  border-radius: 30px;
  height: 10rem;

  align-items: center;
  justify-content: center;
  flex-direction: column;
  margin-top: 50px;
  margin-bottom: 100px;
}

.gallery__img {
  width: 250px;
  position: relative;
  align-items: center;
  height: 180px;
  border-radius: 300px;
  padding: 0.5rem 1rem 0.4rem;
  background: #ffffff;
  color: #333;
}

.name {
  font-size: 2em;

}

.post_button {
  border-radius: 60px;
  font-size: 1.5em;

}



</style>