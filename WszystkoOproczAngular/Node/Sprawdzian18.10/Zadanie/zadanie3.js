const fs = require("fs")

const fileReader = fs.readFile('Zdania.txt', (err, data)=>{
    if(err) throw err;

    console.log(data.toString())
})
