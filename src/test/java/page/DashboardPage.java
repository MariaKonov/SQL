package page;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    private SelenideElement headind = $("[data-test-id=dashboard]");

    public DashboardPage() {
        headind.shouldBe(visible);
    }
}
