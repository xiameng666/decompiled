import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;
import java.util.EnumSet;

public final class cqgg implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;

    public cqgg(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        cqgc cqgc0;
        cmcb cmcb0 = new cmcb();
        Provider provider0 = this.a;
        cmcb0.c(((Context)provider0.get()));
        cmcf cmcf0 = new cmcf(cqgx.a);
        for(Object object0: EnumSet.complementOf(EnumSet.of(cqgx.a, cqgx.d))) {
            String s = new cqgz(((cqgx)object0), cqgy.a).a();
            String s1 = new cqgz(((cqgx)object0), cqgy.b).a();
            switch(((cqgx)object0).ordinal()) {
                case 1: {
                    cqgc0 = new cqgc();
                    break;
                }
                case 2: {
                    cqgc0 = new cqgd();
                    break;
                }
                case 0: 
                case 3: {
                    throw new IllegalArgumentException();
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
            cmcf0.b(((cqgx)object0), cmbp.a("com.google.android.gms.mdisync.service.MdiSyncBackgroundTaskService", s, s1, ((gful_cronetEngineProvider)cqgc0)));
        }
        cmcb0.f(cmcf0.a());
        cmcb0.a = new cqgb(provider0);
        cmcb0.b = new bblp(1, 10);
        cmcb0.b(((fgvt)this.b.get()));
        cmcb0.d("mdisync");
        cmcb0.e(((frii)this.c.get()));
        cmcb0.c = new cqge();
        return cmcb0.a(cpzy.l);
    }
}

