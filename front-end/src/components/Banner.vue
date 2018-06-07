<template>
	<el-row :gutter="20">
		<el-col :span="4"><div class="grid-content"></div></el-col>
		<el-col :span="16"><div class="grid-content main-header">{{ msg }}</div></el-col>
		<el-col :span="4"><div class="grid-content"></div></el-col>
	</el-row>
</template>

<script>
export default {
	name: 'banner',
	data () {
		return {
			msg: '陈亮大撒比'
		}
	}
}
</script>

<style>
.grid-content {
	min-height: 60px;
}

	.main-header {
		background-color: slategray;
	}

</style>
