import j..util.Objects;
import java.util.Locale;

final class eqci implements eqsk {
    final eqcj a;

    public eqci(eqcj eqcj0) {
        Objects.requireNonNull(eqcj0);
        this.a = eqcj0;
        super();
    }

    @Override  // eqsk
    public final void a() {
        String s = String.format(Locale.US, "A message was not received or sent for %d millis", ((long)this.a.b.e));
        eqck.h.f(s, new Object[0]);
        this.a.c.v(10580, s, null);
    }
}

