<template>
  <div>
    <el-row>
      <el-col :span="3">
        <div class="grid-content ep-bg-purple" />
      </el-col>
      <el-col :span="18">
        <div class="grid-content ep-bg-purple-light" >
            <LoginMainVue></LoginMainVue> 
        </div>
      </el-col>
      <el-col :span="3">
        <div class="grid-content ep-bg-purple" />
      </el-col>
    </el-row>
  </div>
</template>

<script setup>
    import LoginMainVue from '../components/Login/LoginMain.vue';
</script>

<style scoped>
.el-row {
  margin-bottom: 20px;
  margin-top: 15%;
  width: 100%;
  height: 100%;
}
.el-row:last-child {
  margin-bottom: 0;
}
.el-col {
  border-radius: 4px;
}

.grid-content {
  border-radius: 4px;
  min-height: 350px;
}
</style>
