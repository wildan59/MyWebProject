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
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils

<<<<<<< HEAD:Project Web/Kelompok_4/Scripts/Step Definition/Feature Offer Product/OFP002 - Offer Product with Login then Reject/Script1709265264419.groovy
=======
WebUI.callTestCase(findTestCase('Pages/Homepage/Click_Btn_Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Login/01. Seller/01. Login Success Seller'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Login/03. Verify User logged'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Homepage/Click_Btn_Jual'), [:], FailureHandling.STOP_ON_FAILURE)

String product = 'abcde'

String randomProductName = RandomStringUtils.randomAlphabetic(5)

WebUI.callTestCase(findTestCase('Pages/Add Product/Add Product From Homepage'), [('productName') : randomProductName, ('productPrice') : '100000'
        , ('productCategory') : 'Baju', ('description') : 'BajuXX'], FailureHandling.STOP_ON_FAILURE)

<<<<<<< HEAD:Project Web/Kelompok_4/Scripts/Step Definition/Feature Offer Product/OFP00 - Offer Product with Login then Reject/Script1709556670779.groovy
WebUI.callTestCase(findTestCase('Pages/Logout/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Homepage/Click_Btn_Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Login/02. Buyer/02. Login Success Buyer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Login/03. Verify User logged'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pages/Homepage/Search Product'), [('searchKey') : randomProductName], FailureHandling.STOP_ON_FAILURE)

>>>>>>> 0f3483565c1df23306c27d726338b40b9a2e1ed4:Project Web/Kelompok_4/Scripts/Step Definition/Feature Offer Product/OFP00 - Offer Product with Login then Reject/Script1709556670779.groovy
=======
>>>>>>> 0ac68a5a3c8a91359315f8a1373fe40328361797:Project Web/Kelompok_4/Scripts/Step Definition/Feature Offer Product/OFP000 - Add Prod (dummy)/Script1709563586518.groovy
