<template>
  <div class="app__body">
    <div class="row">
      <div class="col-3">
      </div>
      <div class="col-6" style="min-height:800px">
        <posts id="post"/>
      </div>

    </div>
  </div>
</template>

<script>
import Posts from "../components/Posts";
import UserService from "../services/UserService";

export default {
  name: "HomePage",
  components: {Posts},
  data() {
    return {
      user : []
    }
  },
  methods: {
    getOneUser(){
      UserService.getUsersId("2").then((response) => {
        this.user = response.data;
      });
    }
  },
  created() {
    this.getUsers()
  }
}
</script>

<style scoped>
.app__body {
  background-color: #f1f2f5;
}
#sidebar{
  position: absolute;
}
#post{
  position: relative;
}

</style>