<template>
  <div id="example-1">
    <button v-on:click="uploadImage('fdé')">Upload</button>
  </div>
</template>

<script>

import axios from "axios";

export default {
  el: '#example-1',
  methods: {
    uploadImage: function (imageURL2) {
      const image = {id: 1, imageURL: imageURL2, title: "test", userId: "2"}
      axios.post("http://localhost:8081/api/postimages", image)
      alert(imageURL2)
    }
  }
})
}
</script>

<style scoped>

</style>