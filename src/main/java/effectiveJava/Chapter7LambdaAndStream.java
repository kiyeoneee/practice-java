package effectiveJava;

public class Chapter7LambdaAndStream {
    public enum Item42_Operation {
        PLUS("+") {
            public double apply(double x, double y) { return x + y; }
        },
        MINUS("-") {
            public double apply(double x, double y) { return x - y; }
        };

        private final String symbol;
        Item42_Operation(String symbol) { this.symbol = symbol; }
    }

    public enum Item42_OperationFuntional {
        PLUS("+", (x, y) -> x + y),
        MINUS("-", (x, y) -> x - y);

        private final String symbol;
        private final DoubleBinaryOperator op;

        Item42_OperationFuntional(String symbol, DoubleBinaryOperator op) {
            this.symbol = symbol;
            this.op = op;
        }
    }

    @FunctionalInterface
    private interface DoubleBinaryOperator {
        abstract double apply(double x, double y);
    }
}
