import React, {useEffect, useState} from "react";
import Chart from "chart.js";
import "./UpdateEmploye.css";
import { Card, CardHeader, Container, Row } from "reactstrap";
import ListHeader from "../../../components/Headers/ListHeader";
import EmployeeService from "../../../Services/EmployeService";
import { chartOptions, parseOptions } from "../../../variables/charts.js";
import { TRUE } from "sass";
import {useNavigate, useParams} from "react-router-dom";
import TypeEmployeService from "../../../Services/TypeEmployeService";


const UpdateEmploye = () => {
    const { id } = useParams();
    const navigate = useNavigate();
    const [existingEmployee, setExistingEmployee] = useState({
        nomEmploye: "",
        prenomEmploye: "",
        emailEmploye: "",
        dateNaissance: "",
        adresse: "",
        tel: "",
        login: "",
        mdp: "",
        idTypeEmploye: "",
        typeEmploye: ""
    });
    const [employeeTypes, setEmployeeTypes] = useState([]); // State to store employee types


    useEffect(() => {
        fetchEmployeeById().then(r => {});
        fetchEmployeeTypes().then(r => {});
        // eslint-disable-next-line
    }, [id]);


    const fetchEmployeeById = async () => {
        try {
            const employee = await EmployeeService.getEmployeeById(id);
            setExistingEmployee(employee);
        } catch (error) {
            console.error("Error fetching employee:", error);
        }
    };

    const fetchEmployeeTypes = async () => {
        try {
            const types = await TypeEmployeService.getEmployeeTypes();
            setEmployeeTypes(types);
        } catch (error) {
            console.error("Error fetching employee types:", error);
        }
    };

    if (window.Chart) {
        parseOptions(Chart, chartOptions());
    }

    const handleSubmit = async (event) => {
        event.preventDefault();
        const formData = new FormData(event.target);

        try {
            await EmployeeService.updateEmployee(id, { // Pass employeeId and updated data to updateEmployee
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
    const formatDate = (timestamp) => {
        const date = new Date(timestamp);
        return date.toLocaleDateString('en-CA');
    };
    const handleDateChange = (event) => {
        const { value } = event.target;
        setExistingEmployee((prevEmployee) => ({
            ...prevEmployee,
            dateNaissance: value,
        }));
    };

    return (
        <>
            <ListHeader
                title={"Welcome"}
                text={"This is the employees update page. You can update an employees here "}
                stat={TRUE}
                text2={"Cancel"}
                path={"/admin/emp"}
            />
            <Container className="mt--7" fluid>
                <Card className="shadow">
                    <CardHeader className="border-0">
                        <Row className="align-items-center">
                            <div className="col">
                                <h3 className="mb-0">Modifier Employé</h3>
                            </div>
                        </Row>
                    </CardHeader>
                    <form className={"updateEmp"} onSubmit={handleSubmit}>
                        <div className="form-row">
                            <div className="form-group col-md-3">
                                <label htmlFor="inputNom">Nom</label>
                                <input type="text" className="form-control" name="inputNom" placeholder="Nom"
                                       defaultValue={existingEmployee.nomEmploye}/>
                            </div>
                            <div className="form-group col-md-3">
                                <label htmlFor="inputpre">Prénom</label>
                                <input type="text" className="form-control" name="inputpre" placeholder="Prénom"
                                       defaultValue={existingEmployee.prenomEmploye}/>
                            </div>
                            <div className="form-group col-md-6">
                                <label htmlFor="inputEmail4">Email</label>
                                <input type="text" className="form-control" name="inputEmail4" placeholder="Email"
                                       defaultValue={existingEmployee.emailEmploye}/>
                            </div>
                            <div className="form-group col-md-2">
                                <label htmlFor="inputdate">Date de naissance</label>
                                <input type="date" className="form-control" name="inputdate"
                                       value={formatDate(existingEmployee.dateNaissance)} onChange={handleDateChange}/>
                            </div>

                            <div className="form-group col-md-3">
                                <label htmlFor="inputlogin">Login</label>
                                <input type="text" className="form-control" name="inputlogin" placeholder="Login"
                                       defaultValue={existingEmployee.login}/>
                            </div>
                            <div className="form-group col-md-3">
                                <label htmlFor="inputPassword4">Password</label>
                                <input type="text" className="form-control" name="inputPassword4" placeholder="Password"
                                       defaultValue={existingEmployee.mdp}/>
                            </div>
                            <div className="form-group col-md-4">
                                <div className="form-group">
                                    <label htmlFor="inputType">Type Employé</label>
                                    <select
                                        className="form-control"
                                        name="inputType"
                                        value={existingEmployee.idTypeEmploye}
                                        onChange={(e) =>
                                            setExistingEmployee((prevEmployee) => ({
                                                ...prevEmployee,
                                                idTypeEmploye: e.target.value
                                            }))
                                        }
                                    >
                                        {employeeTypes.map((type) => (
                                            <option key={type.idTypeEmploye} value={type.idTypeEmploye}>
                                                {type.typeemploye}
                                            </option>
                                        ))}
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div className="form-group">
                            <label htmlFor="inputAddress">Adresse</label>
                            <input type="text" className="form-control" name="inputAddress" placeholder="Adresse"
                                   defaultValue={existingEmployee.adresse}/>
                        </div>
                        <div className="form-row">
                            <div className="form-group col-md-2">
                                <label htmlFor="inputtel">Téléphone</label>
                                <input type="tel" className="form-control" name="inputtel"
                                       defaultValue={existingEmployee.tel}/>
                            </div>
                        </div>
                        <button type="submit" className="btn btn-primary">Modifier</button>
                    </form>

                </Card>
            </Container>
        </>
    );
};

export default UpdateEmploye;
