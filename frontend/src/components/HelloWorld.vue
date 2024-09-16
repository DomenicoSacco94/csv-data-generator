<template>
  <div>
    Am I actually reading from backend? Let's see
    <h1>{{ message }}</h1>
  </div>
</template>

<script>
import { fetchMessage } from '@/services/apiService';

export default {
  data() {
    return {
      message: ''
    };
  },
  created() {
    this.loadMessage();
  },
  methods: {
    async loadMessage() {
      try {
        this.message = await fetchMessage();
      } catch (error) {
        console.error('There was an error loading the message!', error);
      }
    }
  }
}
</script>
