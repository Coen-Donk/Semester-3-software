<script>
export default {
    props: {
        msg: String,
        content:String,
        info:String
    }
}
</script>

<template>
    <div class="gridcontent">
        <img class="image" v-bind:src="content">
        <h5 class="text">{{ msg || 'Error on passing data, check console.' }}</h5>
    </div>
</template>

<style>
.gridcontent {
  background-color: purple;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  text-align: center;
  height: auto;
  width: auto;
  margin: 20px;
  border: 1px solid black;
  position: relative;
}

.image {
  max-width: 70%;
  max-height: 70%;
  width: 100%;
  height: 100%;
  object-fit: cover;
  height: auto;
  margin-bottom: 10px;
  border: none;
}

h5 {
  position: absolute;
  bottom: 0;
  width: 100%;
  padding-top: 10px;
  padding-bottom: 10px;
  margin: 0;
  background-color: rgba(255, 255, 255, 0.7);
  color: purple;
}

</style>