<template>
  <div id="app">
    <Header />
    <ProfileHeader />
    <Gallery />
  </div>
</template>

<script>
import Header from "./components/Header";
import ProfileHeader from "./components/ProfileHeader";
import Gallery from "./components/Gallery";
export default {
  name: 'App',
  components: {
    Header,
    ProfileHeader,
    Gallery
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
