package nas.selab.tritypejunittest;


import junit.framework.TestCase;

import org.junit.Test;

public class TritypeTest extends TestCase {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        //测试三个side都小于1
        assertEquals(4, tri.Triang(-1, -1, -1));
        //测试三个side两两相等
        assertEquals(3, tri.Triang(1, 1, 1));
        //测试三个side两两不相等
        assertEquals(4, tri.Triang(1, 2, 3));
        assertEquals(1, tri.Triang(4, 5, 3));
        //测试triout>3
        assertEquals(3, tri.Triang(1, 1, 1));
        //测试triout=1且side1+side2>side3
        assertEquals(2, tri.Triang(2, 2, 3));
        //测试triout=2且side1+side3>side2
        assertEquals(2, tri.Triang(2, 3, 2));
        //测试triout=3且side1+side2>side3
        assertEquals(2, tri.Triang(3, 2, 2));
        //测试triout的else
        assertEquals(4, tri.Triang(1, 1, 5));
    }
}