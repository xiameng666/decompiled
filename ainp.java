import java.util.Set;
import java.util.concurrent.ExecutionException;

public final class ainp implements glzn {
    public final ainy a;
    public final Set b;

    public ainp(ainy ainy0, Set set0) {
        this.a = ainy0;
        this.b = set0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Set set0 = this.b;
        if(((int)(((Integer)object0))) > 0) {
            ainy ainy0 = this.a;
            if(hpsk.d()) {
                try {
                    ((glyq)ainy0.c.h(set0, ainy0.f)).u();
                    return ainy0.b();
                }
                catch(ExecutionException | InterruptedException exception0) {
                    a.ae(ainy.a.i(), "data store operation failed.", exception0);
                    return ainy0.b();
                }
            }
            return ainy0.b();
        }
        return gmbu.i(Boolean.valueOf(false));
    }
}

