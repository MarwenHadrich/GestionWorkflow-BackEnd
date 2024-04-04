import React, {useEffect, useState} from "react";
import Chart from "chart.js";
import "./AddEmploye.css";
import { Card, CardHeader, Container, Row } from "reactstrap";
import ListHeader from "../../../components/Headers/ListHeader";
import EmployeeService from "../../../Services/EmployeService";
import { chartOptions, parseOptions } from "variables/charts.js";
import { TRUE } from "sass";
import {useNavigate} from "react-router-dom";
import TypeEmployeService from "../../../Services/TypeEmployeService";


const AddEmploye = () => {
    const navigate = useNavigate();
    const [employeeTypes, setEmployeeTypes] = useState([]); // State to store employee types

    useEffect(() => {
        // Fetch employee types when component mounts
        fetchEmployeeTypes();
    }, []);

    const fetchEmployeeTypes = async () => {
        try {
            const types = await TypeEmployeService.getEmployeeTypes(); // Fetch employee types
            setEmployeeTypes(types); // Update employee types state
        } catch (error) {
            console.error("Error fetching employee types:", error);
            // Handle error here
        }
    };
    if (window.Chart) {
        parseOptions(Chart, chartOptions());
    }

    const handleSubmit = async (event) => {
        event.preventDefault(); // Prevent default form submission
        const formData = new FormData(event.target);

        try {
            await EmployeeService.addEmployee({
                idEmploye: null,
                nomEmploye: formData.get("inputNom"),
                prenomEmploye: formData.get("inputpre"),
                emailEmploye: formData.get("inputEmail4"),
                dateNaissance: formData.get("inputdate"),
                adresse: formData.get("inputAddress"),
                tel: formData.get("inputtel"),
                login: formData.get("inputlogin"),
                mdp: formData.get("inputPassword4"),
                idTypeEmploye: formData.get("inputType"),
                typeEmploye: "string"
            });
            navigate("/admin/emp");
        } catch (error) {
            console.error("Error adding employee:", error);
            // Handle error here
        }
    };

    return (
        <>
            <ListHeader
                title={"Welcome"}
                text={"This is the employees add page. You can add an employees here "}
                stat={TRUE}
                text2={"Cancel"}
                path={"/admin/emp"}
            />
            <Container className="mt--7" fluid>
                <Card className="shadow">
                    <CardHeader className="border-0">
                        <Row className="align-items-center">
                            <div className="col">
                                <h3 className="mb-0">Ajouter Employé</h3>
                            </div>
                        </Row>
                    </CardHeader>
                    <form className={"addEmp"} onSubmit={handleSubmit}>
                        <div className="form-row">
                            <div className="form-group col-md-3">
                                <label htmlFor="inputNom">Nom</label>
                                <input type="text" className="form-control" name="inputNom" placeholder="nom"/>
                            </div>
                            <div className="form-group col-md-3">
                                <label htmlFor="inputpre">Prénom</label>
                                <input type="text" className="form-control" name="inputpre" placeholder="prénom"/>
                            </div>
                            <div className="form-group col-md-6">
                                <label htmlFor="inputEmail4">Email</label>
                                <input type="text" className="form-control" name="inputEmail4" placeholder="Email"/>
                            </div>
                            <div className="form-group col-md-2">
                                <label htmlFor="inputdate">Date de naissance</label>
                                <input type="date" className="form-control" name="inputdate"
                                       placeholder="date de naissance"/>
                            </div>
                            <div className="form-group col-md-3">
                                <label htmlFor="inputlogin">Login</label>
                                <input type="text" className="form-control" name="inputlogin" placeholder="Login"/>
                            </div>
                            <div className="form-group col-md-3">
                                <label htmlFor="inputPassword4">Password</label>
                                <input type="text" className="form-control" name="inputPassword4"
                                       placeholder="Password"/>
                            </div>
                            <div className="form-group col-md-4">
                                <div className="form-group">
                                    <label htmlFor="inputType">Type Employé</label>
                                    <select className="form-control" name="inputType">
                                        {employeeTypes.map((type) => (
                                            <option key={type.idTypeEmploye} value={type.idTypeEmploye}>{type.typeemploye}</option>
                                        ))}
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div className="form-group">
                            <label htmlFor="inputAddress">Address</label>
                            <input type="text" className="form-control" name="inputAddress" placeholder="1234 Main St"/>
                        </div>
                        <div className="form-row">
                            <div className="form-group col-md-2">
                                <label htmlFor="inputtel">Telephone</label>
                                <input type="tel" className="form-control" name="inputtel"/>
                            </div>
                        </div>
                        <button type="submit" className="btn btn-primary">Ajouter</button>
                    </form>
                </Card>
            </Container>
        </>
    );
};

export default AddEmploye;
