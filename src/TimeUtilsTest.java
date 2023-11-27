import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class TimeUtilsTest {
    private final TimeUtils timeUtils = new TimeUtils();
    @ParameterizedTest
    @CsvSource({"0,0:00:00", "32000,8:53:20", "10000,2:46:40", "-1,-1"})
    void secToTime(int input, String expected) {
        assertEquals(expected, timeUtils.secToTime(input));
    }

}