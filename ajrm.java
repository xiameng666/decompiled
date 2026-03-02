import java.util.concurrent.TimeUnit;

public final class ajrm implements ajrb {
    public final long a;
    public final grdu b;

    public ajrm(long v, grdu grdu0) {
        this.a = v;
        this.b = grdu0;
    }

    @Override  // ajrb
    public final Object a(Object object0) {
        return ((grfl)((grfl)((grfl)object0).o(this.a, TimeUnit.MILLISECONDS)).q(cmlp.a, cjzm.b)).e(this.b);
    }
}

