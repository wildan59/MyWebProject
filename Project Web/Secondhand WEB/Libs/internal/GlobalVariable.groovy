package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object SecondHand_Url
     
    /**
     * <p></p>
     */
    public static Object ValidUser_Seller
     
    /**
     * <p></p>
     */
    public static Object InvalidUser_Seller
     
    /**
     * <p></p>
     */
    public static Object ValidPassword_Seller
     
    /**
     * <p></p>
     */
    public static Object InvalidPassword_Seller
     
    /**
     * <p></p>
     */
    public static Object ValidUser_Buyer
     
    /**
     * <p></p>
     */
    public static Object InvalidUser_Buyer
     
    /**
     * <p></p>
     */
    public static Object ValidPassword_Buyer
     
    /**
     * <p></p>
     */
    public static Object InvalidPassword_Buyer
     
    /**
     * <p>Profile default : Not Complete Profile</p>
     */
    public static Object validUser
     
    /**
     * <p>Profile default : Not Complete Profile</p>
     */
    public static Object validPassword
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            SecondHand_Url = selectedVariables['SecondHand_Url']
            ValidUser_Seller = selectedVariables['ValidUser_Seller']
            InvalidUser_Seller = selectedVariables['InvalidUser_Seller']
            ValidPassword_Seller = selectedVariables['ValidPassword_Seller']
            InvalidPassword_Seller = selectedVariables['InvalidPassword_Seller']
            ValidUser_Buyer = selectedVariables['ValidUser_Buyer']
            InvalidUser_Buyer = selectedVariables['InvalidUser_Buyer']
            ValidPassword_Buyer = selectedVariables['ValidPassword_Buyer']
            InvalidPassword_Buyer = selectedVariables['InvalidPassword_Buyer']
            validUser = selectedVariables['validUser']
            validPassword = selectedVariables['validPassword']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
