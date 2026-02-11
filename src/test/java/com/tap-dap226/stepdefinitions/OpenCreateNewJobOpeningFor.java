package com.tap-dap226.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.tap-dap226.pages.OpenCreateNewJobOpeningForPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class OpenCreateNewJobOpeningFor extends DriverFactory {
OpenCreateNewJobOpeningForPage openCreateNewJobOpeningForPage = new OpenCreateNewJobOpeningForPage(driver);
@Given("the user is on the Job Opening screen")
public void the_user_is_on_the_job_opening_screen() {
openCreateNewJobOpeningForPage.navigateToJobOpeningScreen();
}
@When("the user locates the Add Job Opening button")
public void the_user_locates_the_add_job_opening_button() {
openCreateNewJobOpeningForPage.locateAddJobOpeningButton();
}
@When("the user clicks on the Add Job Opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
openCreateNewJobOpeningForPage.clicksAddJobOpeningButton();
}
@Then("the Create New Job Opening form is displayed")
public void the_create_new_job_opening_form_is_displayed() {
openCreateNewJobOpeningForPage.isCreateNewJobOpeningFormDisplayed();
}
@And("the form contains fields for job title, description, requirements, and other relevant information")
public void the_form_contains_fields_for_job_title_description_requirements_and_other_relevant_information() {
openCreateNewJobOpeningForPage.areFieldsPresent();
}
@And("the form displays Save and Cancel buttons")
public void the_form_displays_save_and_cancel_buttons() {
openCreateNewJobOpeningForPage.areSaveAndCancelButtonsDisplayed();
}
@When("I fill in the job title field with {string}")
public void i_fill_in_the_job_title_field_with(String job_title) {
openCreateNewJobOpeningForPage.fillInJobTitleField(job_title);
}
@When("I fill in the job description field with {string}")
public void i_fill_in_the_job_description_field_with(String job_description) {
openCreateNewJobOpeningForPage.fillInJobDescriptionField(job_description);
}
@When("I fill in the job requirements field with {string}")
public void i_fill_in_the_job_requirements_field_with(String job_requirements) {
openCreateNewJobOpeningForPage.fillInJobRequirementsField(job_requirements);
}
@Then("the Save button should be enabled")
public void the_save_button_should_be_enabled() {
openCreateNewJobOpeningForPage.isSaveButtonEnabled();
}
@And("the Cancel button should remain enabled")
public void the_cancel_button_should_remain_enabled() {
openCreateNewJobOpeningForPage.isCancelButtonEnabled();
}
@When("the user clicks on the Cancel button in the Create New Job Opening form")
public void the_user_clicks_on_the_cancel_button_in_the_create_new_job_opening_form() {
openCreateNewJobOpeningForPage.clicksCancelButton();
}
@Then("the Create New Job Opening form is closed")
public void the_create_new_job_opening_form_is_closed() {
openCreateNewJobOpeningForPage.isCreateNewJobOpeningFormDisplayed();
}
@Then("the user is returned to the Job Opening screen")
public void the_user_is_returned_to_the_job_opening_screen() {
openCreateNewJobOpeningForPage.isOnJobOpeningScreen();
}
@When("the user leaves the job title field empty")
public void the_user_leaves_the_job_title_field_empty() {
openCreateNewJobOpeningForPage.leaveJobTitleFieldEmpty();
}
@When("the user leaves the job description field empty")
public void the_user_leaves_the_job_description_field_empty() {
openCreateNewJobOpeningForPage.leaveJobDescriptionFieldEmpty();
}
@When("the user leaves the job requirements field empty")
public void the_user_leaves_the_job_requirements_field_empty() {
openCreateNewJobOpeningForPage.leaveJobRequirementsFieldEmpty();
}
@When("the user clicks the Save button")
public void the_user_clicks_the_save_button() {
openCreateNewJobOpeningForPage.clicksSaveButton();
}
@Then("validation messages should be displayed for the empty job title field")
public void validation_messages_should_be_displayed_for_the_empty_job_title_field() {
openCreateNewJobOpeningForPage.isJobTitleValidationMessageDisplayed();
}
@Then("validation messages should be displayed for the empty job description field")
public void validation_messages_should_be_displayed_for_the_empty_job_description_field() {
openCreateNewJobOpeningForPage.isJobDescriptionValidationMessageDisplayed();
}
@Then("validation messages should be displayed for the empty job requirements field")
public void validation_messages_should_be_displayed_for_the_empty_job_requirements_field() {
openCreateNewJobOpeningForPage.isJobRequirementsValidationMessageDisplayed();
}
@Then("the Save button should remain disabled")
public void the_save_button_should_remain_disabled() {
openCreateNewJobOpeningForPage.isSaveButtonEnabled();
}
@When("I leave the job description field empty")
public void i_leave_the_job_description_field_empty() {
openCreateNewJobOpeningForPage.leaveJobDescriptionFieldEmpty();
}
@Then("the job title field should retain the value {string}")
public void the_job_title_field_should_retain_the_value(String job_title) {
Assert.assertEquals(job_title, openCreateNewJobOpeningForPage.getJobTitleFieldValue());
}
@Then("the job requirements field should retain the value {string}")
public void the_job_requirements_field_should_retain_the_value(String job_requirements) {
Assert.assertEquals(job_requirements, openCreateNewJobOpeningForPage.getJobRequirementsFieldValue());
}
@Given("the user enters the job title {string}")
public void the_user_enters_the_job_title(String job_title) {
openCreateNewJobOpeningForPage.fillInJobTitleField(job_title);
}
@Given("the user fills in the job description {string}")
public void the_user_fills_in_the_job_description(String job_description) {
openCreateNewJobOpeningForPage.fillInJobDescriptionField(job_description);
}
@Given("the user fills in the requirements {string}")
public void the_user_fills_in_the_requirements(String requirements) {
openCreateNewJobOpeningForPage.fillInJobRequirementsField(requirements);
}
@Then("the form saves successfully without any validation errors")
public void the_form_saves_successfully_without_any_validation_errors() {
openCreateNewJobOpeningForPage.isFormSavedSuccessfully();
}
@Then("the job opening is created with the special characters in the title")
public void the_job_opening_is_created_with_the_special_characters_in_the_title() {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithSpecialCharactersInTitle();
}
@Then("the job opening is created with numeric values in the requirements")
public void the_job_opening_is_created_with_numeric_values_in_the_requirements() {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithNumericValuesInRequirements();
}
@Then("the job opening is created with all job requirements listed")
public void the_job_opening_is_created_with_all_job_requirements_listed() {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithAllRequirementsListed();
}
@Then("the job opening is created with the optional fields left empty")
public void the_job_opening_is_created_with_the_optional_fields_left_empty() {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithOptionalFieldsEmpty();
}
@Then("the job opening is created with special characters in the description")
public void the_job_opening_is_created_with_special_characters_in_the_description() {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithSpecialCharactersInDescription();
}
@Then("the job opening is created with the job title trimmed of whitespace")
public void the_job_opening_is_created_with_the_job_title_trimmed_of_whitespace() {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithTrimmedTitle();
}
@Then("the job opening should be created with the HTML tags rendered correctly")
public void the_job_opening_should_be_created_with_the_html_tags_rendered_correctly() {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithRenderedHTMLTags();
}
@Then("the job opening is created with the email format included in the description")
public void the_job_opening_is_created_with_the_email_format_included_in_the_description() {
openCreateNewJobOpeningForPage.isJobOpeningCreatedWithEmailFormatInDescription();
}
@Then("the Save button is disabled")
public void the_save_button_is_disabled() {
openCreateNewJobOpeningForPage.isSaveButtonEnabled();
}
@Then("an error message should be displayed indicating the job title is too short")
public void an_error_message_should_be_displayed_indicating_the_job_title_is_too_short() {
openCreateNewJobOpeningForPage.isJobTitleTooShortErrorDisplayed();
}
@Then("an error message should be displayed indicating that the job description exceeds the character limit")
public void an_error_message_should_be_displayed_indicating_that_the_job_description_exceeds_the_character_limit() {
openCreateNewJobOpeningForPage.isJobDescriptionExceedsCharacterLimitErrorDisplayed();
}
@Then("an error message is displayed indicating the job title already exists")
public void an_error_message_is_displayed_indicating_the_job_title_already_exists() {
openCreateNewJobOpeningForPage.isJobTitleAlreadyExistsErrorDisplayed();
}
@Then("an error message should be displayed indicating invalid characters in the job title")
public void an_error_message_should_be_displayed_indicating_invalid_characters_in_the_job_title() {
openCreateNewJobOpeningForPage.isInvalidCharactersInJobTitleErrorDisplayed();
}
@Then("an error message should be displayed indicating the job title exceeds the character limit")
public void an_error_message_should_be_displayed_indicating_the_job_title_exceeds_the_character_limit() {
openCreateNewJobOpeningForPage.isJobTitleExceedsCharacterLimitErrorDisplayed();
}
@Then("an error message should be displayed indicating the job requirements exceed the character limit")
public void an_error_message_should_be_displayed_indicating_the_job_requirements_exceed_the_character_limit() {
openCreateNewJobOpeningForPage.isJobRequirementsExceedsCharacterLimitErrorDisplayed();
}
@Then("validation messages are displayed for all required fields")
public void validation_messages_are_displayed_for_all_required_fields() {
openCreateNewJobOpeningForPage.areAllRequiredFieldValidationMessagesDisplayed();
}

@Given("the user has filled in the job title {string}")
public void theUserHasFilledInTheJobTitle(String jobTitle) {
jobOpeningPage.fillInJobTitle(jobTitle);
}
@When("i enter the job title {string}")
public void iEnterTheJobTitle(String jobTitle) {
jobOpeningPage.fillInJobTitle(jobTitle);
}
@When("i leave the salary field empty")
public void iLeaveTheSalaryFieldEmpty() {
jobOpeningPage.leaveSalaryFieldEmpty();
}
@When("i fill in the description with {string}")
public void iFillInTheDescriptionWith(String description) {
jobOpeningPage.fillInDescription(description);
}
@When("i fill in the job requirements with {string}")
public void iFillInTheJobRequirementsWith(String requirements) {
jobOpeningPage.fillInJobRequirements(requirements);
}
@When("the user fills in the job title with {string}")
public void theUserFillsInTheJobTitleWith(String jobTitle) {
jobOpeningPage.fillInJobTitle(jobTitle);
}
@When("the user has entered the requirements {string}")
public void theUserHasEnteredTheRequirements(String requirements) {
jobOpeningPage.fillInJobRequirements(requirements);
}
@When("the admin fills in the requirements with {string}")
public void theAdminFillsInTheRequirementsWith(String requirements) {
jobOpeningPage.fillInJobRequirements(requirements);
}
@When("the admin clicks the save button")
public void theAdminClicksTheSaveButton() {
jobOpeningPage.clickSaveButton();
}
@When("the user enters {string} in the job requirements field")
public void theUserEntersInTheJobRequirementsField(String requirements) {
jobOpeningPage.fillInJobRequirements(requirements);
}
@When("the user enters job requirements that meet the maximum character limit")
public void theUserEntersJobRequirementsThatMeetTheMaximumCharacterLimit() {
jobOpeningPage.fillInJobRequirementsWithMaxLimit();
}
@When("i clickElement the save button")
public void iClickTheSaveButton() {
jobOpeningPage.clickSaveButton();
}
@When("i fill in the requirements {string}")
public void iFillInTheRequirements(String requirements) {
jobOpeningPage.fillInJobRequirements(requirements);
}
@Then("the job opening is created with all fields populated to their maximum limits")
public void theJobOpeningIsCreatedWithAllFieldsPopulatedToTheirMaximumLimits() {
jobOpeningPage.isJobOpeningCreated();
}
@When("the user enters a job description that meets the maximum character limit")
public void theUserEntersAJobDescriptionThatMeetsTheMaximumCharacterLimit() {
jobOpeningPage.fillInDescriptionWithMaxLimit();
}
@Then("the cancel button remains enabled")
public void theCancelButtonRemainsEnabled() {
jobOpeningPage.isCancelButtonEnabled();
}
@When("i leave the location field empty")
public void iLeaveTheLocationFieldEmpty() {
jobOpeningPage.leaveLocationFieldEmpty();
}
@When("i enter job description {string}")
public void iEnterJobDescription(String description) {
jobOpeningPage.fillInDescription(description);
}
@When("the user fills in the job description with {string}")
public void theUserFillsInTheJobDescriptionWith(String description) {
jobOpeningPage.fillInDescription(description);
}
@When("the user fills in the requirements with valid data")
public void theUserFillsInTheRequirementsWithValidData() {
jobOpeningPage.fillInJobRequirementsWithValidData();
}
@When("the admin fills in the job title {string}")
public void theAdminFillsInTheJobTitle(String jobTitle) {
jobOpeningPage.fillInJobTitle(jobTitle);
}
@Then("the save button remains disabled")
public void theSaveButtonRemainsDisabled() {
jobOpeningPage.isSaveButtonEnabled();
}
@When("the user leaves all fields empty")
public void theUserLeavesAllFieldsEmpty() {
jobOpeningPage.leaveAllFieldsEmpty();
}
}