const fs = require('fs');
const plik = "karty.txt"

const http = require('http');
const host = "127.0.0.1";
const port = 5555;

class Karta{
    constructor(){
        this.wartoscKarty = [];
        this.kolorKarty = [];
    }
}

var wartoscKartyArray = []
var kolorKartyArray = []

const wartoscKartyObj = new Karta();
const kolorKartyObj = new Karta();

fs.readFile('karty.txt','utf8',(err, zawartosc)=>{
    if(err) return console.log("Błąd otwarcia pliku");

    var array = fs.readFileSync('karty.txt').toString().split('\n');
    for(i in array){
        wartoscKartyArray.push(array[i].split(' ').slice(0, -1).join(' '))
        kolorKartyArray.push(array[i].split(' ').slice(-1).join(' '))
    }

    for(i in wartoscKartyArray){
        //const wartoscKartyObj = new Karta();

        wartoscKartyObj.wartoscKarty.push(wartoscKartyArray[i])
        console.log(wartoscKartyObj.wartoscKarty[i])
    }

    for(i in kolorKartyArray){
        //const kolorKartyObj = new Karta();

        kolorKartyObj.kolorKarty.push(kolorKartyArray[i])
        console.log(kolorKartyObj.kolorKarty[i])
    }
})

const serwerWWW = http.createServer((req,res)=>{
    res.writeHead(200, {'Content-Type': 'text/html'});
    for(i in kolorKartyArray){
        res.write(kolorKartyObj.kolorKarty[i] + " " + wartoscKartyObj.wartoscKarty[i] +"\n"+"\r")
    }
    res.end();
    console.log(req.url);
})

serwerWWW.listen(port, host, ()=>console.log('Serwer WWW działa. Jego adres to: '+ host +':'+ port));



