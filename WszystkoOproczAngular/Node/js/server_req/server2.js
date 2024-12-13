const http = require("http");
const url = require("url");

http.createServer(
    function(req, res){
        res.writeHead(200,{"Content-type":"text/html"})
        res.write("req.url:" + req.url + "<br>")

        //localhost:8080/test.html?arg1=10&arg2=test
        let parseUrl = url.parse(req.url, true);

        res.write("parseUrl.pathname:" + parseUrl.pathname + "<br>")

        res.write("parametry: "+ parseUrl.pathname + "<br>")
        //let json = JSON.stringify(parseUrl)
        res.write("param"+ JSON.stringify(parseUrl.query)+"<br>")

        let params = parseUrl.query

        var a = parseInt(params.arg1)
        var b = parseInt(params.arg2)

        suma = a + b;

        res.write("Wynnik dodawania: "+ suma + "<br>")
        console.log(suma);
        

        res.end()
    }
).listen(8080)