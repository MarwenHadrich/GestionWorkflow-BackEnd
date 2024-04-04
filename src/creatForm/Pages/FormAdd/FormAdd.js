import "./FormAdd.css";
import {Form} from "../../Sections";
import {Card, CardHeader, Container, Row} from "reactstrap";
import ListHeader from "../../../components/Headers/ListHeader";
import {TRUE} from "sass";



const FormAdd = () => {


    return (
        <>
            <ListHeader title={"Welcome"} text={"This is the form creation page. You can create a form faster using it"} stat={TRUE} text2={"Liste des formulaires"} path={"/admin/form"}/>
            {/* Page content */}
            <Container className="mt--7" fluid>



                <Card className="shadow">
                    <CardHeader className="border-0">
                        <Row className="align-items-center">
                            <div className="col">
                                <h3 className="mb-0">Creation formulaire</h3>
                            </div>
                        </Row>
                    </CardHeader>


                                <Form/>


                </Card>
            </Container>


        </>

    );
};

export default FormAdd;
