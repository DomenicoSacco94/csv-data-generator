<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <TemplateTable/>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import TemplateTable from "@/components/TemplateTable.vue";

export default defineComponent({
  name: 'App',
  components: {
    TemplateTable
  }
});
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
