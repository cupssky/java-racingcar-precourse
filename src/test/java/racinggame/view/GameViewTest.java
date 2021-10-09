package racinggame.view;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.command.CommandType;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameViewTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream standardOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @DisplayName("자동차이름입력 가이드출력 확인테스트")
    @Test
    void printCommendCarNameGuideTest() {
        GameView.printCommendGuide(CommandType.CARNAME);
        assertEquals(CommandType.CARNAME.getGuide(), expectPrintContent());
    }

    @DisplayName("시도횟수입력 가이드출력 확인테스트")
    @Test
    void printCommendMoveCountGuideTest() {
        GameView.printCommendGuide(CommandType.MOVECOUNT);
        assertEquals(CommandType.MOVECOUNT.getGuide(), expectPrintContent());
    }

    private String expectPrintContent() {
        return outputStreamCaptor.toString().trim();
    }
}
