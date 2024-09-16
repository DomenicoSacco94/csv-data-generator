<template>
  <div>
    <h1>Templates</h1>
    <table v-if="templates.length">
      <thead>
        <tr>
          <th>Name</th>
          <th>Description</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="template in templates" :key="template.id">
          <td>{{ template.name }}</td>
          <td>{{ template.description }}</td>
        </tr>
      </tbody>
    </table>
    <p v-else>No templates available.</p>
  </div>
</template>

<script lang="ts">
import axios from 'axios';

export default {
  name: 'TemplateTable',
  data() {
    return {
      templates: []
    };
  },
  created() {
    this.fetchTemplates();
  },
  methods: {
    async fetchTemplates() {
      try {
        const response = await axios.get('http://localhost:8081/templates');
        this.templates = response.data;
      } catch (error) {
        console.error('Error fetching templates', error);
      }
    }
  }
};
</script>

<style scoped>
table {
  width: 100%;
  border-collapse: collapse;
}

th, td {
  border: 1px solid #ddd;
  padding: 8px;
}

th {
  background-color: #f4f4f4;
}
</style>