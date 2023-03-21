
import useEventBus from "./eventbus";

let socket = new WebSocket("ws://localhost:8080/demo/");

socket.onopen = function(e) {
  console.log("WS VUE CONNECTION OPEN");
};

socket.onmessage = function(event) {
    var asteroiddata = event.data //hier parse ik voor selectief de magnitude
  console.log(`DATA RECEIVED:  ${asteroiddata}`);
  const {emit} = useEventBus()
 emit('data-received', asteroiddata)
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