

import Chart from "chart.js";
// reactstrap components
import {
  Button,
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

import {Link} from "react-router-dom";
import ListHeader from "../../components/Headers/ListHeader";

const Maps = () => {

  if (window.Chart) {
    parseOptions(Chart, chartOptions());
  }


  return (
      <>
        <ListHeader title={"Welcome"} text={"This is the form list page. You can view all the form that has been created and update or delete them"}/>
        {/* Page content */}
        <Container className="mt--7" fluid>



              <Card className="shadow">
                <CardHeader className="border-0">
                  <Row className="align-items-center">
                    <div className="col">
                      <h3 className="mb-0">Liste des formulaires</h3>
                    </div>
                    <div className="col text-right">
                      <Button
                          color="primary"
                          to="/admin/form/formadd"
                          tag={Link}
                          size="sm"
                      >
                        Ajouter formulaire
                      </Button>
                    </div>
                  </Row>
                </CardHeader>
                <Table className="align-items-center table-flush" responsive>
                  <thead className="thead-light">
                  <tr>
                    <th scope="col">Nom formulaire</th>
                    <th scope="col">Nombre d'utilisation</th>
                    <th scope="col">Date de creation</th>
                    <th scope="col">Bounce rate</th>
                  </tr>
                  </thead>
                  <tbody>
                  <tr>
                    <th scope="row">/argon/</th>
                    <td>4,569</td>
                    <td>340</td>
                    <td>
                      <i className="fas fa-arrow-up text-success mr-3" /> 46,53%
                    </td>
                  </tr>
                  <tr>
                    <th scope="row">/argon/index.html</th>
                    <td>3,985</td>
                    <td>319</td>
                    <td>
                      <i className="fas fa-arrow-down text-warning mr-3" />{" "}
                      46,53%
                    </td>
                  </tr>
                  <tr>
                    <th scope="row">/argon/charts.html</th>
                    <td>3,513</td>
                    <td>294</td>
                    <td>
                      <i className="fas fa-arrow-down text-warning mr-3" />{" "}
                      36,49%
                    </td>
                  </tr>
                  <tr>
                    <th scope="row">/argon/tables.html</th>
                    <td>2,050</td>
                    <td>147</td>
                    <td>
                      <i className="fas fa-arrow-up text-success mr-3" /> 50,87%
                    </td>
                  </tr>
                  <tr>
                    <th scope="row">/argon/profile.html</th>
                    <td>1,795</td>
                    <td>190</td>
                    <td>
                      <i className="fas fa-arrow-down text-danger mr-3" />{" "}
                      46,53%
                    </td>
                  </tr>
                  </tbody>
                </Table>
              </Card>



        </Container>
      </>
  );
};

export default Maps;
