import axios from 'axios';

export const fetchMessage = async () => {
    const response = await axios.get('http://localhost:8081/hello');
    return response.data;
};