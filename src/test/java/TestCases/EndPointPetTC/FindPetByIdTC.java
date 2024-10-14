package TestCases.EndPointPetTC;

import PageObjects.EndPointPetPage.FindPetByiDPage;
import TestBase.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FindPetByIdTC extends BaseTest {
    FindPetByiDPage findPetByiDPage;
    @Test
    public void FindExistingPet (){
        findPetByiDPage =new FindPetByiDPage(driver);
        findPetByiDPage.assertFindPetSection();
        findPetByiDPage.clickOnArrowdFindPetById();
        findPetByiDPage.tryItOutFindPetById();
        findPetByiDPage.sendIdToCreateNewPet();
        findPetByiDPage.clickOnExecute();
    }
}
