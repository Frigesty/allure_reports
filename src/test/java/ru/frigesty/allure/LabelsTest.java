package ru.frigesty.allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTest {


    @Test
    @Owner("Frigesty")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Задачи в репозитории")
    @Story("Просмотр созданных задач в репозитории")
    @DisplayName("Мой тест")
    @Link(value = "Тестинг", url = "https://github.com")

    public void testAnnotated() {
    }

    @Test
    public void testCode() {
        Allure.label("owner", "Frigesty");
        Allure.label("severity", SeverityLevel.CRITICAL.value());
        Allure.feature("Задачи в репозитории");
        Allure.story("Просмотр созданных задач в репозитории");
        Allure.link("Тестинг", "https://github.com");
    }




}
