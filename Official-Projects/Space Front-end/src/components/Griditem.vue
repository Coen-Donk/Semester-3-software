<script>
import useEventBus from "../modules/eventbus"
import { watch } from "vue"

export default {
    props: {
        msg: {
          type: String, 
          default: 'Error on passing data, check console.'
        },
        content:String,
        info:String
    },
    data(){
      return{
        aspectRatio: 0,
        itemname: ""
      }
    },
    methods: {
    CalcAspectRatio() {
      const img = new Image()
      img.src = this.content
      img.onload = () => {
      var TempAspectRatio = img.width / img.height
      TempAspectRatio = TempAspectRatio.toFixed(2);
      this.aspectRatio = TempAspectRatio
      };
      }
    },
    mounted() {
     this.CalcAspectRatio()

     const {bus} = useEventBus();
       watch(()=>bus.value.get('data-received'), (val) => {
      const [dataReceivedBus] = val ?? []
      this.itemname = dataReceivedBus
       })
  }
}
</script>

<template>
    <div class="gridcontent" v-on:create="CalcAspectRatio" v-bind:style="{ backgroundImage: `url(${content})`, aspectRatio: aspectRatio }">
        <h5 class="text">{{ msg }}</h5>
    </div>
</template>

<style>
.gridcontent {
  background-size: contain;
  background-repeat: no-repeat;
  background-position: center top;
  display: flex;
  flex-direction: column;
  justify-content: center;

  width: auto;

  align-items: center;
  text-align: center;
  margin: 10px;
  border: 1px solid black;
  position: relative;
}

h5 {
  position: absolute;
  justify-content: center;
  float: left;
  width: 100%;
  bottom: 0;
  padding-top: 10px;
  padding-bottom: 10px;
  margin: 0;
  background-color: rgba(255, 255, 255, 0.342);
  color: black;
}

</style>