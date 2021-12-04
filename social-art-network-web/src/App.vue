<template>
  <div id="app">
    <Images />
  </div>r
</template>

<script>
import User from "./components/User";
import Images from "./components/Images";

export default {
  name: 'App',
  components: {
    Images
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#app {
  padding: 30px;
}

#app a {
  font-weight: bold;
  color: #2c3e50;
}

#app a.router-link-exact-active {
  color: #42b983;
}
</style>
