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

WebUI.waitForElementClickable(findTestObject('CalenderPage/newRezervationButton'), GlobalVariable.waitElementDuration)

WebUI.click(findTestObject('CalenderPage/newRezervationButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('CalenderPage/1stFloor103'), GlobalVariable.waitElementDuration)

WebUI.doubleClick(findTestObject('CalenderPage/1stFloor103'), FailureHandling.STOP_ON_FAILURE)

int x = WebUI.getElementLeftPosition(findTestObject('CalenderPage/1stFloor103'), FailureHandling.STOP_ON_FAILURE)

WebUI.clickOffset(findTestObject('CalenderPage/1stFloor103'), x + 150, x + 100)

WebUI.waitForElementVisible(findTestObject('CalenderPage/rezervationPopup/titleSelect'), GlobalVariable.waitElementDuration)

WebUI.selectOptionByLabel(findTestObject('CalenderPage/rezervationPopup/titleSelect'), 'Mrs', false)

WebUI.sendKeys(findTestObject('CalenderPage/rezervationPopup/cellNoInput'), '05348521123')

WebUI.sendKeys(findTestObject('CalenderPage/rezervationPopup/companyInput'), 'Test Company')

WebUI.sendKeys(findTestObject('CalenderPage/rezervationPopup/firstNameInput'), 'test')

WebUI.sendKeys(findTestObject('CalenderPage/rezervationPopup/lastNameInput'), 'user')

WebUI.sendKeys(findTestObject('CalenderPage/rezervationPopup/emailInput'), 'testuser@mail.com')

WebUI.selectOptionByLabel(findTestObject('CalenderPage/rezervationPopup/countrySelect'), 'Turkey (TR)', false)

WebUI.sendKeys(findTestObject('CalenderPage/rezervationPopup/commentTextArea'), 'test test test test')

WebUI.click(findTestObject('CalenderPage/rezervationPopup/okButton1'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('CalenderPage/rezervationPopup/okButton2'), GlobalVariable.waitElementDuration)

WebUI.click(findTestObject('CalenderPage/rezervationPopup/okButton2'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('CalenderPage/closeButton'), GlobalVariable.waitElementDuration)

WebUI.verifyElementText(findTestObject('CalenderPage/reservationSuccessfullPopup'), findTestData('SystemNotification').getValue(
        2, 1))

WebUI.click(findTestObject('CalenderPage/closeButton'), FailureHandling.STOP_ON_FAILURE)

