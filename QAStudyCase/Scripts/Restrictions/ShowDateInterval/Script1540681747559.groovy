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

WebUI.callTestCase(findTestCase('Base7Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Helper/SettingsAccommodationsRestrictionsPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Helper/RestrictionSelectRoomMinMax'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Helper/DeleteRestrictionSelectRoomMinMax'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Restrictions - base7/button_Reset to default'))

WebUI.waitForElementPresent(findTestObject('MainObjects/SuccessNotification'), GlobalVariable.waitElementDuration)

WebUI.verifyElementText(findTestObject('MainObjects/SuccessNotification'), findTestData('SystemNotification').getValue(2, 
        5))

WebUI.click(findTestObject('MainObjects/SuccessNotification'))

