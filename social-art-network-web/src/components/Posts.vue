<template>
  <div id="post">
    <div class="messageSender">
      <div class="messageSender__top">
        <form>
          <input
              class="messageSender__input"
              placeholder="what's on your mind"
              v-model="content"
              @click="add = true"
          />
          <input placeholder="image URL (Optional)" />
          <button type="submit" @click="addpost($event)">hidden submit</button>
        </form>
      </div>
    </div>

    <div class="post" v-for="post in posts" :key="post.id">
      <div v-if="post.user" class="post__top">
        <div class="post__avatar">
        </div>
      </div>
    </div>
  </div>
</template>


<script>
import axios from "axios";
import { USER_API_BASE_URL } from "../services/UserService";
import $ from "jquery";
export default {
  name: "Posts",
  data() {
    return {
      add: false,
      posts: [],
      content: "",
      users: [],
      selected: null,
      user: null,
    };
  },
  mounted() {
    this.getPosts();
    this.clone.item = $("#post").clone();
  },
  methods: {
    getPosts() {
      axios
          .get(USER_API_BASE_URL)
          .then((resp) => {
            this.posts = resp.data;
          })
          .catch((err) => {
            console.log(err);
            if (err.response.status == 401) {
              this.$router.push("/login");
            }
          });
    },
  }
}
</script>

<style scoped>
.messageSender {
  display: flex;
  margin-top: 30px;
  flex-direction: column;
  background-color: white;
  border-radius: 15px;
  box-shadow: 0px 5px 7px -7px rgba(0, 0, 0, 0.75);
  width: 100%;
}

.button {
  font-size: 1em;
  padding: 10px;
  color: #fff;
  border: 2px solid #06d85f;
  border-radius: 20px/50px;
  text-decoration: none;
  cursor: pointer;
  transition: all 0.3s ease-out;
}
.button:hover {
  background: #06d85f;
}

</style>