let socket = new WebSocket("ws://localhost:8080/demo/");

socket.onopen = function(e) {
  console.log("WS VUE CONNECTION OPEN");
};

socket.onmessage = function(event) {
  console.log(`DATA RECEIVED:  ${event.data}`);
};

socket.onclose = function(event) {
    console.log(`CONNECTION CLOSED`);
};

socket.onerror = function(error) {
  console.log(`ERROR`);
};

export default function sendMessage(message){
    socket.send(message)
}