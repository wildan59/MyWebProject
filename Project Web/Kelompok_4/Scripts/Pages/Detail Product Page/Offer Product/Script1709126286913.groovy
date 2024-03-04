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

<<<<<<< HEAD
WebUI.verifyElementVisible(findTestObject('SecondHand Website/Detail Product Page/input_harga_tawar'))

WebUI.setText(findTestObject('SecondHand Website/Detail Product Page/input_harga_tawar'), '10000')
=======
WebUI.click(findTestObject('SecondHand Website/Detail Product Page/btn_Offer'))

WebUI.getAttribute(findTestObject('SecondHand Website/Detail Product Page/input_harga_tawar'), 'Harga Tawar')

WebUI.setText(findTestObject('SecondHand Website/Detail Product Page/Offer Price'), offerPrice)
>>>>>>> 0f3483565c1df23306c27d726338b40b9a2e1ed4

WebUI.click(findTestObject('SecondHand Website/Detail Product Page/btn_submit_offer'))

