const http = require('http');
const host = "127.0.0.1";
const port = 5555;

const serwerWWW = http.createServer((req,res)=>{
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.end('<h1 style="background-color:yellow;text-align:center;">Strona tekstowa</h1>');
    console.log(req.url);
})

serwerWWW.listen(port, host, ()=>console.log('Serwer WWW działa. Jego adres to: '+ host +':'+ port));