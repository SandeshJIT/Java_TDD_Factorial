public class Factorial {

    public int findFactorial(int number) {
        int result = 1;
        for(int iterator=number;iterator>=1;iterator--){
            result = result * iterator;
        }
        return result;
    }
}
