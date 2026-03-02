public final class hmlh {
    public final String a;
    private final String b;
    private final int c;

    public hmlh(String s, String s1, int v) {
        this.b = s;
        this.a = s1;
        this.c = v;
    }

    @Override
    public final String toString() {
        return "ExtraErrorInfo{executingFunctionOrOperator=\'" + this.b + "\', expressionIdx=" + this.c + "}";
    }
}

