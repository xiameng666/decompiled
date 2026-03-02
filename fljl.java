import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.nio.charset.StandardCharsets;

public final class fljl implements gfsi {
    public final fljw a;
    public final long b;

    public fljl(fljw fljw0, long v) {
        this.a = fljw0;
        this.b = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        int v = ((gged_interceptors)object0).size();
        for(int v1 = 0; v1 < v; ++v1) {
            AccountContext accountContext0 = (AccountContext)((gged_interceptors)object0).get(v1);
            gfsx gfsx0 = accountContext0.c().b();
            if(gfsx0.i()) {
                String s = flbd.a(((String)gfsx0.d()));
                if(ghgc.a.c(s, StandardCharsets.UTF_8).a() == ((int)this.b)) {
                    this.a.o.j(accountContext0);
                    return gfsx.m(accountContext0);
                }
            }
        }
        return gfqx.a;
    }
}

