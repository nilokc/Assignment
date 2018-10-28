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

WebUI.waitForElementClickable(findTestObject('Rezervations/quickInvoiceButton'), GlobalVariable.waitElementDuration)

WebUI.click(findTestObject('Rezervations/quickInvoiceButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Rezervations/QuickInvoice/commentTextArea'), GlobalVariable.waitElementDuration)

WebUI.sendKeys(findTestObject('Rezervations/QuickInvoice/commentTextArea'), 'Test Comment')

WebUI.sendKeys(findTestObject('Rezervations/QuickInvoice/recipientTaxNumberInput'), '123456')

WebUI.waitForElementClickable(findTestObject('Rezervations/QuickInvoice/printCheckBox'), GlobalVariable.waitElementDuration)

WebUI.click(findTestObject('Rezervations/QuickInvoice/printCheckBox'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Rezervations/QuickInvoice/createInvoiceButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

