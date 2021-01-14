package utils;

import models.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;


@Data
public class Generic {

    @SerializedName("CampoDePesquisa")
    @Expose
    protected BaseGeneric CampoDePesquisa;

    @SerializedName("CampoDePesquisaSumbit")
    @Expose
    protected BaseGeneric CampoDePesquisaSumbit;

    @SerializedName("SelecioarPrimeiraProdutoDaPesquisa")
    @Expose
    protected BaseGeneric SelecioarPrimeiraProdutoDaPesquisa;
    
    @SerializedName("CampoDeSingnIn")
    @Expose
    protected BaseGeneric CampoDeSingnIn;
    
    // Create An Account Page
    @SerializedName("emailCreateInput")
    @Expose
    protected BaseGeneric emailCreateInput;
    
    @SerializedName("emailCreateSubmit")
    @Expose
    protected BaseGeneric emailCreateSubmit;
    
    @SerializedName("titleGenderMaleInput")
    @Expose
    protected BaseGeneric titleGenderMaleInput;
    
    @SerializedName("titleGenderFemaleInput")
    @Expose
    protected BaseGeneric titleGenderFemaleInput;
    
    @SerializedName("customerFirstNameInput")
    @Expose
    protected BaseGeneric customerFirstNameInput;
    
    @SerializedName("customerLastNameInput")
    @Expose
    protected BaseGeneric customerLastNameInput;
    
    @SerializedName("passwordInput")
    @Expose
    protected BaseGeneric passwordInput;
    
    @SerializedName("dayOfBirthSelect")
    @Expose
    protected BaseGeneric dayOfBirthSelect;
    
    @SerializedName("monthOfBirthSelect")
    @Expose
    protected BaseGeneric monthOfBirthSelect;
    
    @SerializedName("yearOfBirthSelect")
    @Expose
    protected BaseGeneric yearOfBirthSelect;
    
    @SerializedName("companyInput")
    @Expose
    protected BaseGeneric companyInput;
    
    @SerializedName("addressInput")
    @Expose
    protected BaseGeneric addressInput;
    
    @SerializedName("address2Input")
    @Expose
    protected BaseGeneric address2Input;
    
    @SerializedName("cityInput")
    @Expose
    protected BaseGeneric cityInput;
    
    @SerializedName("stateSelect")
    @Expose
    protected BaseGeneric stateSelect;
    
    @SerializedName("postCodeInput")
    @Expose
    protected BaseGeneric postCodeInput;
    
    @SerializedName("countrySelect")
    @Expose
    protected BaseGeneric countrySelect;
    
    @SerializedName("addInfoTextarea")
    @Expose
    protected BaseGeneric addInfoTextarea;
    
    @SerializedName("homePhoneInput")
    @Expose
    protected BaseGeneric homePhoneInput;
    
    @SerializedName("aliasInput")
    @Expose
    protected BaseGeneric aliasInput;
    
    @SerializedName("mobilePhoneInput")
    @Expose
    protected BaseGeneric mobilePhoneInput;
    
    @SerializedName("submitAccountButton")
    @Expose
    protected BaseGeneric submitAccountButton;
    
    // Checkout Page
    @SerializedName("firstResearchProduct")
    @Expose
    protected BaseGeneric firstResearchProduct;
    
    @SerializedName("addToCardButton")
    @Expose
    protected BaseGeneric addToCardButton;
    
    @SerializedName("proceedToCheckout")
    @Expose
    protected BaseGeneric proceedToCheckout;
    
    @SerializedName("proceedToCheckoutToContinue")
    @Expose
    protected BaseGeneric proceedToCheckoutToContinue;
    
    @SerializedName("proceedToCheckoutChooseAdress")
    @Expose
    protected BaseGeneric proceedToCheckoutChooseAdress;
    
    @SerializedName("agreeWithTheTerm")
    @Expose
    protected BaseGeneric agreeWithTheTerm;
    
    @SerializedName("proceedToCheckoutChooseShipping")
    @Expose
    protected BaseGeneric proceedToCheckoutChooseShipping;
    
