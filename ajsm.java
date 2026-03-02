import java.util.concurrent.TimeUnit;

public final class ajsm implements ajrb {
    public final long a;
    public final grfo b;

    public ajsm(long v, grfo grfo0) {
        this.a = v;
        this.b = grfo0;
    }

    @Override  // ajrb
    public final Object a(Object object0) {
        return ((grfl)((grfl)((grfl)object0).o(this.a, TimeUnit.MILLISECONDS)).q(cmlp.a, cjzv.b)).h(this.b);
    }
}

