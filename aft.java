public final class aft {
    public afv a;
    public afv b;
    public afv c;
    private final String d;

    public aft(afu afu0) {
        this.a = new afv(0, 0);
        this.b = new afv(-1, -1);
        this.c = new afv(0, 0);
        kay.i(afu0);
        this.d = afu0.a;
        this.a = afu0.d.a;
        this.b = new afv(afu0.b, afu0.c);
        this.c = afu0.d.b;
    }

    public aft(String s) {
        this.a = new afv(0, 0);
        this.b = new afv(-1, -1);
        this.c = new afv(0, 0);
        kay.i(s);
        this.d = s;
    }

    public final afu a() {
        afw afw0 = new afw(this.a, this.c);
        return new afu(this.d, this.b.a, this.b.b, afw0);
    }
}

