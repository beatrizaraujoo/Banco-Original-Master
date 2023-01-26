package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrirConta = By.cssSelector(
			"body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");
	private By btnAbrirContaParaVoce = By.id("bt1");
	private By camponome = By.id("nome");
	private By campotelefone = By.id("telefone");
	private By campoemail = By.id("email");
	private By campocpf = By.id("cpf");
	private By btnQueroSerCliente = By.id("btnEnviar");
	private By faltaPouco = By.cssSelector(
			"body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");
	private By btnAbrirContaPessoaUnica = By.id("bt2");

	//
	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}

	public By getCamponome() {
		return camponome;
	}

	public By getCampotelefone() {
		return campotelefone;
	}

	public By getCampoemail() {
		return campoemail;
	}

	public By getCampocpf() {
		return campocpf;
	}

	public By getFaltaPouco() {
		return faltaPouco;
	}

	public By getBtnAbrirContaParaVoce() {
		return btnAbrirContaParaVoce;
	}

	public By getBtnAbrirContaPessoaUnica() {
		return btnAbrirContaPessoaUnica;
	}

	public By getCampoNome() {
		return camponome;
	}

	public By getCampoTelefone() {
		return campotelefone;
	}

	public By getCampoEmail() {
		return campoemail;
	}

	public By getCampoCPF() {
		return campocpf;
	}

	public By getBtnQueroSerCliente() {
		return btnQueroSerCliente;
	}
}