<template>
  <el-row :gutter="20">
    <el-col :span="4"><div class="grid-content"></div></el-col>
    <el-col :span="16">
      <el-menu theme="dark" default-active="1" class="el-menu-demo" mode="horizontal" :router="true">
        <el-menu-item index="/elindex/hot">首页</el-menu-item>
        <el-submenu index="2">
          <template slot="title">攻略</template>
          <el-menu-item index="2-1">60</el-menu-item>
          <el-menu-item index="2-2">70</el-menu-item>
          <el-menu-item index="2-3">80</el-menu-item>
        </el-submenu>
        <el-menu-item index="3">插件</el-menu-item>
        <el-submenu index="4">
          <template slot="title">工具</template>
          <el-menu-item index="4-1">天赋模拟器</el-menu-item>
          <el-menu-item index="4-2">数据库</el-menu-item>
        </el-submenu>
        <el-menu-item index="5">视频</el-menu-item>
        <el-menu-item index="6">论坛</el-menu-item>
        <el-menu-item index="7">交易</el-menu-item>
      </el-menu>

    </el-col>
    <el-col :span="4"><div class="grid-content"></div></el-col>
  </el-row>
</template>

<script>
export default {
  name: "nav"
}
</script>

<style scoped>

</style>
