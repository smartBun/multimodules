<template>
	<el-container style="height: 1500px; border: 1px solid #eee">
		<el-header>
			<banner></banner>
		</el-header>

		<el-main>
			<Nav></Nav>
		</el-main>
	</el-container>
</template>

<script>

import Banner from './components/Banner';
import ElRow from "element-ui/packages/row/src/row";
import Nav from "./components/Navgator";

export default {
	name: 'app',
	components: {
		Nav,
		ElRow,
		Banner
	}
}

</script>

<style>

</style>
