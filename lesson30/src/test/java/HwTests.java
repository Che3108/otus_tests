import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.otus.cherepanovvs.HomeWork30;

public class HwTests {
    private HomeWork30 hw30;

    @BeforeEach
    public void init() {
        hw30 = new HomeWork30();
    }

    @Test
    public void testArrayFilter() {
        Assertions.assertArrayEquals(new int[] {2, 2}, hw30.arrayFilter(new int[] {1, 2, 1, 2, 2}));
        Assertions.assertThrows(RuntimeException.class, () -> hw30.arrayFilter(new int[] {2, 2, 2, 2}));
    }

    @Test
    public void testArrayValueControl() {
        Assertions.assertTrue(hw30.arrayValueControl(new int[] {1, 2}));
        Assertions.assertFalse(hw30.arrayValueControl(new int[] {1, 1}));
        Assertions.assertFalse(hw30.arrayValueControl(new int[] {1, 3}));
        Assertions.assertTrue(hw30.arrayValueControl(new int[] {1, 2, 2, 1}));
    }
}
