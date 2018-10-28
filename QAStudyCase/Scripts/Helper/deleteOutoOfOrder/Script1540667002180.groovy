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

    List<WebElement> calEvents = driver.findElements(By.xpath('//div[contains(@class, \'cal-unavail\')]/div[@class=\'cal-event-title\']'))

    while (true) {
        WebElement calEvent = driver.findElement(By.xpath('(//div[contains(@class, \'cal-unavail\')]/div[@class=\'cal-event-title\'])[1]'))

        CustomKeywords.'basePackage.BaseClass.waitElementClickable'(calEvent, 5)

        calEvent.click()

        WebUI.waitForElementClickable(findTestObject('CalenderPage/eventDeleteButton'), GlobalVariable.waitElementDuration)

        WebUI.click(findTestObject('CalenderPage/eventDeleteButton'))

        WebUI.waitForElementClickable(findTestObject('MainObjects/SuccessNotification'), GlobalVariable.waitElementDuration)

        WebUI.verifyElementText(findTestObject('MainObjects/SuccessNotification'), findTestData('SystemNotification').getValue(
                2, 2))

        WebUI.click(findTestObject('MainObjects/SuccessNotification'), FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(GlobalVariable.waitElementDuration, FailureHandling.STOP_ON_FAILURE)

        try {
            WebElement calEvent2 = driver.findElement(By.xpath('(//div[contains(@class, \'cal-unavail\')]/div[@class=\'cal-event-title\'])[1]'))
        }
        catch (Exception e) {
            break
        } 
    }
}
catch (Exception e) {
} 

