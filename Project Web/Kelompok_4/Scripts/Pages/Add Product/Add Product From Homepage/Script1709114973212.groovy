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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils

WebUI.setText(findTestObject('SecondHand Website/Add Product/input_field_namaProduk'), productName)

WebUI.setText(findTestObject('SecondHand Website/Add Product/input_field_hargaProduk'), productPrice)

WebUI.selectOptionByLabel(findTestObject('SecondHand Website/Add Product/select_Pilih Kategori'), productCategory, false)

WebUI.setText(findTestObject('SecondHand Website/Add Product/input_field_deskripsi'), description)

imgDir = (RunConfiguration.getProjectDir() + '/ImageUpload/product.jpg')

WebUI.uploadFile(findTestObject('SecondHand Website/Add Product/uplaod_image_product'), imgDir)

WebUI.click(findTestObject('SecondHand Website/Add Product/btn_Terbitkan'), FailureHandling.STOP_ON_FAILURE)

