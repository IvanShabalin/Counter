public class CounterInspection {
    public static void main(String[] args) {
    Counter counter1 = new Counter(-20,20);
        System.out.println("max value = " + counter1.getMaxValue());
        System.out.println("min value = " + counter1.getMinValue());
        Counter counter2 = new Counter(-10, 10 , 0);
        System.out.println(counter2.plusvalue());
    }
}
