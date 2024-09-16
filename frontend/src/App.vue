<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <Templates/>
</template>

<script>
import Templates from './components/TemplateTable.vue'

export default {
  name: 'App',
  components: {
    Templates
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
  margin-top: 60px;
}
</style>
