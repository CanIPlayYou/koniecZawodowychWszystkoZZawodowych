const fs = require('fs');
const plik = "karty.txt"

var licznik = 0;
const katalog = "./";

/*fs.access(plik, fs.constants.F_OK | fs.constants.W_OK, (err)=>{
    if(err){
        console.log(plik + err.errno === -4058 ? "nie istnieje":"tylko do odczytu");
    }
    else{
        console.log('plik '+ plik +' istnieje i pozwala na zapis');
    }
})*/

fs.readdir(katalog, (err,dane)=>{
    if(err){
        console.log(err);
    }
    else{
        console.log("\n Zawartość katalogu: ");
        dane.forEach(plik =>{
            console.log(plik);
            licznik++;
        })
    }
    console.log("\n Liczba wszystkich elementów w katalogu: "+ licznik);
})
fs.readFile('karty.txt','utf8',(err, zawartosc)=>{
    if(err) return console.log("Błąd otwarcia pliku");
    console.log(zawartosc);
})