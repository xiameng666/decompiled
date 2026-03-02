import android.content.Context;
import com.google.android.gms.actionlearner.LearnedActionProviderClientOptions;
import com.google.android.gms.chimera.modules.cast.AppContextProvider;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class auez extends auek {
    public static final bboh b;
    public final String c;
    public final AtomicBoolean d;
    public final aayg e;

    static {
        auez.b = bboh.b("device_suggestions", bbcu.gU);
    }

    public auez(String s) {
        ibuq.f(s, "clientPkg");
        super();
        this.c = s;
        this.d = new AtomicBoolean(false);
        Context context0 = AppContextProvider.a();
        ibuq.c(context0);
        aueo aueo0 = new aueo(this, context0);
        ibuq.f(context0, "context");
        aaxg aaxg0 = new aaxg();
        aueo0.a(aaxg0);
        aaxh aaxh0 = aaxg0.a;
        if(aaxh0.b.isEmpty() && aaxh0.c.isEmpty()) {
            throw new IllegalArgumentException("Must specify at least one type of context!");
        }
        if(aaxh0.b.size() + aaxh0.c.size() > 4) {
            throw new IllegalArgumentException("More than 4 context types defined!");
        }
        LearnedActionProviderClientOptions learnedActionProviderClientOptions0 = new LearnedActionProviderClientOptions(aaxh0.a, aaxh0.b, aaxh0.c, aaxh0.d);
        ibuq.f(context0, "context");
        this.e = new aayg(new azts(context0, aaya.a, learnedActionProviderClientOptions0, aztr_settings.a));
    }

    @Override  // auek
    public final void a(Executor executor0) {
        ibuq.f(executor0, "executor");
        gmbu.t(icpu.e(iccl.b(cclw.f), new auep(this, null)), new aueq(this.c, "clearClientData"), executor0);
    }

    @Override  // auek
    public final void b(Executor executor0, ibth ibth0, ibth ibth1) {
        ibuq.f(executor0, "executor");
        gmbu.t(icpu.e(iccl.b(cclw.f), new aueu(this, null)), new auer(ibth1, ibth0), executor0);
    }
}

