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
import { ref, onMounted } from 'vue';
import { TemplateService } from '@/services/TemplateService';
import { Template } from "@/models/Template";

export default {
  name: 'TemplateTable',
  setup() {
    const templates = ref<Template[]>([]);

    const fetchTemplates = async () => {
      const templateService = new TemplateService();
      try {
        templates.value = await templateService.getAll();
      } catch (error) {
        console.error('Error fetching templates', error);
      }
    };

    onMounted(() => {
      fetchTemplates();
    });

    return {
      templates
    };
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
