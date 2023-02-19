<script>
import navbar from './components/navbar.vue';
import Griditem from './components/Griditem.vue'
import SearchBar from './components/SearchBar.vue'
import {sendMessage} from './modules/websocketFunctions.js'

export default {
  components: { navbar,Griditem, SearchBar }, 
  data() {
    return {
      result: "eeee",
      count: 0,
      apiKey: '',
    }
  },
  methods: {
    sendMessage($event){
      return sendMessage($event)
    },
    add() {
      this.count++
    },
    async fetchAPIData() {
      this.responseAvailable = false;
      await fetch("https://ssd-api.jpl.nasa.gov/nhats.api?des=2021 JG6", {
        "method": "GET",
      }).then(Response => {
        if (Response.ok) {
          return Response.json()
        } else {
          alert("Server returned " + Response.status + " : " + Response.statusText)
        }
      }).then(Response => {
        this.result = Response;
        this.responseAvailable = true;
      }).catch(err => {
        console.log(err)
      })
    }
  }
}
</script>

<template>
  <html>

  <body>
    <navbar />
    <div class="header">
      <SearchBar v-on:search-event="sendMessage($event)"/>
    </div>
    <div class="Grid">
      <Griditem class="item1" msg="I am item 1" content="./src/assets/apod_test.jpg"/>
      <Griditem class="item1" msg="I am item 1" content="./src/assets/apod_test.jpg"/>
      <Griditem class="item1" msg="I am item 1" content="./src/assets/apod_test.jpg"/>
    </div>
  </body>

  </html>
</template>

<style>
.Grid {
  border-width: thin;
  border-style: solid;
  border-color: red;

  position: relative;
  display: grid;
  grid-template-columns: auto auto auto;
  gap: 10px;
  text-align: center;
  padding: 10px;
  margin: auto;
  width: 80%;
  height: 35%;
  top: 50px;
  font-family: "Lucida Console", "Courier New", monospace;
}

.header {
  position: relative;
  padding: 10px;
  margin: auto;
  width: 80%;
  top: 50px;
  height: 20px;

  font-family: "Lucida Console", "Courier New", monospace;
}

.Search{
  float: right;
}

.SearchButton {
  float:right;
  align-items: center;
  background-image: linear-gradient(144deg,#AF40FF, #5B42F3 50%,#00DDEB);
  border: 0;
  border-radius: 8px;
  box-shadow: rgba(151, 65, 252, 0.2) 0 15px 30px -5px;
  box-sizing: border-box;
  color: #FFFFFF;
  display: flex;
  font-family: Phantomsans, sans-serif;
  font-size: 20px;
  justify-content: center;
  line-height: 1em;
  max-width: 100%;
  min-width: 140px;
  padding: 3px;
  text-decoration: none;
  user-select: none;
  -webkit-user-select: none;
  touch-action: manipulation;
  white-space: nowrap;
  cursor: pointer;
}

.SearchButton:active,
.SearchButton:hover {
  outline: 0;
}

.SearchButton span {
  background-color: rgb(5, 6, 45);
  padding: 16px 24px;
  border-radius: 6px;
  width: 100%;
  height: 100%;
  transition: 300ms;
}

.SearchButton:hover span {
  background: none;
}

@media (min-width: 768px) {
  .button-64 {
    font-size: 24px;
    min-width: 196px;
  }
}

.item1 {
  grid-row-start: 1;
  grid-row-end: 3;
}

.container {
  padding: 20px;
  position: relative;
  margin: auto;
  font-family: "Lucida Console", "Courier New", monospace;
  background-color: white;
}

html {
  background-color: rgb(0, 0, 0);
  width: 100%;
  height: 100;
}
</style>