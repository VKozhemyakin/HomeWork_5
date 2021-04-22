import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;


public class MethodStepTest {

    public packageBaseSteps.BaseSteps steps = new packageBaseSteps.BaseSteps();
    private static final String BASE_URL = "http://github.com";
    private static final String REPOSITORY = "VKozhemyakin/HomeWork_5";
    private static final String ISSUE_NUMBER = "#1";

    @Test
    @Owner("Kozhemyakin")
    @Severity(SeverityLevel.NORMAL)
    @Tags({@Tag("web"), @Tag("normal")})
    @Link(name = "Base URL", value = BASE_URL)

    @Feature("Issues")
    @Story("Поиск Issue")
    @DisplayName("Поиск Issue по номеру в репозитории")
    public void testIssueSearch (){
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepositoryFromSearch(REPOSITORY);
        steps.openRepositoryIssues();
        steps.shouldSeeIssueWithNumber(ISSUE_NUMBER);

    }


}
