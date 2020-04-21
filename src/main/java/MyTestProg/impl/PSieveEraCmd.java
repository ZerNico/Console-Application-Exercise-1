package MyTestProg.impl;

import MyTestProg.Console;
import MyTestProg.ICommand;

public class PSieveEraCmd implements ICommand {

    private void sieveOfEratosthenes(int n) {

        // boolean array [0..n]
        // prime numbers will be true
        boolean[] prime = new boolean[n+1];
        for(int i = 0; i < n; i++) {
            prime[i] = true;
        }
        for(int i = 2; i * i <= n; i++)
        {
            if(prime[i])
            {
                for(int j = i*2; j <= n; j += i)
                    prime[j] = false;
            }
        }
        for(int i = 2; i <= n; i++)
        {
            if(prime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    @Override
    public void execute() {
        Console console = new Console();
        int n = console.readIntegerFromStdin("Enter number for n");

        System.out.println("Prime numbers till n: ");
        this.sieveOfEratosthenes(n);
    }

    @Override
    public String toString() {
        return "Sieve of Eratosthanes";
    }
}
