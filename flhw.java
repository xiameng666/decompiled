import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class flhw implements Callable {
    public final flit a;
    public final gmcd b;
    public final gmcd c;
    public final AccountContext d;
    public final fmga e;
    public final int f;

    public flhw(flit flit0, gmcd gmcd0, gmcd gmcd1, AccountContext accountContext0, fmga fmga0, int v) {
        this.a = flit0;
        this.b = gmcd0;
        this.c = gmcd1;
        this.d = accountContext0;
        this.e = fmga0;
        this.f = v;
    }

    @Override
    public final Object call() {
        ExecutionException executionException1;
        fmga fmga1;
        fmfm fmfm0 = new fmfm(((fmga)((glyq)this.b).u()));
        flit flit0 = this.a;
        AccountContext accountContext0 = this.d;
        fmga fmga0 = this.e;
        int v = this.f;
        try {
            fmfm0.m(((Long)((gftm)((flkw)gmbu.r(this.c)).a).a).longValue());
            fmfm0.k(fmft.h);
            fmga1 = fmfm0.a();
            flsl flsl0 = flit0.e;
            fmai fmai0 = fmaj.a();
            fmai0.g(10);
            fmai0.n(accountContext0.c().f());
            fmai0.o(accountContext0.d().toStringUtf8());
            String s = fmga0.a;
            fmai0.p(s);
            fmai0.d(fmga0.c);
            fmai0.l(v);
            flsl0.b(fmai0.a());
            fmfr fmfr0 = fmga0.f;
            if(fmfr0.a() == 3) {
                Map map0 = flit0.n;
                if(map0.containsKey(fmfr0.b().a)) {
                    ((flws)map0.get(fmfr0.b().a)).e(accountContext0, fmga0, flsl0);
                }
            }
            fmam.a().d("MessageSentLatency", s);
            fmak.a().b(fmal.a, fmga0);
            executionException1 = null;
        }
        catch(ExecutionException executionException0) {
            flbj.d("LiMsgController", "Failed to send message", executionException0);
            fmai fmai1 = fmaj.a();
            fmai1.g(11);
            fmai1.n(accountContext0.c().f());
            fmai1.o(accountContext0.d().toStringUtf8());
            fmai1.p(fmga0.a);
            fmai1.d(fmga0.c);
            fmai1.l(v);
            if(executionException0.getCause() != null && (executionException0.getCause() instanceof flvv)) {
                fmai1.f(10);
            }
            fmaj fmaj0 = fmai1.a();
            flit0.e.b(fmaj0);
            TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
            flba.a();
            fmfm0.m(timeUnit0.toMicros(System.currentTimeMillis()));
            fmfm0.k(fmft.g);
            fmga1 = fmfm0.a();
            executionException1 = executionException0;
        }
        flit0.d(accountContext0).ad(fmga1, fmga1.d);
        flit0.d(accountContext0).ab(Arrays.asList(new fmga[]{fmga1}), fmft.f, fmga1.g);
        flit0.A(accountContext0, fmga1.c, 2L);
        if(executionException1 == null) {
            return null;
        }
        throw executionException1;
    }
}

