<template>

  <div id="homepage">
    <ButtonUpload />
    <Gallery />
  </div>
</template>

<script>
import Gallery from "@/components/Gallery";
import ButtonUpload from "@/components/ButtonUpload"
export default {
  name: "HomePage",
  components: {
    ButtonUpload,
    Gallery
  }
}
</script>

<style>


</style>