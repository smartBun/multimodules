import Vue from 'vue'
import App from './App'
import Element from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

Vue.use(Element)
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
	el: '#app',
	render: h => h(App)
})
