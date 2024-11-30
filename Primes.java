public class Primes {
    public static void main(String[] args) {
        final int  n = Integer.parseInt(args[0]);
        double counterPrimes = 0;
         boolean [] isPrime = new boolean[n+1];
         isPrime = checkPrime(isPrime);
         System.out.println("Prime numbers up to "+n+":");
         
         for (int i=0; i<n+1 ; i++){
             if (isPrime[i]==true){
                 System.out.println(i);
                 counterPrimes++;
            }
        }
        double percentOfPrime = (counterPrimes/n)*100;
        System.out.println("There are "+(int)counterPrimes+" primes between 2 and " + n+ " ("+ (int)percentOfPrime+"% are primes)");
    }
    public static boolean[] checkPrime(boolean[] isPrime) {
        for (int i = 0;i < isPrime.length;i++) isPrime[i] = true;
         
        isPrime[0] = false;
        isPrime[1] = false;
        int p = 2;
         
        while(p<Math.sqrt(isPrime.length-1)){
           if(isPrime[p]== true){
               for(int i =2 ; i<isPrime.length ; i++){
               if(i!=p){
                       if (i%p == 0){
                       isPrime[i] = false;
                           }
                       }
                   
               }
           } 
           p++;
        }
          return isPrime;
    }
}