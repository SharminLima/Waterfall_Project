package WaterFallStepDefinition;

import WaterfallPageAction.contactpage_Action;
import WaterfallUtilityPackage.WaterfallBaseClass;
import cucumber.api.java.en.Then;

public class Step_definition_for_contact extends WaterfallBaseClass{
	contactpage_Action contactPage_Action = new contactpage_Action();
	
	@Then("^click contacctt$")
	public void click_contacctt() throws Throwable {
		contactPage_Action.clickcontacctt();  
	}

	@Then("^enter contact email$")
	public void enter_contact_email() throws Throwable {
		contactPage_Action.entercontactemail();
	}

	@Then("^enter contact name$")
	public void enter_contact_name() throws Throwable {
		contactPage_Action.entercontactname();
	}

	@Then("^enter message$")
	public void enter_message() throws Throwable {
		contactPage_Action.entermessage();
	}

	@Then("^click send message$")
	public void click_send_message() throws Throwable {
		contactPage_Action.clicksendmessage();
	}

	@Then("^Verify user can contact by sending message$")
	public void verify_user_can_contact_by_sending_message() throws Throwable {
		contactPage_Action.Verifyusercancontactbysendingmessage();
	}
	
}
