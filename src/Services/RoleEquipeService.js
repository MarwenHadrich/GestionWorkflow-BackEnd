import axios from 'axios';

const RoleEquipeService = {
    // Function to fetch employee types from the backend
    getRoleEquipes: async () => {
        try {
            const response = await axios.get('http://localhost:9011/workflow-core/api/typeemployes');
            return response.data; // Assuming the response data is an array of employee types
        } catch (error) {
            throw new Error('Error fetching employee types: ' + error.message);
        }
    }
};

export default RoleEquipeService;