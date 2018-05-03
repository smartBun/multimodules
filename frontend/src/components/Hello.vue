<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
  </div>
</template>

<script>
export default {
  name: 'hello',
  data () {
    return {
      msg: '陈亮大撒比！'
    }
  }
}
</script>

<style>
.hello h1 {
  color: red;
}
</style>
