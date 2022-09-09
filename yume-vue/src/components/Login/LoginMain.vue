<template>
    <el-card class="box-card">

        <h3 style="margin:0 260px;">用户登录</h3>
        <!-- 表单 -->
        <el-form style="margin-left: 140px;margin-top: 60px;">
            <el-form :label-position="labelPosition" label-width="100px" :model="formLabelAlign"
                style="max-width: 350px">
                <el-form-item label="Name">
                    <el-input v-model="formLabelAlign.name" />
                </el-form-item>
                <el-form-item label="Password">
                    <el-input v-model="formLabelAlign.password" />
                </el-form-item>

                <el-form-item label="Verification">
                    <el-input v-model="formLabelAlign.code" />
                </el-form-item>
                <!-- 提交框 -->
                <el-form-item>
                    <el-button type="primary" @click="onSubmit">提交</el-button>
                    <el-button type="register" @click="onRegister" >注册</el-button>
                </el-form-item>
            </el-form>
        </el-form>
    </el-card>
</template>

<script setup>

</script>

<style scoped>
.box-card {
    margin: 0 auto;
    width: 650px;
    height: 350px;
    background-color: rgba(255, 255, 255, 0.8);
}
</style>

<script lang="ts" setup>
    import { reactive, ref } from 'vue'
    
    const labelPosition = ref('left')
    
    const formLabelAlign = reactive({
      name: '',
      passwoed: '',
      Code:'',
    })
</script>