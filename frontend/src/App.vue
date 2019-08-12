<template>
  <div id="home">
    <button v-on:click="getmsg">返回json</button>
    <button v-on:click="getpara">获取所传参数</button>
    <p>传过去的参数是:{{userpara}}</p>
    <p>返回的json是:{{userdata}}</p>
  </div>
</template>

<script>
export default {
  name: "home",
  data: function() {
    return {
      userdata: null,
      userpara: null
    };
  },
  methods: {
    getpara: function() {
      this.$http
        .get("http://127.0.0.1:8080/api/studentMan?id=12345")
        .then(res => {
          this.userpara = res.data;
        })
        .catch(error => {
          console.warn(error);
        });
    },
    getmsg: function() {
      this.$http
        .get("http://localhost:8080/api/studentWoman")
        .then(res => {
          this.userdata = res.data;
        })
        .catch(error => {
          console.warn(error);
        });
    }
  }
};
</script>

<style scoped>
</style>