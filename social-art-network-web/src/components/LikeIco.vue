<template>
  <button type="button" id="like-button">
    <svg class="heart-icon" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 100 100"><path d="M91.6 13A28.7 28.7 0 0 0 51 13l-1 1-1-1A28.7 28.7 0 0 0 8.4 53.8l1 1L50 95.3l40.5-40.6 1-1a28.6 28.6 0 0 0 0-40.6z"/></svg>
  </button>
</template>

<script>
document.addEventListener('DOMContentLoaded', function() {
  var likeButton = document.getElementById('like-button');
  likeButton.addEventListener('click', function() {
    window.lb = likeButton;
    likeButton.classList.toggle('selected');
  });
}, false);

</script>

<style scoped>

white: #FFF;
gray: #888;
red: indianred;

#like-button {
  color: gray;
  font-size: 1.5em;
  font-family: 'Heebo', sans-serif;
  background-color: transparent;
  border: 0.1em solid;
  border-radius: 1em;
  padding: 0.333em 1em 0.25em;
  line-height: 1.2em;
  box-shadow: 0 0.25em 1em -0.25em;
  cursor: pointer;
  transition: color 150ms ease-in-out, background-color 150ms ease-in-out, transform 150ms ease-in-out;
  outline: 0;
  margin: 5em 0;

:hover {
   color: red;
 }

:active {
   transform: scale(0.95);
 }



.heart-icon {
  display: inline-block;
  fill: currentColor;
  width: 0.8em;
  height: 0.8em;
  margin-right: 0.2em;
}
}

body {
  text-align: center;
}
</style>