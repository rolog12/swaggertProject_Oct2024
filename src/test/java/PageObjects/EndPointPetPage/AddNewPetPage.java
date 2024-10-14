package PageObjects.EndPointPetPage;

import PageObjects.BasePage.BasePage;
import TestBase.BaseTest;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AddNewPetPage extends BasePage {

    public AddNewPetPage(WebDriver driver) {
        super(driver);
    }

    //-------------WebElements--------------
    //---------------------------------------

    //Create new Pet section loc
    @FindBy(xpath = "//div[text()=\"Add a new pet to the store\"]")
    WebElement createNewPet_WebEL;
    // Expand/collapse Arrow in Add new Pet Section
    @FindBy(xpath = "//*[@id=\"operations-pet-addPet\"]/div[1]/button[3]")
    WebElement arrowinAddNewPet_WE;
    //Try it out Add New Pet WebElement
    @FindBy(xpath = "//button[@class=\"btn try-out__btn\"]")//div[@class="try-out btn-group"]/button[1]
    WebElement tryItOutBtnAddNewPet_WE;
    //Click on Request Body Third Option List
    @FindBy(xpath = "//select[@id=\"post_pet_requests_select\"]")//*[@id="post_pet_requests_select"]/option[1]
    WebElement option_3_requestBodyAddNewPet_WE;
    // id TextBox Add new Pet
    @FindBy(xpath = "//tr[@class=\"parameters\"]/td[2]/div/input[@placeholder=\"id\"]")
    WebElement idTextBoxAddNewPet_WE;
    // id TextBox Add new Pet
    @FindBy(xpath = "//tr[@class=\"parameters\"]/td[2]/div/input[@placeholder=\"name\"]")
    WebElement nameTextBoxAddNewPet_WE;
    //Click on execute to Create new Pet
    @FindBy(xpath = "//*[@id=\"operations-pet-addPet\"]/div[2]/div/div[3]/button[1]")
    WebElement executeBtnAddNewPet_WE;
    //Assert Server Response Code
    @FindBy(xpath = "//*[@id=\"operations-pet-addPet\"]/div[2]/div/div[4]/div[2]/div/div/table/tbody/tr/td[1]")
    WebElement codeRespAddNewPetAssert_WE;




    //Locators
    //----------------------------------
    // Create new Pet section loc
    By createNewPet_loc = By.xpath("*//div[text()=\"Add a new pet to the store\"]");
    //Arrow Add New Pet locator
    By arrowAddNewPet_Loc=By.xpath("//*[@id=\"operations-pet-addPet\"]/div[1]/button[3]");
    //Try it out Add New Pet Loc
    By tryItOutBtnAddNewPet_Loc=By.xpath("//button[@class=\"btn try-out__btn\"]");
    //Third option from Request Body List
    By requestBodyAddNewPet_3_Option_Loc=By.xpath("//select[@id=\"post_pet_requests_select\"]");//*[@id="post_pet_requests_select"]/option[1]//select//option[3]
    // id text box Add New Pet
    By idTextBoxAddNewPet_loc=By.xpath("//tr[@class=\"parameters\"]/td[2]/div/input[@placeholder=\"id\"]");
    //Name to Crate New Pet
    By nameTextBoxAddNewPet_loc=By.xpath("//tr[@class=\"parameters\"]/td[2]/div/input[@placeholder=\"name\"]");
    //Click on execute to Create new Pet
    By executeBtnAddNewPet_loc=By.xpath("//*[@id=\"operations-pet-addPet\"]/div[2]/div/div[3]/button[1]");
    //Assert Server Response Code
    By codeRespAddNewPetAssert_loc=By.xpath("//*[@id=\"operations-pet-addPet\"]/div[2]/div/div[4]/div[2]/div/div/table/tbody/tr/td[1]");


    // ----------------- END LOCATORS ----------------

    // Variable - Text - Numbers
    protected int timeToWait=5;
    String addNewPet_txt="Add a new pet to the store";
    protected String createPet_Text="11";
    //Name To Create New Pet
    String nameToCreateNewPet_Text = "Milo";
    String respCodeAddNewPet_txt="200";

    //--------- END VARIABLES -----------

    //Methods for Add New Pet - End Point
    public void timeToWait (int timeToWait,By Pet_Loc){
        new WebDriverWait(driver, Duration.ofSeconds(timeToWait)).
                until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Pet_Loc));
    }
    public void assertAddNewPetSection(){
        //Wait to load AddNewPetSection
        timeToWait(10,createNewPet_loc);
        //Validate Section is loaded
        Assert.assertEquals(createNewPet_WebEL.getText(),addNewPet_txt);
    }
    // Add New Pet Section
    public void clickOnArrowdAddNewPet (){
        //wait to Arrow Add New Pet is displayed
        timeToWait(10,arrowAddNewPet_Loc);
        //Click on Arrow
        arrowinAddNewPet_WE.sendKeys(Keys.ENTER);
    }
    // Try it out Btn
    public void tryItOutAddNewPet(){
        //wait to Try it out Btn is displayed
        timeToWait(10,tryItOutBtnAddNewPet_Loc);
        //Click on Try it out Btn
        tryItOutBtnAddNewPet_WE.sendKeys(Keys.ENTER);
    }
    // List Box - Request Body
    public void requestBodyList (){
        //wait to Request Body listBox is displayed
        timeToWait(10,requestBodyAddNewPet_3_Option_Loc);
        //Click to Select third option - Request Body
        Select dropdownList_ins=new Select(option_3_requestBodyAddNewPet_WE);
        dropdownList_ins.selectByIndex(2);
    }
    //Send Id and Name
    public void sendIdndNameToCreateNewPet (){
        //wait for id text box
        timeToWait(10,idTextBoxAddNewPet_loc);
        //send new id to add new pet - id
        idTextBoxAddNewPet_WE.clear();
        idTextBoxAddNewPet_WE.sendKeys(createPet_Text);
        //wait for NAME text box is displayed
        timeToWait(10,nameTextBoxAddNewPet_loc);
        //add new pet - name
        nameTextBoxAddNewPet_WE.clear();
        nameTextBoxAddNewPet_WE.sendKeys(nameToCreateNewPet_Text);
    }
    // Execute Button
    public void clickOnExecute (){
        //wait for Execute btn
        timeToWait(10,executeBtnAddNewPet_loc);
        //click on Execute
        executeBtnAddNewPet_WE.sendKeys(Keys.ENTER);
    }
    //Assert Response Code - Add New Pet
    public void assertResponseCode() {
        //Wait to load AddNewPetSection
        timeToWait(10,codeRespAddNewPetAssert_loc);
        //Validate Section is loaded
        Assert.assertEquals(codeRespAddNewPetAssert_WE.getText(),respCodeAddNewPet_txt);
    }
}
