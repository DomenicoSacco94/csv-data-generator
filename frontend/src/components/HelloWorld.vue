<template>
  <div>
    Am I actually reading from backend? Let's see
    <h1>{{ message }}</h1>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      message: ''
    };
  },
  created() {
    this.fetchMessage();
  },
  methods: {
    async fetchMessage() {
      try {
        const response = await axios.get('http://localhost:8081/hello');
        this.message = response.data;
      } catch (error) {
        console.error('There was an error fetching the message!', error);
      }
    }
  }
}
</script>

<style scoped>
/* Add your styles here */
</style>