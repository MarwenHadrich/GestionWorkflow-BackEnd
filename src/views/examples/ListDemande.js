

import Chart from "chart.js";
// reactstrap components
import {
    Card,
    CardHeader,
    Table,
    Container,
    Row,

} from "reactstrap";

// core components
import {
    chartOptions,
    parseOptions,
} from "variables/charts.js";

import ListHeader from "../../components/Headers/ListHeader";
import {Link} from "react-router-dom";
import React, {useEffect, useState} from "react";
import EmployeeService from "../../Services/EmployeService";
import DemandeService from "../../Services/DemandeService";



const ListDemande = () => {
    const [demandes, setDemandes] = useState([]);

    useEffect(() => {
        if (window.Chart) {
            parseOptions(Chart, chartOptions());
        }
        fetchDemandes().then((response) =>{

        } ); // Fetching employees on component mount
    }, []);
    // Function to fetch employees from the backend
    const fetchDemandes= async () => {
        try {
            const data = await DemandeService.getDemandes();
            setDemandes(data);
        } catch (error) {
            console.error("Error fetching demandes:", error);
        }
    };


    const formatDate = (timestamp) => {
        const date = new Date(timestamp);
        return `${date.getDate().toString().padStart(2, '0')}-${(date.getMonth() + 1).toString().padStart(2, '0')}-${date.getFullYear()}`;
    };
    return (
        <>
            <ListHeader title={"Welcome"} text={"This is the demandes list page. You can view all the demandes that has been created and update or delete them"}/>
            {/* Page content */}
            <Container className="mt--7" fluid>



                <Card className="shadow">
                    <CardHeader className="border-0">
                        <Row className="align-items-center">
                            <div className="col">
                                <h3 className="mb-0">Liste des demandes</h3>
                            </div>

                        </Row>
                    </CardHeader>
                    <Table className="align-items-center table-flush" responsive>
                        <thead className="thead-light">
                        <tr>
                            <th scope="col">id Demande</th>
                            <th scope="col">Date de creation</th>
                            <th scope="col">Nom Employées</th>
                            <th scope="col">Nom interface</th>
                        </tr>
                        </thead>
                        <tbody>
                        {demandes.map((demande) => (
                            <tr key={demande.idDemande}>
                                <td>{demande.idDemande}</td>
                                <td>{formatDate(demande.dateCreationDemande)}</td>
                                <td>{demande.nomEmplye}</td>
                                <td>{demande.nomInterface}</td>


                                {/*<td>{employee.adresse}</td>*/}
                                {/*<td>{employee.tel}</td>*/}
                                {/*<td>{employee.login}</td>*/}
                                {/*<td>{employee.mdp}</td>*/}
                                {/*<td>{employee.typeEmploye}</td>*/}
                                {/*<td>*/}
                                {/*    <center>*/}
                                {/*        <button type="button" className="btn btn-outline-danger"*/}
                                {/*                onClick={() => handleDeleteConfirmation(employee.idEmploye)}>*/}
                                {/*            Delete*/}
                                {/*        </button>*/}

                                {/*        <Link to={`/admin/emp/updateEmp/${employee.idEmploye}`}*/}
                                {/*              className="btn btn-outline-warning">*/}
                                {/*            Modifier*/}
                                {/*        </Link>*/}

                                {/*        <button type="button" className="btn btn-outline-info"*/}
                                {/*                onClick={() => showEmployeeDetails(employee)}>*/}
                                {/*            Info*/}
                                {/*        </button>*/}
                                {/*    </center>*/}
                                {/*</td>*/}
                            </tr>
                        ))}
                        </tbody>
                    </Table>
                </Card>


            </Container>
        </>
    );
};

export default ListDemande;
