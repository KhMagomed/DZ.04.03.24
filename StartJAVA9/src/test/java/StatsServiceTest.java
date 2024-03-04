import org.junit.Assert;
import org.junit.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void getMonthMinSalesTest() {
        StatsService service = new StatsService();

        int[] salesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(salesArr);


        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getSumsalesTest() {
        StatsService service = new StatsService();

        int[] salesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.getSumSales(salesArr);


        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getAvrgSumSalesTest() {
        StatsService service = new StatsService();

        int[] salesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.getAvrgSumSales(salesArr);


        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getMonthMaxSalesTest() {
        StatsService service = new StatsService();

        int[] salesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(salesArr);


        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getCountdownAvgSalesTest() {
        StatsService service = new StatsService();

        int[] salesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getCountdownAvgSales(salesArr);


        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getCountUpAvgSalesTest() {
        StatsService service = new StatsService();

        int[] salesArr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.getCountUpAvgSales(salesArr);


        Assert.assertEquals(expected,actual);
    }

}
