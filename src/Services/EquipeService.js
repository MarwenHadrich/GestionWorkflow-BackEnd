// EmployeeService.js
import axios from "axios";

const API_URL = "http://localhost:9011/workflow-core/api/equipes";

const getEquipes = async () => {
    try {
        const response = await axios.get(API_URL);
        return response.data;
    } catch (error) {
        throw error;
    }
};
// Method to delete an employee by ID
// const deleteEmployee= async (employeeId) => {
//     try {
//         await axios.delete(`${API_URL}/${employeeId}`);
//     } catch (error) {
//         throw error;
//     }
// };
// // Method to add an employee
// const addEmployee = async (formData) => {
//     try {
//         const response = await axios.post(API_URL, formData);
//         return response.data; // Assuming the backend returns the newly added employee data
//     } catch (error) {
//         // Handle the error
//         console.error("Error adding employee:", error);
//         throw new Error("An error occurred while adding the employee. Please try again.");
//     }
// };
// const updateEmployee = async (employeeId, formData) => {
//     try {
//         const response = await axios.put(`${API_URL}/${employeeId}`, formData);
//         return response.data; // Assuming the backend returns the updated employee data
//     } catch (error) {
//         console.error("Error updating employee:", error);
//         throw new Error("An error occurred while updating the employee. Please try again.");
//     }
// };
const getEquipeById = async (equipeId) => {
    try {
        const response = await axios.get(`${API_URL}/${equipeId}`);
        return response.data;
    } catch (error) {
        throw error;
    }
};

const EquipeService = {
    getEquipes,
    // deleteEmployee,
    // addEmployee,
    // updateEmployee,
    getEquipeById,

};

export default EquipeService;
