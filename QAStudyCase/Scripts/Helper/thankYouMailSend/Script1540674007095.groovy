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

WebUI.waitForElementClickable(findTestObject('Rezervations/sendButton'), GlobalVariable.waitElementDuration)

WebUI.click(findTestObject('Rezervations/sendButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementClickable(findTestObject('new-mail/thankYouButton'), GlobalVariable.waitElementDuration)

WebUI.click(findTestObject('new-mail/thankYouButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.waitPageLoad, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('new-mail/sendButton'), GlobalVariable.waitElementDuration)

WebUI.click(findTestObject('new-mail/sendButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('new-mail/sentSuccessfullBox'), GlobalVariable.waitElementDuration)

WebUI.verifyElementText(findTestObject('new-mail/sentSuccessfullBox'), findTestData('SystemNotification').getValue(2, 3))

