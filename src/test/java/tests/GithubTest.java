package tests;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class GithubTest extends TestBase {

    @Test
    public void testGithub() {
        open(baseUrl);
        $x("//p[contains(text(),'The world’s')]").shouldBe(visible, Duration.ofSeconds(10));
    }
}
