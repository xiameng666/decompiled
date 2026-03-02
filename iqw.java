final class iqw extends ibur implements ibth {
    final lpg a;
    final lpp b;

    public iqw(lpg lpg0, lpp lpp0) {
        this.a = lpg0;
        this.b = lpp0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        this.a.d(this.b);
        return ibom.a;
    }
}

