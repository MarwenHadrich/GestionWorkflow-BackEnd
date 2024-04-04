

import Chart from "chart.js";
import "./DemandType.css"
// reactstrap components
import {

    Card,
    
    Container,
    Row, CardTitle, CardBody, Col,

} from "reactstrap";

// core components
import {
    chartOptions,
    parseOptions,
} from "../../../variables/charts.js";

import {Link} from "react-router-dom";
import ListHeader from "../../../components/Headers/ListHeader";

const DemandType = () => {

    if (window.Chart) {
        parseOptions(Chart, chartOptions());
    }


    return (
        <>
            <ListHeader title={"Welcome"}
                        text={"This is the demands types page. You can view all the demands types that has been created and chose between them what you need"}/>
            {/* Page content */}
            <Container className="mt--7" fluid>


                <Container fluid>
                    <div className="header-body">
                        {/* Card stats */}
                        <Row>

                            <Col lg="6" xl="3">
                                <Link to={"/admin/index"}>
                                <Card className="card-stats mb-4 mb-xl-0 ticket" >
                                    <CardBody>
                                        <Row>
                                            <div className="col">
                                                <CardTitle
                                                    tag="h5"
                                                    className="text-uppercase text-muted mb-0"
                                                >
                                                    Type
                                                </CardTitle>
                                                <span className="h2 font-weight-bold mb-0">
                                                 Demande congé
                                                 </span>
                                            </div>
                                            <Col className="col-auto">
                                                <div
                                                    className="icon icon-shape bg-danger text-white rounded-circle shadow">
                                                    <i className="fas fa-chart-bar" />
                                                </div>
                                            </Col>
                                        </Row>
                                        {/*<p className="mt-3 mb-0 text-muted text-sm">*/}
                                        {/*      <span className="text-success mr-2">*/}
                                        {/*              <i className="fa fa-arrow-up"/> 3.48%*/}
                                        {/*       </span>{" "}*/}
                                        {/*    <span className="text-nowrap" >Since last month</span>*/}
                                        {/*</p>*/}
                                    </CardBody>
                                </Card>
                            </Link>
                            </Col>


                        </Row>
                    </div>
                </Container>

            </Container>



        </>
    );
};

export default DemandType;
