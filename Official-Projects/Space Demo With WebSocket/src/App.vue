<script>
import sendMessage from "./modules/wsFunctions.js"

export default {
  data() {
    return {
      result:"bar",
      received:"foo",
      receiving:"",
      count:0
    }
  },
  methods:{
    wsConnect(){
      this.receiving = sendMessage(this.result)
      if(this.receiving === !undefined){
        this.received = this.receiving
        console.log(this.received)
      }
    },
    increment(){
      
      this.count = sendMessage(this.count)
      console.log(this.count)
    }
  }
} 
</script>

<template>
<body>

<ul>
  <li><button v-on:click="wsConnect" style="float:right" href="#about">Account</button></li>
  <li><button v-on:click="increment">TEST</button></li>
</ul>
</body>

<h1 v-bind:class="titleClass">{{ this.receiving }}</h1>
<h1 v-bind:class="titleClass">{{ this.count }}</h1>
</template>

<style scoped>
.title{
  color: red;
}

ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  top: 0px;
  left: 0px;
  right: 0px;
  overflow: hidden;
  background-color: #333;
  position: fixed;
}

li {
  float: left;
}

.Account {
  float:right;
}

li button {
  display: block;
  background-color: #333;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  border-color: #333;
  border-width: 0px;
}

li button:hover {
  background-color: #111;
  cursor: pointer;
}

h1{
  top:20px; 
  }
</style>