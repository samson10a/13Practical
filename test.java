//Mosa Nkuna
//4446478
public class test {
    public static int N = 32654;
    static int[] sorted = new int[N];
    static int[] unsorted= new int[N];
    public static void main(String[] args){
        DecimalFormat twoD = new DecimalFormat("0.00");
        DecimalFormat fourD = new DecimalFormat("0.0000");
        DecimalFormat fiveD = new DecimalFormat("0.00000");

        long start, finish;
        double runTime = 0, runTime2 = 0, time;
        double totalTime = 0.0;
        int n = N;
        int repetition, repetitions = 30;
