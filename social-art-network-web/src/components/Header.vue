<template>
  <div class="container-fluid">
  <div class="nav">

    <img img alt="Art logo" src="../assets/icon_paintbrush.png" class="logo__img" >
    <span style="font-family: Helvetica,sans-serif ">
    <a href="#">Social Art Network, Welcome ! </a>
    <a href="#">Home</a>
    <a href="#"><SearchBar /></a>
    <a href="#">Profile</a>
    <a href="#">Logout</a>
    </span>
  </div>
  </div>
</template>

<script>

import SearchBar from "./SearchBar";

export default {
  name: "Header",
  components: {
    SearchBar
  }
}
</script>

<style scoped>
.nav {
  background-color: #ffffff;
  border-radius: 30px;
  position: fixed;
  top: 0;
  left: 0;
  height: 4rem;
  z-index: 1;
  width: 100%;
}
.nav a {
  float: left;
  color: #6ee16e;
  border-radius: 30px;
  padding: 20px 65px;
  text-align: center;
  front-size: 30px;
  height: 4rem;
  text-decoration: none;
  margin-right: 5px;
}

.nav a:hover{
  background: #d9ffd8;
  border-radius: 30px;

  color:#2c3e50;
}

.logo__img {
  width: 20px;
  position: relative;
  align-items: center;
  height: 20px;
  border-radius: 300px;
  padding: 0.5rem 1rem 0.4rem;
  background: #ffffff;
  color: #333;
}
img {
  size: 12px;
}


</style>