
@aberturaconta
Feature: Abertura de conta

Background:
Given que o usuario acesse url "https://www.original.com.br/"
And selecionar o botao abrir conta 



  @pf
  Scenario Outline: Abertura de conta pessoa fisica

And selecionar o botao abrir conta para voce
#When preencher o formulario de abertura de conta
And preencher o campo com o nome "<nome>"
And preencher o campo com o email "<email>"
And preencher o campo com o cpf "<cpf>"
And preencher o campo  com o telefone "<telefone>"
And selecionar o botao quero ser cliente
Then sera exibido o texto falta pouco

     Examples:
             |nome    |email           |cpf          |celular   |
             |Beatriz |filda@gmail.com |79257822001  |77981244371|

 @pj
  Scenario: Abertura de conta pessoa juridica
And selecionar o botao abrir conta para sua empresa
And selecionar o botão abrir conta pessoa unica
