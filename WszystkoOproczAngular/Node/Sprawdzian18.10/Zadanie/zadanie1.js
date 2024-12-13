const http = require('http');
const host = "127.0.0.1";
const port = 5555;


const serwerWWW = http.createServer((req,res)=>{
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write("Witaj na stronie internetowej!")
    
    res.end()
})

serwerWWW.listen(port, host, ()=>console.log('Serwer działa na porcie '+ port));
