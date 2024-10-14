package PageObjects.EndPointPetPage;

import PageObjects.BasePage.BasePage;
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

public class FindPetByiDPage extends BasePage {

        public  FindPetByiDPage(WebDriver driver){
       super(driver);
    }

    //WebElements
    //---------------------------------------
    //Find Pet By DI Section
    @FindBy(xpath = "//div[text()=\"Find pet by ID\"]")
    WebElement findPetByID_WE;
    // Expand/collapse Arrow in Find pet by id
    @FindBy(xpath = "//*[@id=\"operations-pet-getPetById\"]/div[1]/button[3]")
    WebElement arrowinFindPetById_WE;
    //Try it out Add New Pet WebElement
    @FindBy(xpath = "//div[@class=\"try-out\"]/button")//div[@class="try-out btn-group"]/button[1]
    WebElement tryItOutBtnFindPetById_WE;

    // id TextBox Find Pet By id
    @FindBy(xpath = "//tr[@data-param-name=\"petId\"]/td[2]/input")
    WebElement idTextBoxFindPetById_WE;

    //Click on execute Find Pet By id
    @FindBy(xpath = "//*[@id=\"operations-pet-getPetById\"]/div[2]/div/div[3]/button")
    WebElement executeBtnFindPetById_WE;
    //Assert Server Response Code - Find Pet By id
    @FindBy(xpath = "//*[@id=\"operations-pet-getPetById\"]/div[2]/div/div[4]/div[2]/div/div/table/tbody/tr/td[1]")
    WebElement codeRespFindPetAssert_WE;

    //Locators
    //----------------------------------
    //Find Pet By DI Section
    By findPetById_loc = By.xpath("*//div[text()=\"Find pet by ID\"]");
    //Arrow Find Pet By id
    By arrowinFindPetById_Loc=By.xpath("//*[@id=\"operations-pet-getPetById\"]/div[1]/button[3]");
    //Try it out Add New Pet Loc
    By tryItOutBtnFinPetById_Loc=By.xpath("//div[@class=\"try-out\"]/button");
    // id text box Add New Pet
    By idTextBoxFindPetById_loc=By.xpath("//tr[@data-param-name=\"petId\"]/td[2]/input");

    //Click on execute to Create new Pet
    By executeBtnFindPetById_loc=By.xpath("//*[@id=\"operations-pet-getPetById\"]/div[2]/div/div[3]/button");
    //Assert Server Response Code - Find Pet By id
    By codeRespFindPetAssert_loc=By.xpath("//*[@id=\"operations-pet-getPetById\"]/div[2]/div/div[4]/div[2]/div/div/table/tbody/tr/td[1]");



    // ----------------- END LOCATORS ----------------

    // Variable - Text - Numbers
    protected int timeToWait=5;
    String findPetById_txt="Find pet by ID";
    protected String findPetById_Text="11";
    //Name To Create New Pet
    String nameToCreateNewPet_Text = "Milo";
    String respCodeFindPet_txt="200";

    //--------- END VARIABLES -----------

    //Methods for Add New Pet - End Point
    public void timeToWait (int timeToWait,By Pet_Loc){
        new WebDriverWait(driver, Duration.ofSeconds(timeToWait)).
                until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Pet_Loc));
    }
    //Assert for Find pet by id
    public void assertFindPetSection(){
        //Wait to load AddNewPetSection
        timeToWait(10,findPetById_loc);
        //Validate Section is loaded
        Assert.assertEquals(findPetByID_WE.getText(),findPetById_txt);
    }
    // Click on Arrow - Find pet by id
    public void clickOnArrowdFindPetById (){
        //wait to Arrow Add New Pet is displayed
        timeToWait(10,arrowinFindPetById_Loc);
        //Click on Arrow
        arrowinFindPetById_WE.sendKeys(Keys.ENTER);
    }
    //Click on Try it out
    public void tryItOutFindPetById(){
        //wait to Try it out Btn is displayed
        timeToWait(10,tryItOutBtnFinPetById_Loc);
        //Click on Try it out Btn
        tryItOutBtnFindPetById_WE.sendKeys(Keys.ENTER);
    }
    // id Text Box
    public void sendIdToCreateNewPet (){
        //wait for id text box
        timeToWait(10,idTextBoxFindPetById_loc);
        //send new id to add new pet - id
        idTextBoxFindPetById_WE.clear();
        //idTextBoxFindPetById_WE.sendKeys(Keys.ENTER);
        idTextBoxFindPetById_WE.sendKeys(findPetById_Text);
    }
    // Execute Button - Find Pet By id
    public void clickOnExecute (){
        //wait for Execute btn
        timeToWait(10,executeBtnFindPetById_loc);
        //click on Execute
        executeBtnFindPetById_WE.sendKeys(Keys.ENTER);
    }
    //Assert Response Code - Find Pet By id
    public void assertResponseCode() {
        //Wait to load AddNewPetSection
        timeToWait(10,codeRespFindPetAssert_loc);
        //Validate Section is loaded
        Assert.assertEquals(codeRespFindPetAssert_WE.getText(),respCodeFindPet_txt);
    }
}
