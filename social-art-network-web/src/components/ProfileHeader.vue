<template>
  <div class="container-fluid">
    <div class="nav">
      <span style="font-family: Helvetica,sans-serif ">
        <img :src=user.photoURL class="gallery__img" alt="">
        test
        {{user.userFirstName}}
        {{user.userLastName}}
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
      user: []

    }

  },
  methods: {
    getOneUsers(){
      UserService.getUsersId("2").then((response) => {
        this.user = response.data;
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
  position: fixed;
  left: 0;
  height: 4rem;
  z-index: 1;
  width: 100%;
}

.gallery__img {
  width: 20%;
  height: 20%;
  object-fit: cover;
}


img {
  size: 12px;
}


</style>