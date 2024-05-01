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

WebUI.setText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/input_First Name_firstName'), 
    'a')

WebUI.setText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/input_Last Name_lastName'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/input_Last Name_lastName'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/td_a'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/input_Last Name_lastName'), 
    'a')

WebUI.setText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/input_Company_group'), '')

WebUI.click(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/input_Company_group'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/span_a a'), 'a a')

WebUI.setText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/input_Company_group'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/input_Job Title_job'), '')

WebUI.click(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/input_Job Title_job'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/span_a'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/input_Job Title_job'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/input_E-mail_email'), 'a@a.a')

WebUI.setText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/input_Work Phone_phoneNumber'), 
    '123456789')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/select_Exhibits Only (95.00)               _4b7ffa'), 
    '95', true)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/span_Exhibits Only (95.00)'), 
    'Exhibits Only ($95.00)')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/select_Exhibits Only (95.00)               _4b7ffa'), 
    '100', true)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/span_3 Session Pack (100.00)'), 
    '3 Session Pack ($100.00)')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/select_Exhibits Only (95.00)               _4b7ffa'), 
    '200', true)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/span_6 Session Pack (200.00)'), 
    '6 Session Pack ($200.00)')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/select_Exhibits Only (95.00)               _4b7ffa'), 
    '400', true)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/span_Session Pass (400.00)'), 
    'Session Pass ($400.00)')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/select_Exhibits Only (95.00)               _4b7ffa'), 
    '700', true)

WebUI.click(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/span_VIP Pass (700.00)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/span_VIP Pass (700.00)'), 
    'VIP Pass ($700.00)')

WebUI.setText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/input_VSLive Banquet (80 ea.)_banquetGuests'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/body_Memberships              Conferences  _f33b1e'))

WebUI.click(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/span_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/span_1'), '1')

WebUI.click(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/input_VSLive Media Pack (120)_mediaPack'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Registration Form/Page_Registration Form/span_yes'), 'yes')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://students.cs.ndsu.nodak.edu/~myronovy/cs419/register.html')

WebUI.closeBrowser()

