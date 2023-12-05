package nas.selab.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 针对以下代码进行decision进行decision coverage测试
 * if (Side1 + Side2 <= Side3 || Side2 + Side3 <= Side1
 *         || Side1 + Side3 <= Side2)
 *     triOut = 4;
 * output:(Side1 + Side2 <= Side3 || Side2 + Side3 <= Side1 || Side1 + Side3 <= Side2) ? 1:0
 */
public class TritypeDecisionTest {
    @Test
    public void triang() {
        Tritype tritype = new Tritype();
        /*
         * output:1
         */
        assertEquals(4, tritype.Triang(1, 2, 3));
        /*
         * output:0
         */
        assertEquals(4, tritype.Triang(4, 5, 3));
    }
}