    @SerializedName("payByCheck")
    @Expose
    protected BaseGeneric payByCheck;
    
    @SerializedName("confirmMyOrder")
    @Expose
    protected BaseGeneric confirmMyOrder;
    
    @SerializedName("successMessage")
    @Expose
    protected BaseGeneric successMessage;
    
   
	public BaseGeneric getCampoDePesquisa() {
		return this.CampoDePesquisa;
	}

	public BaseGeneric getCampoDePesquisaSumbit() {
		return this.CampoDePesquisaSumbit;
	}

	public BaseGeneric getSelecioarPrimeiraProdutoDaPesquisa() {
		return this.SelecioarPrimeiraProdutoDaPesquisa;
	}
	
	public BaseGeneric getCampoDeSingnIn() {
		return this.CampoDeSingnIn;
	}
	
	public BaseGeneric getEmailCreateInput() {
		return this.emailCreateInput;
	}
	
	public BaseGeneric getEmailCreateSubmit() {
		return this.emailCreateSubmit;
	}
	
	public BaseGeneric getTitleGenderMaleInput() {
		return this.titleGenderMaleInput;
	}
	
	public BaseGeneric getTitleGenderFemaleInput() {
		return this.titleGenderFemaleInput;
	}
	
	public BaseGeneric getCustomerFirstNameInput() {
		return this.customerFirstNameInput;
	}
	
	public BaseGeneric getCustomerLastNameInput() {
		return this.customerLastNameInput;
	}
	
	public BaseGeneric getPasswordInput() {
		return this.passwordInput;
	}
	
	public BaseGeneric getDayOfBirthSelect() {
		return this.dayOfBirthSelect;
	}
	
	public BaseGeneric getMonthOfBirthSelect() {
		return this.monthOfBirthSelect;
	}
	
	public BaseGeneric getYearOfBirthSelect() {
		return this.yearOfBirthSelect;
	}
	
	
	public BaseGeneric getCompanyInput() {
		return this.companyInput;
	}
	
	public BaseGeneric getAddressInput() {
		return this.addressInput;
	}
	
	public BaseGeneric getAddress2Input() {
		return this.address2Input;
	}
	
	public BaseGeneric getCityInput() {
		return this.cityInput;
	}
	
	public BaseGeneric getStateSelect() {
		return this.stateSelect;
	}
	
	public BaseGeneric getPostCodeInput() {
		return this.postCodeInput;
	}
	
	public BaseGeneric getCountrySelect() {
		return this.countrySelect;
	}
	
	public BaseGeneric getAddInfoTextarea() {
		return this.addInfoTextarea;
	}
	
	public BaseGeneric getHomePhoneInput() {
		return this.homePhoneInput;
	}
	
	public BaseGeneric getMobilePhoneInput() {
		return this.mobilePhoneInput;
	}
	
	public BaseGeneric getAliasInput() {
		return this.aliasInput;
	}
	
	public BaseGeneric getSubmitAccountButton() {
		return this.submitAccountButton;
	}
	
	public BaseGeneric getFirstResearchProduct() {
		return this.firstResearchProduct;
	}
	
	public BaseGeneric getAddToCardButton() {
		return this.addToCardButton;
	}
	
	public BaseGeneric getProceedToCheckout() {
		return this.proceedToCheckout;
	}
	
	public BaseGeneric getProceedToCheckoutToContinue() {
		return this.proceedToCheckoutToContinue;
	}
	
	public BaseGeneric getProceedToCheckoutChooseAdress() {
		return this.proceedToCheckoutChooseAdress;
	}
	
	public BaseGeneric getAgreeWithTheTerm() {
		return this.agreeWithTheTerm;
	}
	
	public BaseGeneric getProceedToCheckoutChooseShipping() {
		return this.proceedToCheckoutChooseShipping;
	}
	
	public BaseGeneric getPayByCheck() {
		return this.payByCheck;
	}
	
	public BaseGeneric getConfirmMyOrder() {
		return this.confirmMyOrder;
	}
	
	public BaseGeneric getSuccessMessage() {
		return this.successMessage;
	}
	
}