let nomeHeroi  =  "Zeus"
let xpHeroi = "10001"
let scanner = require('prompt- sync')();
console.log("Digite o nome do Heroi: ")
scanner();
if(xpHeroi < 1000){
    console.log(nomeHeroi + "XP VIDA: "+ xpHeroi + " Ferro")
}else if(xpHeroi < 2001){
    console.log(nomeHeroi + "XP VIDA: "+ xpHeroi + " Bronze")
}else if(xpHeroi < 5001){
    console.log(nomeHeroi + "XP VIDA: "+ xpHeroi + " Prata")
}else if(xpHeroi < 7001){
    console.log(nomeHeroi + "XP VIDA: "+ xpHeroi + " Ouro")
}else if(xpHeroi < 8001 ){
    console.log(nomeHeroi + "XP VIDA: "+ xpHeroi + " Platina")
}else if(xpHeroi < 9001){
    console.log(nomeHeroi + "XP VIDA: "+ xpHeroi + " Ascentente")
}else if(xpHeroi < 10001 ){
    console.log(nomeHeroi + "XP VIDA: "+ xpHeroi + " Imortal")
}else {
    console.log(nomeHeroi + "XP VIDA: "+ xpHeroi + " Radiante")
}
