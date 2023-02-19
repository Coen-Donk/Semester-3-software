<script>
export default {
    props: {
        msg: String,
        content:String
    }
}
</script>

<template>
    <div class="gridcontent">
        <img class="image" v-bind:src="content">
        <h1>{{ content || " Error on passing data, check console. " }}</h1>
        <h5 class="text">{{ msg || 'Error on passing data, check console.' }}</h5>
    </div>
</template>

<style>
.gridcontent {
    background-color: white;
    padding: 1px 0;
    width: 300px;
}

.text{
   margin-top:0;
   margin-bottom: 0;
}

.image {
    max-height: 455px;
    max-width: 300px;
}
</style>