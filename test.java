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

        for (int i=0; i<N;i++){
            sorted[i] = i + 1;
            unsorted[i] = i + 1;
        }
          shuffleArray(unsorted);
        runTime = 0;
        for(repetition = 0; repetition < repetitions; repetition++) {
            int key =(int)(Math.random() *N) + 1;
            start = System.currentTimeMillis();
            // call the procedures to time here:
            linearsearch(unsorted, key);
            binarysearch(sorted,key);

            finish = System.currentTimeMillis();

            time = (double)(finish - start);
            runTime += time;
            runTime2 += (time*time);
        }
        
