<template>
  <div class="nav">

    <img img alt="Art logo" src="../assets/icon_paintbrush.png" />
    <span style="font-family: Georgia, serif ">
    <a href="#">Social Art Network, Welcome ! </a>
    <a href="#">Home</a>
      <SearchBar/>
    <a href="#">SearchBar</a>
    <a href="#">Profile</a>
    <a href="#">Logout</a>
    </span>
  </div>
</template>

<script>
export default {
  name: "Header"
}
</script>

<style scoped>
.nav {
  background-color: #a2fa9f;
  border-radius: 30px;
  position: fixed;
  top: 0;
  padding: 10px;

  overflow:hidden;
}
.nav a {
  float: left;
  color: #6ee16e;
  border-radius: 30px;
  padding: 14px 16px;
  text-align: center;
  front-size: 30px;
  text-decoration: none;
  margin-right: 5px;
}

.nav a:hover{
  background: #ffffff;
  border-radius: 30px;

  color:#2c3e50;
}
img {
  size: 12px;
}


</style>