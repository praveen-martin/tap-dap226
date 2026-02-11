package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class OpenCreateNewJobOpeningForPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "addJobOpeningButton")
    private WebElement addJobOpeningButton;
    @FindBy(id = "jobTitleField")
    private WebElement jobTitleField;
    @FindBy(id = "jobDescriptionField")
    private WebElement jobDescriptionField;
    @FindBy(id = "jobRequirementsField")
    private WebElement jobRequirementsField;
    @FindBy(id = "saveButton")
    private WebElement saveButton;
    @FindBy(id = "cancelButton")
    private WebElement cancelButton;
    @FindBy(id = "createNewJobOpeningForm")
    private WebElement createNewJobOpeningForm;

    public OpenCreateNewJobOpeningForPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToJobOpeningScreen() {
        // Implement navigation logic to Job Opening screen if required
    }

    public void locateAddJobOpeningButton() {
        try {
            elementUtils.isElementDisplayed(addJobOpeningButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksAddJobOpeningButton() {
        try {
            elementUtils.clickElement(addJobOpeningButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isCreateNewJobOpeningFormDisplayed() {
        try {
            return elementUtils.isElementDisplayed(createNewJobOpeningForm);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void fillInJobTitleField(String jobTitle) {
        try {
            elementUtils.clearAndSendKeys(jobTitleField, jobTitle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInJobDescriptionField(String jobDescription) {
        try {
            elementUtils.clearAndSendKeys(jobDescriptionField, jobDescription);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInJobRequirementsField(String jobRequirements) {
        try {
            elementUtils.clearAndSendKeys(jobRequirementsField, jobRequirements);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSaveButtonEnabled() {
        try {
            return saveButton.isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isCancelButtonEnabled() {
        try {
            return cancelButton.isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clicksSaveButton() {
        try {
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksCancelButton() {
        try {
            elementUtils.clickElement(cancelButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveJobTitleFieldEmpty() {
        try {
            elementUtils.clearElement(jobTitleField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveJobDescriptionFieldEmpty() {
        try {
            elementUtils.clearElement(jobDescriptionField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveJobRequirementsFieldEmpty() {
        try {
            elementUtils.clearElement(jobRequirementsField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getJobTitleFieldValue() {
        try {
            return elementUtils.getElementText(jobTitleField);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getJobRequirementsFieldValue() {
        try {
            return elementUtils.getElementText(jobRequirementsField);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public boolean isJobTitleValidationMessageDisplayed() {
        // Implement validation message check for job title
        return false;
    }

    public boolean isJobDescriptionValidationMessageDisplayed() {
        // Implement validation message check for job description
        return false;
    }

    public boolean isJobRequirementsValidationMessageDisplayed() {
        // Implement validation message check for job requirements
        return false;
    }

    public boolean isFormSavedSuccessfully() {
        // Implement logic to check if form is saved successfully
        return false;
    }

    public boolean isJobOpeningCreatedWithSpecialCharactersInTitle() {
        // Implement logic to verify job opening with special characters
        return false;
    }

    public boolean isJobOpeningCreatedWithNumericValuesInRequirements() {
        // Implement logic to verify job opening with numeric values
        return false;
    }

    public boolean isJobOpeningCreatedWithAllRequirementsListed() {
        // Implement logic to verify all requirements listed
        return false;
    }

    public boolean isJobOpeningCreatedWithOptionalFieldsEmpty() {
        // Implement logic to verify job opening with optional fields empty
        return false;
    }

    public boolean isJobOpeningCreatedWithSpecialCharactersInDescription() {
        // Implement logic to verify job opening with special characters in description
        return false;
    }

    public boolean isJobOpeningCreatedWithTrimmedTitle() {
        // Implement logic to verify job title is trimmed
        return false;
    }

    public boolean isJobOpeningCreatedWithRenderedHTMLTags() {
        // Implement logic to verify job opening with rendered HTML tags
        return false;
    }

    public boolean isJobOpeningCreatedWithEmailFormatInDescription() {
        // Implement logic to verify job opening with email format in description
        return false;
    }

    public boolean isJobTitleTooShortErrorDisplayed() {
        // Implement logic to verify job title too short error
        return false;
    }

    public boolean isJobDescriptionExceedsCharacterLimitErrorDisplayed() {
        // Implement logic to verify job description exceeds character limit error
        return false;
    }

    public boolean isJobTitleAlreadyExistsErrorDisplayed() {
        // Implement logic to verify job title already exists error
        return false;
    }

    public boolean isInvalidCharactersInJobTitleErrorDisplayed() {
        // Implement logic to verify invalid characters in job title error
        return false;
    }

    public boolean isJobTitleExceedsCharacterLimitErrorDisplayed() {
        // Implement logic to verify job title exceeds character limit error
        return false;
    }

    public boolean isJobRequirementsExceedsCharacterLimitErrorDisplayed() {
        // Implement logic to verify job requirements exceed character limit error
        return false;
    }

    public boolean areAllRequiredFieldValidationMessagesDisplayed() {
        // Implement logic to check all required field validation messages
        return false;
    }

    public void areSaveAndCancelButtonsDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(saveButton), "Save button is not displayed!");
            Assert.assertTrue(elementUtils.isElementDisplayed(cancelButton), "Cancel button is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInDescription(String description) {
        try {
            elementUtils.clearAndSendKeys(jobDescriptionField, description);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInDescriptionWithMaxLimit(String description) {
        try {
            String trimmedDescription = description.length() > 255 ? description.substring(0, 255) : description;
            elementUtils.clearAndSendKeys(jobDescriptionField, trimmedDescription);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areFieldsPresent() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(jobTitleField), "Job Title field is not present!");
            Assert.assertTrue(elementUtils.isElementDisplayed(jobRequirementsField), "Job Requirements field is not present!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isJobOpeningCreated() {
        try {
            String currentUrl = driver.getCurrentUrl();
            Assert.assertEquals(currentUrl, "http://localhost/jobOpeningCreated", "Job opening was not created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInJobRequirementsWithMaxLimit(String jobRequirements) {
        try {
            String trimmedRequirements = jobRequirements.length() > 500 ? jobRequirements.substring(0, 500) : jobRequirements;
            elementUtils.clearAndSendKeys(jobRequirementsField, trimmedRequirements);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillInJobRequirementsWithValidData(String jobRequirements) {
        try {
            elementUtils.clearAndSendKeys(jobRequirementsField, jobRequirements);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveAllFieldsEmpty() {
        try {
            elementUtils.clearAndSendKeys(jobTitleField, "");
            elementUtils.clearAndSendKeys(jobDescriptionField, "");
            elementUtils.clearAndSendKeys(jobRequirementsField, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isOnJobOpeningScreen() {
        try {
            String currentUrl = driver.getCurrentUrl();
            Assert.assertEquals(currentUrl, "http://localhost/jobOpeningScreen", "Not on the Job Opening screen!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}