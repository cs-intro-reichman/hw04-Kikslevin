public class Primes {
    public static void main(String[] args) {
    int highnumber = Integer.parseInt(args[0]);

    boolean[] isprime = new boolean [highnumber + 1];

    for (int i = 2; i <= highnumber; i++) {
        isprime[i] = true;                          //make every number from 2 is a prime number
        }
    
        for (int p = 2; p <= Math.sqrt(highnumber); p++) {
            if (isprime[p]) {
                for (int product = p * p; product <= highnumber; product += p){
                    isprime[product] = false;
                }
            }
        }
System.out.println("Prime numbers up to " + highnumber + ":");

int count = 0;
for (int i = 0; i <= highnumber; i++){
            if (isprime[i]) {
               System.out.println(i);
               count++ ;
            }
        }
int percent = 100 * count / highnumber;

System.out.println("There are " + count + " primes between 2 and " + highnumber + " (" + percent + "% are primes)");
    }
}
