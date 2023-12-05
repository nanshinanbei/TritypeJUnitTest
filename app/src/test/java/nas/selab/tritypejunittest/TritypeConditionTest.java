package nas.selab.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 针对以下代码进行decision进行decision coverage测试
 * if (Side1 + Side2 <= Side3 || Side2 + Side3 <= Side1
 *         || Side1 + Side3 <= Side2)
 *     triOut = 4;
 * a:Side1 + Side2 <= Side3 ? 1:0
 * b:Side2 + Side3 <= Side1 ? 1:0
 * c:Side1 + Side3 <= Side2 ? 1:0
 */
public class TritypeConditionTest {

    @Test
    public void triang() {
        Tritype tritype = new Tritype();
        /*
            * a:1,b:0,c:0
         */
        assertEquals(4, tritype.Triang(1, 2, 3));
        /*
            * a:0,b:1,c:0
         */
        assertEquals(4, tritype.Triang(3, 1, 2));
        /*
            * a:0,b:0,c:1
         */
        assertEquals(4, tritype.Triang(1, 3, 2));
    }
}