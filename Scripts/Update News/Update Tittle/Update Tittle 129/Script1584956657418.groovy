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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/CodeIgniterCRUD/index.php/news/')

WebUI.click(findTestObject('Page_CodeIgniter Tutorial/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_CodeIgniter Tutorial/input_Title_title'), 'Apart from counting words and characters, our online editor can help you to improve word choice and writing style, and, optionals')

WebUI.setText(findTestObject('Object Repository/Page_CodeIgniter Tutorial/textarea_Text_text'), 'T')

WebUI.click(findTestObject('Page_CodeIgniter Tutorial/input_Lorem Ipsum is simply dummy text_submit'))

halamantujuan = WebUI.getUrl()

WebUI.verifyMatch('halamantujuan', 'http://[::1]/CodeIgniterCRUD/index.php/news/edit/', false)

WebUI.closeBrowser()
