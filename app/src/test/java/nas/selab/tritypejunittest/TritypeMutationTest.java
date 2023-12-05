package nas.selab.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutationTest {

    @Test
    public void triang() {
        Tritype tri = new Tritype();
        //kill掉TritypeMutantOne.java
        TritypMutantOne triOne = new TritypMutantOne();
        assertEquals(4, tri.Triang(1, 1, 2));
        assertEquals(2, triOne.Triang(1, 1, 2));
        //kill掉TritypeMutantTwo.java
        TritypMutantTwo triTwo = new TritypMutantTwo();
        assertEquals(4, tri.Triang(1, 1, 2));
        assertEquals(2, triTwo.Triang(1, 1, 2));
    }
}