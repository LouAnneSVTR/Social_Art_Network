<template>
  <div class="profile">

    <!--img img alt="Art logo" src="../assets/icon_paintbrush.png" class="logo__img" /-->
    <span style="font-family: Georgia, serif ">
    <a href="#"></a>
    <a href="#"></a>
    <a href="#"></a>
    <a href="#"></a>
    <a href="#"></a>

    </span></div>

</template>


<script>
  import UserService from "../services/UserService";

  export default {
  name: 'Users',
  props: {
  userId: Number,
},
  components: {

},

  data(){
  return {
  users: []

}

},
  methods: {
  getUsers(){
  UserService.getUsersId().then((response) => {
  this.users = response.data;
});
}
},
  created() {
  this.getUsers()
}
}
</script>

<style scoped>

</style>