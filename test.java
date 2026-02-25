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
         // Load data from file
        loadData("ulysses.numbered");
        
        // Create sorted copy for binary search
        sortedRecords = records.clone();
        Arrays.sort(sortedRecords, (a, b) -> Integer.compare(a.key, b.key));
        
        // Generate 30 random keys for testing
        int[] testKeys = generateRandomKeys(30, 1, 32654);
        
        System.out.println("Starting timing experiments with " + repetitions + " repetitions...");
        System.out.println("Each repetition performs 30 key lookups");
        System.out.println("------------------------------------------------");
        
        for(repetition = 0; repetition < repetitions; repetition++) {
            // Time linear search
            start = System.currentTimeMillis();
            for(int key : testKeys) {
                linearSearch(key);
            }
            finish = System.currentTimeMillis();
            time = (double)(finish - start);
            linearRunTime += time;
            linearRunTime2 += (time * time);
            
            // Time binary search
            start = System.currentTimeMillis();
            for(int key : testKeys) {
                binarySearch(key);
            }
            finish = System.currentTimeMillis();
            time = (double)(finish - start);
            binaryRunTime += time;
            binaryRunTime2 += (time * time);
            
            // Shuffle keys for next repetition to avoid caching effects
            shuffleArray(testKeys);
        }

       
        
