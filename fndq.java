public final class fndq {
    private final ibnf a;

    public fndq(ibnf ibnf0) {
        this.a = ibnf0;
    }

    public final fndp a(int v) {
        return new fndp(((fndu)this.a.get()), v);
    }
}

