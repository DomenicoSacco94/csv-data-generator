import {Template} from "@/models/Template";
import axios from 'axios';

export class TemplateService {
    private apiUrl = 'http://localhost:8081/templates';

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