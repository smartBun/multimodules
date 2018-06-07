<template>
  <div class="hello">
    <h1>site : {{site}}</h1>
    <h1>Server Message : {{sm}}</h1>
    <h1>{{ msg() }}</h1>
    <button @click="testMethod" type="text" size="large">Get Message from server</button>
  </div>
</template>

<script>
export default {
  name: '',
  data () {
    return {
      site: 'site1',
      sm: '--',
      apiUrl: 'http://127.0.0.1:8000/',
      msg () {
        return 'A mesage from a function'
      }
    }
  },
  methods: {
    testMethod: function () {
      this.$axios.get(this.apiUrl).then((response) => {
        this.sm = response.data
      }).catch(function (response) {
        console.log(response)
      })
    }
  }
}
</script>

<style>
.hello h1 {
  color: red;
}
</style>
