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

WebUI.doubleClick(findTestObject('Restricitons/floor_select'))

WebUI.setText(findTestObject('Restricitons/input_Min Stay_min'), '5')

WebUI.setText(findTestObject('Restricitons/input_Max Stay_max'), '10')

WebUI.click(findTestObject('Restricitons/button_Save'))

WebUI.waitForElementPresent(findTestObject('MainObjects/SuccessNotification'), GlobalVariable.waitElementDuration)

WebUI.verifyElementText(findTestObject('MainObjects/SuccessNotification'), findTestData('SystemNotification').getValue(2, 
        4))

WebUI.click(findTestObject('MainObjects/SuccessNotification'), FailureHandling.STOP_ON_FAILURE)

