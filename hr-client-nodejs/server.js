let fetch = require('node-fetch');

setInterval(async ()=>{
    fetch("http://localhost:8080/hr-backend/api/v1/employees/1",{
        headers: {
            "Accept": "application/json"
        }
    }).then( res => res.json()) // Promise
      .then( res => console.log(res.fullname) )
} , 2)
