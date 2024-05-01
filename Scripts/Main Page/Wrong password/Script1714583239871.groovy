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

WebUI.navigateToUrl('http://students.cs.ndsu.nodak.edu/~myronovy/cs419/result.html')

WebUI.click(findTestObject('Object Repository/Page_Result Form/input_TOTAL_regSubmit'))

WebUI.setText(findTestObject('Object Repository/Page_Result Form/input_E-mail_useremail'), 'billybob@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Result Form/input_Password_password'), 'J7R4ejOak4Y=')

WebUI.click(findTestObject('Object Repository/Page_Result Form/input_TOTAL_regSubmit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Result Form/label_Password'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Result Form/input_Password_password'), 'dKAUOd4pLBWqYpNH/McKjw==')

WebUI.click(findTestObject('Object Repository/Page_Result Form/input_TOTAL_regSubmit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Result Form/label_Card Holder'), 0)

WebUI.closeBrowser()

