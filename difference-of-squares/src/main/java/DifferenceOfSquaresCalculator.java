public class DifferenceOfSquaresCalculator {


    public int computeSquareOfSumTo(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return (int) Math.pow(sum, 2);
    }

    public int computeSumOfSquaresTo(int number) {
        throw new UnsupportedOperationException("Not yet implemented."); // FIXME: via TDD
    }

    public int computeDifferenceOfSquares(int number) {
        throw new UnsupportedOperationException("Not yet implemented."); // FIXME: via TDD
    }
}
