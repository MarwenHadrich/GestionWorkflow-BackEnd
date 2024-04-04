
import Index from "views/Index.js";
import Profile from "views/examples/Profile.js";
import Maps from "views/examples/Maps.js";
import Register from "views/examples/Register.js";
import Login from "views/examples/Login.js";
import Tables from "views/examples/Tables.js";
import Icons from "views/examples/Icons.js";
import FormAdd from "./creatForm/Pages/FormAdd/FormAdd";
import ListDemande from "./views/examples/ListDemande";
import ListEmploye from "./views/examples/ListEmploye";
import AddEmploye from "./views/examples/AddEmploye/AddEmploye";
import MyDemand from "./views/examples/MyDemands";
import DemandType from "./views/examples/DemandType/DemandType";
import ListWorkflow from "./views/examples/ListWorkflow";
import UpdateEmploye from "./views/examples/UpdateEmploye/UpdateEmploye";
import ListEquipe from "./views/examples/ListEquipe";


var routes = [
  {
    path: "/index",
    name: "Home",
    icon: "ni ni-tv-2 text-primary",
    component: <Index />,
    layout: "/admin",
  },
  {
    path: "/icons",
    name: "Icons",
    icon: "ni ni-planet text-blue",
    component: <Icons />,
    layout: "/admin",
  },
  {
    path: "/mydem",
    name: "My demands",
    icon: "ni ni-books text-orange",
    component: <MyDemand />,
    layout: "/admin",
  },
  {
    path: "/user-profile",
    name: "User Profile",
    icon: "ni ni-single-02 text-yellow",
    component: <Profile />,
    layout: "/admin",
  },
  {
    path: "/tables",
    name: "Tables",
    icon: "ni ni-bullet-list-67 text-red",
    component: <Tables />,
    layout: "/admin",
  },
  {
    path: "/login",
    name: "Login",
    icon: "ni ni-key-25 text-info",
    component: <Login />,
    layout: "/auth",
  },
  {
    path: "/register",
    name: "Register",
    icon: "ni ni-circle-08 text-pink",
    component: <Register />,
    layout: "/auth",
  },

  {
    path: "/form",

    component: <Maps />,
    layout: "/admin",
  },
  {
    path: "/form/formadd",

    component: <FormAdd />,
    layout: "/admin",
  },
  {
    path: "/demandes",

    component: <ListDemande />,
    layout: "/admin",
  },
  {
    path: "/emp",

    component: <ListEmploye />,
    layout: "/admin",
  },
  {
    path: "/emp/empadd",

    component: <AddEmploye />,
    layout: "/admin",
  },
  {
    path: "/mydem/demtype",

    component: <DemandType />,
    layout: "/admin",
  },
  {
    path: "/demtype",

    component: <DemandType />,
    layout: "/admin",
  },
  {
    path: "/workflow",

    component: <ListWorkflow />,
    layout: "/admin",
  },
  {
    path: "/listequipe",

    component: <ListEquipe />,
    layout: "/admin",
  },
  {
    path: "/emp/updateEmp/:id",

    component: <UpdateEmploye />,
    layout: "/admin",
  },

];
export default routes;
