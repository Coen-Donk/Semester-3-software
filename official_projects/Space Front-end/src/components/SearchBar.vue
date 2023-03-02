<script>
import useEventsBus from "../modules/eventbus.js"
import GridItem from './Griditem.vue'
import {watch} from "vue"

export default{
    data(){
        components:{
            GridItem
        }
        return{
            searchBarInput: "",
            gridItems: []
        }
    },
    methods: {
        addItem(input) {
            console.log(input)
      const newItem = {
        msg: input,
        content: "./src/assets/apod_test.jpg"
      };
      console.log("inputted");
      this.$emit("new-item-added", newItem);
      console.log("emitted")
    }
    },
    mounted(){
        const {bus} = useEventsBus();
    },
}
</script>

<template>
    <div class="Search">
        <input class="SearchInput" v-model="searchBarInput" type="text" placeholder="asteroid name"/> 
        <button class="SearchButton" v-on:click="$emit('search-event', searchBarInput)">Search</button>
        <button class="SearchButton" @click="addItem(searchBarInput)">Add Item</button>
    </div>
</template>

<style>
    .Search{
    overflow: hidden;
    z-index: 1000;
    position: fixed;
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
    bottom: 1000px;
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

    .SearchInput{
        margin-right:10px;
    }
</style>