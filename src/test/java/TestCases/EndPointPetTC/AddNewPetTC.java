package TestCases.EndPointPetTC;

import PageObjects.EndPointPetPage.AddNewPetPage;
import TestBase.BaseTest;
import org.testng.annotations.Test;

public class AddNewPetTC extends BaseTest {

    AddNewPetPage addNewPetPage_ins;

    @Test
    public void createPet()  {
     addNewPetPage_ins= new AddNewPetPage(driver);
     addNewPetPage_ins.assertAddNewPetSection();
     addNewPetPage_ins.clickOnArrowdAddNewPet();
     addNewPetPage_ins.tryItOutAddNewPet();
     addNewPetPage_ins.requestBodyList();
     addNewPetPage_ins.sendIdndNameToCreateNewPet();
     addNewPetPage_ins.clickOnExecute();
     addNewPetPage_ins.assertResponseCode();
    }
}
