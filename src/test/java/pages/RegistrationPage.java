package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    private final String FORM_TITLE = "Student Registration Form";
    private final String MODAL_TITLE = "Thanks for submitting the form";

    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderRadioButton = $("#genterWrapper"),
            phoneInput = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            hobbiesCheckBox = $("#hobbiesWrapper"),
            imageInput = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            stateDropdown = $("#state"),
            stateCityDropdownItem = $("#stateCity-wrapper"),
            cityDropdown = $("#city"),
            submitButton = $("#submit"),
            modalTitle = $("#example-modal-sizes-title-lg");

    public CalendarComponent calendar = new CalendarComponent();

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
        return this;
    }

    public RegistrationPage typeFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage typeLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage typeEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    public RegistrationPage setRadioButtonGender(String value) {
        genderRadioButton.$(byText(value)).click();
        return this;
    }

    public RegistrationPage typePhone(String value) {
        phoneInput.setValue(value);
        return this;
    }

    public RegistrationPage typeSubject(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage uploadImage(String value) {
        imageInput.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage setCheckBoxHobbies(String value) {
        hobbiesCheckBox.$(byText(value)).click();
        return this;
    }

    public RegistrationPage typeCurrentAddress(String value) {
        currentAddressInput.scrollTo();
        currentAddressInput.setValue(value);
        return this;
    }

    public RegistrationPage selectStateDropdownItem(String value) {
        stateDropdown.click();
        stateCityDropdownItem.$(byText(value)).click();
        return this;
    }

    public RegistrationPage selectCityDropdownItem(String value) {
        cityDropdown.click();
        stateCityDropdownItem.$(byText(value)).click();
        return this;
    }

    public RegistrationPage clickButtonSubmit() {
        submitButton.click();
        return this;
    }

    public RegistrationPage assertModalTitleShouldHaveValueMODALTITLE() {
        modalTitle.shouldHave(text(MODAL_TITLE));
        return this;
    }

    public RegistrationPage checkResultsValue(String key, String value) {
        $(".table-responsive").$(byText(key)).parent()
                .shouldHave(text(value));
        return this;
    }

}
