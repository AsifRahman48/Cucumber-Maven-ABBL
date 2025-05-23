package objectRepository;

import org.openqa.selenium.By;

public class PG004_FundTransfer {

    public static By navBarFundTransfer = By.xpath("//span[text()=' Fund Transfer ']");
    public static By navBarOwnFundTransfer = By.xpath("//span[contains(text(),'Own Account')]");
    public static By navBarWithinFundTransfer = By.xpath("//span[contains(text(),'Within Bank Account')]");
    public static By navBarOtherFundTransfer = By.xpath("//span[contains(text(),'Other Bank Account')]");

    public static By fundTransferTitle = By.xpath("//h1[contains(text(),'Fund Transfer')]");
    public static By continueWithFavourite = By.xpath("//h1[contains(text(),'Continue With Favourite')]");
    public static By ownAccountSearchField = By.xpath("//body[1]/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[2]/div[2]/input[1]");
    public static By withinBeneficiarySearchField = By.xpath("//body[1]/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-other[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[2]/div[2]/input[1]");
    public static By continueWithoutBeneficiaryBtn = By.xpath("//h1[contains(text(),'Continue without Beneficiary')]");

    public static By ownAccountListFirstAccount = By.xpath("//body/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/button[1]");
    public static By ownAccountListSecondAccount = By.xpath("//body/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/button[1]");

    public static By transferDetailsScreenTitle = By.xpath("//h1[contains(text(),'Transfer Details')]");
    public static By ownTransferDetailsToAccount = By.xpath("//body/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own-details[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]");
    public static By withinTransferDetailsToAccountField = By.xpath("//input[@placeholder='Enter To Account']");
    public static By ownTransferDetailsAvailableBalance = By.xpath("//body[1]/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own-details[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");
    public static By withinTransferDetailsAvailableBalance = By.xpath("//body[1]/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-within-bank-without-beneficiary[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");

    public static By transferDetailsTransferAmount = By.xpath("//input[@placeholder='Enter Transfer Amount']");
    public static By transferDetailsTransferAmountSlab = By.xpath("//input[@placeholder='Enter Transfer Amount']");
    public static By transferDetailsRemarks = By.xpath("//input[@placeholder='Remarks']");
    public static By ownTransferDetailsServiceCharge = By.xpath("//body[1]/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own-details[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");
    public static By ownTransferDetailsGrantTotal = By.xpath("//body[1]/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own-details[1]/div[1]/div[1]/form[1]/div[1]/div[7]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");
    public static By transferDetailsNextButton = By.xpath("//button[contains(text(),'Next')]");
    public static By transferDetailsCancelButton = By.xpath("//button[contains(text(),'Cancel')]");
    public static By transferDetailsToastContainer = By.xpath("//div[@id='toast-container']");

    public static By fundTransferReviewPageTitle = By.xpath("//h1[contains(text(),'Transfer Details Review')]");
    public static By ownFundTransferTransferType = By.xpath("//li[contains(text(),'Own Account')]");
    public static By fundTransferAuthenticationTypeSMS = By.xpath("//label[contains(text(),'SMS')]");
    public static By fundTransferAuthenticationTypeEmail = By.xpath("//label[contains(text(),'Email')]");
    public static By fundTransferTermsAndConditionLink = By.xpath("//span[contains(text(),'Terms & Conditions')]");
    public static By ownFundTransferTermsAndConditionCheckbox = By.xpath("//body[1]/app-root[1]/layout[1]/classy-layout[1]/div[1]/div[2]/app-bank-account-own-details[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/mat-checkbox[1]/div[1]/div[1]/input[1]");
    public static By withinFundTransferTermsAndConditionCheckbox = By.xpath("//input[@type='checkbox']");

    public static By fundTransferTermsAndConditionDialogue = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]");

    public static By fundTransferOTPInput = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-otp-dialog-fund-transfer[1]/div[1]/div[1]/code-input[1]/span[1]/input[1]");
    public static By fundTransferResendOTP = By.xpath("//strong[contains(text(),'Resend OTP')]");
    public static By fundTransferOTPInputNext = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-otp-dialog-fund-transfer[1]/div[2]/div[1]/button[2]");
    public static By fundTransferOTPInputCancel = By.xpath("//body/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-otp-dialog-fund-transfer[1]/div[2]/div[1]/button[1]");

    public static By ownFundTransferSuccessScreenTransferType = By.xpath("//body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-otp-dialog-fund-transfer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[1]/li[2]");
    public static By ownFundTransferTransactionID = By.xpath("//body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/div[1]/app-otp-dialog-fund-transfer[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[2]/li[2]");

    public static By fundTransferGoToHome = By.xpath("//button[contains(text(),'Go to Home')]");

    public static By fundTransferAddToFavourite = By.xpath("//button[contains(text(),'Add to Favourite')]");

    public static By fundTransferDownloadReceipt = By.xpath("//button[contains(text(),'Download Receipt')]");

    public static By fundTransferAddFavouriteTitle = By.xpath("//h2[contains(text(),'Add Favourite')]");
    public static By fundTransferAddFavouriteSubTitle = By.xpath("//p[contains(text(),'Enter the name of your favourite:')]");
    public static By fundTransferAddFavouriteInputField = By.xpath("//*[@id=\"mat-mdc-dialog-1\"]/div/div/mat-dialog-content/input");
    public static By fundTransferAddFavouriteSaveButton = By.xpath("//button[contains(text(),'Save')]");

    public static By fundTransferAddFavouriteToast = By.xpath("//div[@id='toast-container']");

}
