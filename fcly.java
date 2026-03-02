import android.content.Context;
import j..util.Objects;

public final class fcly implements fcls {
    public static final baun a;
    public final fcfe b;
    private final fcfg c;

    static {
        fcly.a = new fcgf(new String[]{"VerifyingMessageClient"});
    }

    public fcly(fcfe fcfe0, fcfg fcfg0) {
        this.b = fcfe0;
        this.c = fcfg0;
    }

    @Override  // fcls
    public final evql a(String s, String s1, byte[] arr_b) {
        evql evql0 = this.b.i(s, s1, arr_b);
        evqp evqp0 = new evqp();
        evql evql1 = this.c.f();
        evql1.b(new fclt(s, evqp0));
        Objects.requireNonNull(evqp0);
        evql1.A(new fclu(evqp0));
        evqp evqp1 = new evqp();
        Objects.requireNonNull(evqp1);
        fclv fclv0 = new fclv(evqp1);
        evqp0.a.A(fclv0);
        Objects.requireNonNull(evqp1);
        evql0.b(new fclw(evqp1));
        Objects.requireNonNull(evqp1);
        evql0.A(new fclv(evqp1));
        return evqp1.a;
    }

    public static fcly b(Context context0) {
        return new fcly(fcfo.d(context0), fcfo.e(context0));
    }
}

