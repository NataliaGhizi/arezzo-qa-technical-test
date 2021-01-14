package pageobjects;

import utils.Generic;

import utils.ScreenMappings;

public class CreateAnAccountPage extends BasePage {
	
	static Generic element = new ScreenMappings<models.pages.CreateAnAccountPage>().getJson("CreateAnAccountPage");
	
	public static void inserirEmailParaCriarConta(String email) {
        fillInput(email, element.getEmailCreateInput());
        click(element.getEmailCreateSubmit());
    }
	
	public static void inserirTitulo(String title) {
		if(title.contains("Mr."))
			click(element.getTitleGenderMaleInput());
		else
			click(element.getTitleGenderFemaleInput());
    }
	
	public static void inserirPrimeiroNome(String firstName) {
        fillInput(firstName, element.getCustomerFirstNameInput());
    }
	
	public static void inserirSobrenome(String lastName) {
        fillInput(lastName, element.getCustomerLastNameInput());
    }
	
	public static void inserirSenha(String senha) {
        fillInput(senha, element.getPasswordInput());
    }
	
	public static void inserirDiaDeNascimento(String dia) {
		selectValue(dia, element.getDayOfBirthSelect());
    }
	
	public static void inserirMesDeNascimento(String dia) {
		selectValue(dia, element.getMonthOfBirthSelect());
    }
	
	public static void inserirAnoDeNascimento(String dia) {
		selectValue(dia, element.getYearOfBirthSelect());
    }
	
	public static void inserirCorporacao(String company) {
        fillInput(company, element.getCompanyInput());
    }
	
	public static void inserirEndereco(String address) {
        fillInput(address, element.getAddressInput());
    }
	
	public static void inserirEndereco2(String address) {
        fillInput(address, element.getAddress2Input());
    }
	
	public static void inserirCidade(String city) {
        fillInput(city, element.getCityInput());
    }
	
	public static void inserirEstado(String state) {
		selectValue(state, element.getStateSelect());
    }
	
	public static void inserirCodigoPostal(String postCode) {
        fillInput(postCode, element.getPostCodeInput());
    }
	
	public static void inserirPais(String country) {
		selectValue(country, element.getCountrySelect());
    }
	
	public static void inserirInformacoesAdicionais(String info) {
        fillInput(info, element.getAddInfoTextarea());
    }
	
	public static void inserirTelefoneResidencial(String phone) {
        fillInput(phone, element.getHomePhoneInput());
    }
	
	public static void inserirTelefoneCelular(String phone) {
        fillInput(phone, element.getMobilePhoneInput());
    }
	
	public static void inserirOutroEndereco(String address) {
        fillInput(address, element.getAliasInput());
        click(element.getSubmitAccountButton());
    }

}
