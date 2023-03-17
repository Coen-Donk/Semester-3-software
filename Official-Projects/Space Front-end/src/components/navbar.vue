<script>

</script>
<template>
<html>
  <body>
<ul>
  <li><a href="#home">Home</a></li>
  <li><a href="#news">News</a></li>
  <li><a href="#contact">Contact</a></li>
  <li style="float:right"><a class="active" href="#about">About</a></li>
</ul>

</body>
</html>
</template>

<style>
ul {
  list-style-type: none;
  margin: 0;
  padding : 0;
  overflow: hidden;
  background-color: #333;
  position: fixed;
  width: 80%;
  top: 0;
  left: 10%;
  height:50px;
  z-index: 100;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 30px;
  text-decoration: none;
}

li a:hover {
  background-color: red;
}
</style>