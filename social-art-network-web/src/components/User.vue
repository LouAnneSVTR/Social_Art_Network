<template>
  <div class = "container">
    <h1 class = "text-center">Users List</h1>
    <table class = "table table-striped">
      <thead>
        <th> User Id        </th>
        <th> User firstname </th>
        <th> User lastname  </th>
        <th> User email     </th>
      </thead>
      <tbody>
        <tr v-for = "user in users" v-bind:key = "user.id">
          <td> {{user.id}} </td>
          <td> {{user.userLastName}} </td>
          <td> {{user.userLastName}} </td>
          <td> {{user.email}} </td>
          
        </tr>
      </tbody>

    </table>
  </div>
</template>

<script>
import UserService from "../services/UserService";
  export default {
    name: 'Users',
    data(){
      return {
        users: []
      }

    },
    methods: {
      getUsers(){
        UserService.getUsers().then((response) => {
          this.users = response.data;
        });
      }
    },
    created() {
      this.getUsers()
    }
  }
</script>

<style>

</style>