import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class UltimateChristmasMovieConflict{
    @Test
    void ultimateChristmasMovieConflict(){
        open("https://www.imdb.com/");
        $("#suggestion-search").click();
        $("#suggestion-search").setValue("Home Alone").pressEnter();
    }
}
