package ru.frigesty.allure;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ParametersTest {

    @Test
    @DisplayName("Мой тест")
    public void testAnnotated() {
        Allure.parameter("Регион", "Республика Башкортостан");
        Allure.parameter("Город", "Уфа");
    }

}