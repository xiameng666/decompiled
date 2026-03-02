import java.io.IOException;

final class eqgc implements gmbg {
    private final String a;
    private final eqgb b;

    public eqgc(String s, eqgb eqgb0) {
        this.a = s;
        this.b = eqgb0;
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        eqgd.a.g(this.a + " failed", throwable0, new Object[0]);
        if((throwable0 instanceof IOException)) {
            this.b.a(-8);
            return;
        }
        this.b.a(-1);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
    }
}

