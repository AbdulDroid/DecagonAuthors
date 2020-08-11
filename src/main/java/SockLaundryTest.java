import org.junit.jupiter.api.*;

class SockLaundryTest {

    @Test
    public void test() {
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void test1() throws Exception {
        int numberMachineCanWash = 0;
        int[] cleanPile = new int[] { 1, 2, 1, 1 };
        int[] dirtyPile = new int[] { 1, 4, 3, 2, 4 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(1, pairs);
    }

    @Test
    public void test2() {
        int numberMachineCanWash = 2;
        int[] cleanPile = new int[] { 1, 2, 1, 1 };
        int[] dirtyPile = new int[] { 1, 4, 3, 2, 4 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(3, pairs);
    }

    @Test
    public void test4() {
        int numberMachineCanWash = 3;
        int [] cleanPile = new int[] { 1, 2, 1, 1 };
        int [] dirtyPile = new int[] { 1, 4, 3, 2, 4 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(3, pairs);
    }

    @Test
    public void test5() {
        int numberMachineCanWash = 2;
        int[] cleanPile = new int[] { 1, 2, 3, 1, 2, 3 };
        int[] dirtyPile = new int[] { 3, 3, 4, 1, 2, 7, 9 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(4, pairs);
    }

    @Test
    public void test6() {
        int numberMachineCanWash = 4;
        int[] cleanPile = new int[] { 1, 1, 1, 1, 1, 1 };
        int[] dirtyPile = new int[] { 1, 2, 2, 1, 3, 4, 5, 2 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(5, pairs);
    }

    @Test
    public void test7() {
        int numberMachineCanWash = 0;
        int[] cleanPile = new int[] { 1 };
        int[] dirtyPile = new int[] { 1, 2, 3, 4, 5, 5 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(0, pairs);
    }

    @Test
    public void test8() {
        int numberMachineCanWash = 20;
        int[] cleanPile = new int[] { 50, 50, 50, 37, 38, 37, 49, 39, 38, 45, 43 };
        int[] dirtyPile = new int[] { 50 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(4, pairs);
    }

    @Test
    public void test9() {
        int numberMachineCanWash = 20;
        int[] cleanPile = new int[] { 1 };
        int[] dirtyPile = new int[] { 50, 50, 50, 37, 38, 37, 49, 39, 38, 45, 43 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(3, pairs);
    }

    @Test
    public void test10() {
        int numberMachineCanWash = 50;
        int[] cleanPile = new int[] { 40, 40, 40, 40, 40, 40, 40, 50, 50, 50, 50, 50 };
        int[] dirtyPile = new int[] { 40, 40, 45, 45, 30, 35, 50, 50, 25, 25, 20, 20 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(10, pairs);
    }

    @Test
    public void test11() {
        int numberMachineCanWash = 1;
        int[] cleanPile = new int[] { 8 };
        int[] dirtyPile = new int[] { 8 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(1, pairs);

    }

    @Test
    public void test12() {
        int numberMachineCanWash = 20;
        int[] cleanPile = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] dirtyPile = new int[] { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(0, pairs);

    }

    @Test
    public void test13() {
        int numberMachineCanWash = 20;
        int[] cleanPile = new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int[] dirtyPile = new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(10, pairs);

    }

    @Test
    public void test14() {
        int numberMachineCanWash = 20;
        int[] cleanPile = new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int[] dirtyPile = new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(10, pairs);

    }

    @Test
    public void test15() {
        int numberMachineCanWash = 0;
        int[] cleanPile = new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int[] dirtyPile = new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(5, pairs);

    }

    @Test
    public void test16() {
        int numberMachineCanWash = 30;
        int[] cleanPile = new int[] { 1, 2, 3, 4, 6, 7, 8, 9, 10, 11 };
        int[] dirtyPile = new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(6, pairs);

    }

    @Test
    public void test17() {
        int numberMachineCanWash = 4;
        int[] cleanPile = new int[] { 1, 2, 3, 4, 6, 7, 8, 9, 10, 11 };
        int[] dirtyPile = new int[] { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(2, pairs);

    }

    @Test
    public void test18() {
        int numberMachineCanWash = 5;
        int[] cleanPile = new int[] { 1, 2, 3, 2, 3, 4, 5 };
        int[] dirtyPile = new int[] { 2, 1, 1, 1, 3, 3, 3, 4, 4, 4, 5, 5, 6, 5, 7, 5, 6 };
        int pairs = new SockLaundry().getMaximumPairOfSocks(numberMachineCanWash, cleanPile, dirtyPile);

        Assertions.assertEquals(6, pairs);

    }
}