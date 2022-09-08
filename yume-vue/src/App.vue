<template>
  <div>
    <h1>付款测试页面</h1>
    <el-button type="primary" @click="from">Primary</el-button>
    <div>
      请求内容：{{ formStr.formStr }}
    </div>
  </div>
</template>

<script setup>
// This starter template is using Vue 3 <script setup> SFCs
// Check out https://vuejs.org/api/sfc-script-setup.html#script-setup
import axios from "axios";
import { ref } from "vue";

let formStr = ref("");

const from = () => {
  axios.post("http://localhost:8090/api/alipay/pay/1").then((res) => {
    
    //  res.data.data默认是我们拿到的form代码
    const div = document.createElement("div");
    div.innerHTML = res.data.formStr;
    document.body.appendChild(div);
    document.forms[0].submit(); //重要，这个才是点击跳页面的核心

    formStr.value = res.data;
  });
};
</script>

<style scoped>
.logo {
  height: 6em;
  padding: 1.5em;
  will-change: filter;
}
.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}
.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
}
</style>
