import { createRouter, createWebHashHistory } from "vue-router";

const Pay = () => import("../page/Pay.vue");
const Home = () => import("../page/Home.vue");
const Login = () => import("../page/Login.vue");

const routes = [
  {
    path: "/",
    name: "home",
    component: Login,
  },
  {
    path: "/pay",
    name: "pay",
    component: Pay,
  },
  {
    path: "/login",
    name: "login",
    component: Home
  }
];

const router = createRouter({
  history: createWebHashHistory(),
  routes,
});

export default router;
