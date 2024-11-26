import aqaAdmin.LoginPage;
import core.BaseSeleniumTest;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import readProperties.ConfigProvider;

public class TestClass extends BaseSeleniumTest {

    @Test
    public void addInterviews() {
        LoginPage loginPage = new LoginPage();
        loginPage.auth(ConfigProvider.USER_LOGIN,ConfigProvider.USER_PASSWORD)
                .openInterviewsPage().createInterviews("New interviews");
    }

    @Test
    public void addQuestions(){
        LoginPage loginPage = new LoginPage();
        loginPage.auth(ConfigProvider.USER_LOGIN,ConfigProvider.USER_PASSWORD)
                .openQuestionsPage().addQuestion("New question");

    }

    @Test
    public void addQuizes() {
        LoginPage loginPage = new LoginPage();
        loginPage.auth(ConfigProvider.USER_LOGIN,ConfigProvider.USER_PASSWORD)
                .openQuizesPage().addQuizes("Кто в доме хозяин?","кот","пес");
    }

    @Test
    public void addModule(){
        LoginPage loginPage = new LoginPage();
        loginPage.auth(ConfigProvider.USER_LOGIN,ConfigProvider.USER_PASSWORD)
                .openModulePage().addModule("новый модуль", "1037");
    }

    @Test
    public void addCourse(){
        LoginPage loginPage = new LoginPage();
        loginPage.auth(ConfigProvider.USER_LOGIN,ConfigProvider.USER_PASSWORD)
                .openCoursePage().addCourse("new Course", "1041");
    }

//    @Test


//    @ParameterizedTest
//    @CsvFileSource(resources = "Pairwise.csv")
    public void addUsersTest(
//            String usersName,
//                            String userFamili
//                            ,String userMail
//                            ,String userLogin
//                            ,String userPass
//                            ,String userRole
//                            ,String isCV
//                            ,String userOpenSea
//                            ,String userStatus
                            ){
        String usersName="";
        String userFamili="";
        String userMail="";
        String userLogin="";
        String userPass="";
        String userRole="";
        String isCV="";
        String userOpenSea="";
        String userStatus="";

        LoginPage loginPage = new LoginPage();
        loginPage.auth(ConfigProvider.USER_LOGIN,ConfigProvider.USER_PASSWORD)
                .openUsersPage().addUsers(
                        usersName
                        ,userFamili
                , userMail
                , userLogin
                , userPass
                , userRole
                , isCV
                , userOpenSea
                ,userStatus);
    }

    @Test
    public void addVoice(){
        LoginPage loginPage = new LoginPage();
        loginPage.auth(ConfigProvider.USER_LOGIN,ConfigProvider.USER_PASSWORD)
                .openVoiceCoursePage();
    }
}
