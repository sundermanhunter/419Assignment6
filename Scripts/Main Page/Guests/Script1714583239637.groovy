import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://students.cs.ndsu.nodak.edu/~myronovy/cs419/register.html')

WebUI.setText(findTestObject('Object Repository/Page_Registration Form/input_VSLive Banquet (80 ea.)_banquetGuests'), '1')

WebUI.click(findTestObject('Object Repository/Page_Registration Form/body_Memberships              Conferences  _f33b1e'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Registration Form/td_1'), '1')

WebUI.click(findTestObject('Object Repository/Page_Registration Form/span_70.00'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Registration Form/span_70.00'), '$70.00')

WebUI.setText(findTestObject('Object Repository/Page_Registration Form/input_VSLive Banquet (80 ea.)_banquetGuests'), '10')

WebUI.click(findTestObject('Object Repository/Page_Registration Form/body_Memberships              Conferences  _f33b1e_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Registration Form/td_10'), '10')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Registration Form/span_700.00'), '$700.00')

WebUI.setText(findTestObject('Object Repository/Page_Registration Form/input_VSLive Banquet (80 ea.)_banquetGuests'), '11')

WebUI.click(findTestObject('Object Repository/Page_Registration Form/body_Memberships              Conferences  _f33b1e_1_2'))

WebUI.setText(findTestObject('Object Repository/Page_Registration Form/input_VSLive Banquet (80 ea.)_banquetGuests'), '-1')

WebUI.click(findTestObject('Object Repository/Page_Registration Form/body_Memberships              Conferences  _f33b1e_1_2_3'))

WebUI.closeBrowser()

