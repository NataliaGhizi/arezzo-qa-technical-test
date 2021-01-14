package pageobjects;

import utils.Generic;
import utils.ScreenMappings;

public class CheckoutPage extends BasePage {

    static Generic element = new ScreenMappings<models.pages.CheckoutPage>().getJson("CheckoutPage");
	
	public static void selecionarPrimeiroProduto() {
        click(element.getFirstResearchProduct());
    }
	
	public static void selecionarAdicionarAoCarrinhoDeCompras() {
        click(element.getAddToCardButton());
    }
	
	public static void selecionarProcederACompra() {
        click(element.getProceedToCheckout());
        click(element.getProceedToCheckoutToContinue());
        click(element.getProceedToCheckoutChooseAdress());
    }
	
	public static void concordarComOsTermosEProcederACompra() {
		click(element.getAgreeWithTheTerm());
		click(element.getProceedToCheckoutChooseShipping());
	}
	
	public static void selecionarPagamentoEmCheque() {
		click(element.getPayByCheck());
	}
	
	public static void confirmarPedido() {
		click(element.getConfirmMyOrder());
	}
	
}
