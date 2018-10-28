import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By

try {
    WebDriver driver = DriverFactory.getWebDriver()

    while (true) {
        By element = By.xpath('(//div[contains(@class, \'cal-event\')]//div[contains(@id, \'content\') and not(contains(@title, \'ZAPPELLA Andrew\'))])[1]')

        WebUI.delay(GlobalVariable.waitElementDuration)

        if (driver.findElement(element).isDisplayed()) {
            CustomKeywords.'basePackage.BaseClass.waitElementClickable'(driver.findElement(element), GlobalVariable.waitElementDuration)

            driver.findElement(element).click()

            WebUI.waitForElementClickable(findTestObject('CalenderPage/rezervationDetails'), GlobalVariable.waitElementDuration)

            WebUI.click(findTestObject('CalenderPage/rezervationDetails'), FailureHandling.STOP_ON_FAILURE)

            WebUI.delay(3)

            WebUI.waitForElementClickable(findTestObject('Rezervations/deleteButton'), GlobalVariable.waitElementDuration)

            WebUI.click(findTestObject('Rezervations/deleteButton'), FailureHandling.STOP_ON_FAILURE)

            WebUI.delay(3)

            WebUI.waitForElementClickable(findTestObject('Rezervations/deleteRezervationYesButton'), GlobalVariable.waitElementDuration)

            WebUI.click(findTestObject('Rezervations/deleteRezervationYesButton'), FailureHandling.STOP_ON_FAILURE)

            WebUI.delay(3)

            WebUI.waitForElementClickable(findTestObject('Rezervations/saveButton'), GlobalVariable.waitElementDuration)

            WebUI.click(findTestObject('Rezervations/saveButton'), FailureHandling.STOP_ON_FAILURE)

            WebUI.delay(2)

            WebUI.navigateToUrl(findTestData('Links').getValue(2, 2))

            WebUI.acceptAlert()

            WebUI.refresh()
        } else {
            WebUI.navigateToUrl(findTestData('Links').getValue(2, 2))

            WebUI.acceptAlert()

            WebUI.refresh()

            break
        }
    }
}
catch (Exception e) {
} 

