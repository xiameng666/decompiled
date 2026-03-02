import j..util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class arnb {
    public static final aqql a;
    public final eqvc b;
    private final gful_cronetEngineProvider c;
    private final gful_cronetEngineProvider d;

    static {
        arnb.a = new aqql(new String[]{"PostSmartSetupAuthenticator"});
    }

    public arnb(eqvc eqvc0) {
        this.c = gfus.a(((gful_cronetEngineProvider)new armt()));
        this.d = gfus.a(((gful_cronetEngineProvider)new armu()));
        this.b = eqvc0;
    }

    public final Object a(gful_cronetEngineProvider gful0) {
        int v = 0;
        while(((long)v) <= ((long)(((Long)this.d.mr())))) {
            gmcu gmcu0 = new gmcu();
            evql evql0 = ((evql)gful0.mr()).a(new armw(gmcu0));
            Objects.requireNonNull(gmcu0);
            evql0.A(new armx(gmcu0));
            Objects.requireNonNull(gmcu0);
            evql0.b(new army(gmcu0));
            try {
                return gmcu0.v(((Long)this.c.mr()).longValue(), TimeUnit.MILLISECONDS);
            }
            catch(InterruptedException | ExecutionException | TimeoutException exception0) {
                arnb.a.n("Post-SmartSetup call failed: retry=%d", exception0, new Object[]{v});
                ++v;
            }
        }
        throw new arna("Post-SmartSetup call failed.");
    }
}

