import React, { useState, useEffect } from "react";
import Chart from "chart.js";
import {Button, Card, CardHeader, Table, Container, Row, ModalFooter, ModalBody, Modal} from "reactstrap";
// import { Link } from "react-router-dom";
import ListHeader from "../../components/Headers/ListHeader";
import { chartOptions, parseOptions } from "variables/charts.js";
import EquipeService from "../../Services/EquipeService";

const ListEquipe = () => {
    const [equipes, setEquipes] = useState([]);
    // const [deleteEmployeeId, setDeleteEmployeeId] = useState(null); // State to store employee ID to be deleted
    // const [showConfirmationModal, setShowConfirmationModal] = useState(false); // State to control the visibility of the confirmation modal
    //const [selectedEmployee, setSelectedEmployee] = useState(null); // State to store the selected employee for details

    useEffect(() => {
        if (window.Chart) {
            parseOptions(Chart, chartOptions());
        }
        fetchEquipes().then((response) =>{

        } ); // Fetching employees on component mount
    }, []);
    // Function to fetch employees from the backend
    const fetchEquipes = async () => {
        try {
            const data = await EquipeService.getEquipes();
            setEquipes(data);
        } catch (error) {
            console.error("Error fetching employees:", error);
        }
    };

    // Function to delete an employee
    // const deleteEmployee = async (id) => {
    //     try {
    //         await EmployeeService.deleteEmployee(id);
    //         // After successful deletion, fetch updated list of employees
    //         fetchEmployees().then(r => {});
    //     } catch (error) {
    //         console.error("Error deleting employee:", error);
    //     }
    // };
    // const toggleConfirmationModal = () => {
    //     setShowConfirmationModal(!showConfirmationModal);
    // };

    // const handleDeleteConfirmation = (id) => {
    //     setDeleteEmployeeId(id);
    //     toggleConfirmationModal();
    // };

    // const confirmDeleteEmployee = () => {
    //     deleteEmployee(deleteEmployeeId).then(r => {});
    //     toggleConfirmationModal();
    // };
    // const showEquipeDetails = (employee) => {
    //     setSelectedEquipe(equipe);
    // };
    // const formatDate = (timestamp) => {
    //     const date = new Date(timestamp);
    //     return `${date.getDate().toString().padStart(2, '0')}-${(date.getMonth() + 1).toString().padStart(2, '0')}-${date.getFullYear()}`;
    // };

    return (
        <>
            <ListHeader
                title={"Welcome"}
                text={
                    "This is the equipes list page. You can view all the equipe that has been created and update or delete them"
                }
            />
            {/* Page content */}
            <Container className="mt--7" fluid>
                <Card className="shadow">
                    <CardHeader className="border-0">
                        <Row className="align-items-center">
                            <div className="col">
                                <h3 className="mb-0">Liste des equipes</h3>
                            </div>
                            {/*<div className="col text-right">*/}
                            {/*    <Button color="primary" to="/admin/emp/empadd" tag={Link} size="sm">*/}
                            {/*        Ajouter employé*/}
                            {/*    </Button>*/}
                            {/*</div>*/}
                        </Row>
                    </CardHeader>
                    <Table className="align-items-center table-flush table-bordered" responsive>
                        <thead className="thead-light ">
                        <tr>
                            <th scope="col">Nom d'equipe</th>
                            {/*<th scope="col">Prénom employé</th>*/}
                            {/*<th scope="col">Email</th>*/}
                            {/*<th scope="col">Date de naissance</th>*/}
                            {/*<th scope="col">Adresse</th>*/}
                            {/*<th scope="col">Telephone</th>*/}
                            {/*<th scope="col">Login</th>*/}
                            {/*<th scope="col">MDP</th>*/}
                            {/*<th scope="col">Type employé</th>*/}
                            <th scope="col">
                                <center>Actions</center>
                            </th>
                        </tr>
                        </thead>
                        <tbody>
                        {equipes.map((equipe) => (
                            <tr key={equipe.idEquipe}>
                                <td>{equipe.nomEquipe}</td>

                                <td>
                                    <center>
                                        {/*<button type="button" className="btn btn-outline-danger" onClick={() => handleDeleteConfirmation(employee.idEmploye)}>*/}
                                        {/*    Delete*/}
                                        {/*</button>*/}

                                        {/*<Link to={`/admin/emp/updateEmp/${employee.idEmploye}`} className="btn btn-outline-warning">*/}
                                        {/*    Modifier*/}
                                        {/*</Link>*/}

                                        <button type="button" className="btn btn-outline-info" onClick={() => showEmployeeDetails(equipe)}>
                                            Info
                                        </button>
                                    </center>
                                </td>
                            </tr>
                        ))}
                        </tbody>
                    </Table>
                </Card>
            </Container>
            {/* Confirmation Modal */}
            {/*<Modal isOpen={showConfirmationModal} toggle={toggleConfirmationModal}>*/}
            {/*    <div className="modal-header">*/}
            {/*        <h5 className="modal-title" id="exampleModalCenterTitle">*/}
            {/*            Confirm Delete*/}
            {/*        </h5>*/}
            {/*        <button type="button" className="close" data-dismiss="modal" aria-label="Close" onClick={toggleConfirmationModal}>*/}
            {/*            <span aria-hidden="true">&times;</span>*/}
            {/*        </button>*/}
            {/*    </div>*/}
            {/*    <ModalBody>*/}
            {/*        Are you sure you want to delete this employee?*/}
            {/*    </ModalBody>*/}
            {/*    <ModalFooter>*/}
            {/*        <Button color="secondary" onClick={toggleConfirmationModal}>*/}
            {/*            Cancel*/}
            {/*        </Button>*/}
            {/*        <Button color="danger" onClick={confirmDeleteEmployee}>*/}
            {/*            Delete*/}
            {/*        </Button>*/}
            {/*    </ModalFooter>*/}
            {/*</Modal>*/}
            {/* Employee Details Modal */}
            {/*<Modal isOpen={selectedEmployee !== null} toggle={() => setSelectedEmployee(null)}>*/}
            {/*    <div className="modal-header">*/}
            {/*        <h5 className="modal-title">Employee Details</h5>*/}
            {/*        <button type="button" className="close" onClick={() => setSelectedEmployee(null)}>*/}
            {/*            <span>&times;</span>*/}
            {/*        </button>*/}
            {/*    </div>*/}
            {/*    <ModalBody>*/}
            {/*        {selectedEmployee && (*/}
            {/*            <>*/}
            {/*                <p><strong>Id employé:</strong> {selectedEmployee.idEmploye}</p>*/}
            {/*                <p><strong>Nom employé:</strong> {selectedEmployee.nomEmploye}</p>*/}
            {/*                <p><strong>Prénom employé:</strong> {selectedEmployee.prenomEmploye}</p>*/}
            {/*                <p><strong>Email:</strong> {selectedEmployee.emailEmploye}</p>*/}
            {/*                <p><strong>Date de naissance:</strong> {formatDate(selectedEmployee.dateNaissance)}</p>*/}
            {/*                <p><strong>Adresse:</strong> {selectedEmployee.adresse}</p>*/}
            {/*                <p><strong>Téléphone:</strong> {selectedEmployee.tel}</p>*/}
            {/*                <p><strong>Login:</strong> {selectedEmployee.login}</p>*/}
            {/*                <p><strong>MDP:</strong> {selectedEmployee.mdp}</p>*/}
            {/*                <p><strong>Type employé:</strong> {selectedEmployee.typeEmploye}</p>*/}
            {/*            </>*/}
            {/*        )}*/}
            {/*    </ModalBody>*/}
            {/*</Modal>*/}
        </>
    );
};

export default ListEquipe;