package steps;

import pageobjects.*;

public class CheckoutSteps implements io.cucumber.java8.En {
	public CheckoutSteps() {
		
		Given("that the user hits Sign in", HomePage::selecionarCampoDeSignIn);
		And("^user enter with valid email (.*)$", CreateAnAccountPage::inserirEmailParaCriarConta);
		When("^second page load user enter with title (.*)$", CreateAnAccountPage::inserirTitulo);
		And("^user enter with first name (.*)$", CreateAnAccountPage::inserirPrimeiroNome);
		And("^user enter with last name (.*)$", CreateAnAccountPage::inserirSobrenome);
		And("^user enter with password (.*)$", CreateAnAccountPage::inserirSenha);
		And("^user enter with day of birth (.*)$", CreateAnAccountPage::inserirDiaDeNascimento);
		And("^user enter with month of birth (.*)$", CreateAnAccountPage::inserirMesDeNascimento);
		And("^user enter with year of birth (.*)$", CreateAnAccountPage::inserirAnoDeNascimento);
		And("^user enter with company (.*)$", CreateAnAccountPage::inserirCorporacao);
		And("^user enter with address (.*)$", CreateAnAccountPage::inserirEndereco);
		And("^user enter with second address (.*)$", CreateAnAccountPage::inserirEndereco2);
		And("^user enter with city (.*)$", CreateAnAccountPage::inserirCidade);
		And("^user enter with state (.*)$", CreateAnAccountPage::inserirEstado);
		And("^user enter with zip/postal code (.*)$", CreateAnAccountPage::inserirCodigoPostal);
		And("^user enter with country (.*)$", CreateAnAccountPage::inserirPais);
		And("^user enter with additional information (.*)$", CreateAnAccountPage::inserirInformacoesAdicionais);
		And("^user enter with home phone (.*)$", CreateAnAccountPage::inserirTelefoneResidencial);
		And("^user enter with mobile phone (.*)$", CreateAnAccountPage::inserirTelefoneCelular);
		And("^user enter with Assign an address alias for future reference (.*)$", CreateAnAccountPage::inserirOutroEndereco);
		Then("^user search for product (.*)$", HomePage::pesquisa);
		And("user selects the first product of the search result", CheckoutPage::selecionarPrimeiroProduto);
		And("user hits Add to cart", CheckoutPage::selecionarAdicionarAoCarrinhoDeCompras);
		And("user hits Proceed to checkout", CheckoutPage::selecionarProcederACompra);
		And("in shipping step user must agree with the terms", CheckoutPage::concordarComOsTermosEProcederACompra);
		And("in payment step user choose pay by check", CheckoutPage::selecionarPagamentoEmCheque);
		And("user confirm his order", CheckoutPage::confirmarPedido);
		
	}

}

