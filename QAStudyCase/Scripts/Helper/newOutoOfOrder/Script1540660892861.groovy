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

WebUI.waitForElementClickable(findTestObject('CalenderPage/newOutofOrderButton'), GlobalVariable.waitElementDuration)

WebUI.click(findTestObject('CalenderPage/newOutofOrderButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('CalenderPage/1stFloor103'), GlobalVariable.waitElementDuration)

WebUI.doubleClick(findTestObject('CalenderPage/1stFloor103'), FailureHandling.STOP_ON_FAILURE)

int x = WebUI.getElementLeftPosition(findTestObject('CalenderPage/1stFloor103'), FailureHandling.STOP_ON_FAILURE)

WebUI.clickOffset(findTestObject('CalenderPage/1stFloor103'), x + 150, x + 100)

WebUI.waitForElementClickable(findTestObject('CalenderPage/saveButton'), GlobalVariable.waitElementDuration)

WebDriver driver = DriverFactory.getWebDriver()

for (int i = 3; i < 8; i++) {
    WebElement element = driver.findElement(By.xpath(('((//div[@class=\'mtop\'])[1]//label)[' + i) + ']/input')).click()
}

WebUI.click(findTestObject('CalenderPage/saveButton'))

WebUI.delay(GlobalVariable.waitElementDuration)

