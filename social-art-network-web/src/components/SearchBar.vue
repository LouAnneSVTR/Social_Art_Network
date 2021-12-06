<template>
  <div id="sb">
    <div class="search-bar">
      <input type="text" v-model="search" placeholder="Search user.."/>
    </div>
  </div>
</template>

<script>

import UserService from "../services/UserService";

export default {

  name: 'Users',
  data() {
    return {
      postList: [],
      users: []

    }
  },
  methods: {
    getUsers(){
      UserService.getUsers().then((response) => {
        this.postList = response.data;
      });
    },
    filteredList() {
      return this.postList.filter(post => {
        return post.userFirstName.toLowerCase().includes(this.search.toLowerCase())
      })
    }
  },
  created() {
    this.getUsers()
    this. filteredList()
  }
}


</script>

<style >
  html, body {
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
    margin-top: 16px;
    margin-bottom: 16px;
  }

  div#sb {
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;

    .search-bar {
      position: relative;
      border-radius: 30px;

      label {
        position: absolute;
        font-size: 12px;
        color: rgba(0, 0, 0, .50);
        top: 8px;
        left: 12px;
        z-index: -1;
        transition: .15s all ease-in-out;
      }

      input {
        padding: 4px 12px;
        color: rgba(0, 0, 0, .70);
        border: 1px solid rgba(0, 0, 0, .12);
        transition: .15s all ease-in-out;
        background: white;

        :focus {
          outline: none;
          transform: scale(1.05);

           + label {
            font-size: 10px;
            transform: translateY(-24px) translateX(-12px);
          }

        }
        ::-webkit-input-placeholder {
          font-size: 12px;
          color: rgba(0, 0, 0, .50);
          font-weight: 300;
        }

      }
    }
  }

  .wrapper {
    display: flex;
    max-width: 444px;
    flex-wrap: wrap;
    padding-top: 12px;
  }

  .card {
    box-shadow: rgba(0, 0, 0, 0.117647) 0px 1px 6px, rgba(0, 0, 0, 0.117647) 0px 1px 4px;
    max-width: 124px;
    margin: 12px;
    transition: .15s all ease-in-out;
    :hover {
       transform: scale(1.1);
     }
    a {
      text-decoration: none;
      padding: 12px;
      color: #03A9F4;
      font-size: 24px;
      display: flex;
      flex-direction: column;
      align-items: center;
    img {
      height: 100px;
    }
      small {
        font-size: 10px;
        padding: 4px;
      }
    }
  }

  .hotpink {
    background: hotpink;
  }

  .green {
    background: green;
  }

  .box {
    width: 100px;
    height: 100px;
    border: 1px solid rgba(0,0,0,.12);
  }


</style>