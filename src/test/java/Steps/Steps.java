package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos m = new Metodos();
	Elementos e = new Elementos();
	
	@Given("que o usuario acesse a url {string}")
	public void que_o_usuario_acesse_a_url(String url) {
    m.abrirNavegador(url);
}

	@Given("selecionar o botao abrir conta")
	public void selecionar_o_botao_abrir_conta() {
    e.getBtnAbrirConta();
}

	@Given("selecionar o botao abrir conta para voce")
	public void selecionar_o_botao_abrir_conta_para_voce() {
    e.getBtnAbrirContaParaVoce();
}

	@Given("preencher o campo com o nome {string}")
	public void preencher_o_campo_com_o_nome(String nome) {
	m.preencher(e.getCampoNome(), nome);
}

	@Given("preencher o campo com o telefone {string}")
	public void preencher_o_campo_com_o_telefone(String telefone) {
	m.preencher(e.getCampoTelefone(), telefone);
}
}