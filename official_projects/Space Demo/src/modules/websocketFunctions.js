let socket = new WebSocket("ws://localhost:8080/demo/");

socket.onopen = function(e) {
  console.log("WS VUE CONNECTION OPEN");
};

socket.onmessage = function(event) {
    var magnitude = parse(event.data).obs_mag
  console.log(`DATA RECEIVED:  ${magnitude}`);
};

socket.onclose = function(event) {
    console.log(`CONNECTION CLOSED`);
};

socket.onerror = function(error) {
  console.log(`ERROR`);
};

export function sendMessage(message){
    socket.send(message)
}

function parse(message){
    return JSON.parse(message)
}