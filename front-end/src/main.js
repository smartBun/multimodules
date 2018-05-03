// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import axios from 'axios'

Vue.config.productionTip = false
Object.defineProperty(Vue.prototype, '$axios', { value: axios })

let vm = new Vue({
  router,
  el: '#app',
  render: h => h(App)
})

Vue.use({
  vm
})
