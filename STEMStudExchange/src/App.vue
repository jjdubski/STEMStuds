<script setup>
// This starter template is using Vue 3 <script setup> SFCs
// Check out https://vuejs.org/api/sfc-script-setup.html#script-setup
import HomeView from './components/HomeView.vue';
</script>

<template>
  <div>
    <a href="" target="_blank">
      <img src="./assets/candy.png" class="logo" alt="Vite logo" />
    </a>
    <HomeView msg="The Candy Exchange" />
  </div>
</template>

<style scoped>
.logo {
  height: 6em;
  padding: 1.5em;
  will-change: filter;
}
.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}
.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
}
</style>
