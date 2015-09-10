package Algorithms;

public class P204_CountPrimes {
	//Sieve of Eratosthenes方法，题目的hint里面有
	public int countPrimes(int n) {
        int count = 0;
        boolean[] isPrimeBool = new boolean[n];
        //首先把所有数都标记为素数，比2小的全都不是素数
        for(int i = 2; i < n; i++){
            isPrimeBool[i] = true;
        }
        
        //标记所有的非素数
        for(int i = 2; i * i < n; i++){
            if(!isPrime(i)) {
                continue;
            }
            else{
            	//如果i为素数，那么i*i, i*i+i, i*i+2i...全部为非素数，一圈下来就标记完了所有的非素数
                for(int j = i * i; j < n; j += i){
                    isPrimeBool[j] = false;
                }
            }
        }
        
        for(int i = 2; i < n; i++){
            if(isPrimeBool[i]) count++;
        }
        
        return count;
   }

    
	//如果在2～根号下n之间没有除的尽的数，那这个数就是素数
    private boolean isPrime(int num) {
       if (num <= 1) return false;
       for (int i = 2; i * i <= num; i++) {
          if (num % i == 0) return false;
       }
       return true;
    }
}
