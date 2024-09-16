// frontend/src/services/Templateservice.ts
import axios from 'axios';
import { Template } from '@/models/Template';

export class TemplateService {
    private apiUrl = 'http://localhost:8081/templates'; // Base URL for the templates API

    // Fetch all templates
    public async getAll(): Promise<Template[]> {
        try {
            const response = await axios.get<Template[]>(this.apiUrl);
            return response.data;
        } catch (error) {
            console.error('Error fetching templates', error);
            throw error;
        }
    }
}