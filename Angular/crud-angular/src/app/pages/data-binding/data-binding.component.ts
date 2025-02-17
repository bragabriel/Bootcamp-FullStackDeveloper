import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit { 

  text = 'Interpolação -> Do componente para o D.O.M';
  imgUrl = 'https://picsum.photos/300/300';
  imgAlt = 'Essa é uma imagem';
  buttonText = 'Criando atributo e atribuindo valor direto pelo componente =)';
  textRed = false;
  bgColor = 'green';
  fontSize = '50px';
  widthImg = 200;
  heightImg = 200;
  textInput = '';
  botaoTexto = 'OI';
  number = 0;

  constructor() { }

  ngOnInit(): void {
  }

  retornaNome(){
    return "OLAAAA da função"
  }

  clicouBtn(){
    console.log('Clicou! =)')
    this.text = 'Clicou no botãoooooo, iiiiihhhhhhhhhhhh'
  }

  clicouInput(value: any){
    console.log('Clicou', value)
  }

  clicouClass(){
    this.textRed = true
  }

  clicouNoFilho(text: any){
    console.log(text)
  }

  incrementa(){
    this.number++;
  }
}
