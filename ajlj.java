import android.os.UserHandle;
import j..util.Objects;

final class ajlj implements gmbg {
    final ajll a;

    public ajlj(ajll ajll0) {
        Objects.requireNonNull(ajll0);
        this.a = ajll0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
    }

    @Override  // gmbg
    public final void b(Object object0) {
        int v3;
        int v;
        ajll ajll0 = this.a;
        for(Object object1: ajll0.h) {
            boolean z = ((ajlx)object0).b;
            boolean z1 = ((ajlx)object0).c;
            for(Object object2: ajll0.f.getUserProfiles()) {
                if(!((UserHandle)object2).isSystem()) {
                    continue;
                }
                ajll0.e.b();
                v = 0;
                boolean z2 = ajll0.e.f(0);
                ajll0.e.c();
                if(z2) {
                    ajll0.g.c(0);
                    ajme ajme0 = ajll0.c;
                    synchronized(ajme0.d) {
                        int v1 = ajme0.g;
                        if(v1 == 0) {
                            v1 = ajme0.b.inKeyguardRestrictedInputMode() ? 2 : 1;
                        }
                    }
                    if(v1 != 2 && !z1) {
                        v = 1;
                    }
                }
                else {
                    ((ggtj)ajll.a.j()).x("Current user is primary user or their managed profile, but it is in background; unlock is not allowed.");
                    ajll0.g.c(1);
                    v = 4;
                }
                goto label_36;
            }
            ((ggtj)ajll.a.j()).x("Current user is neither primary user nor their managed profile; unlock  is not allowed.");
            ajll0.g.c(2);
            v = 3;
        label_36:
            int v2 = ajll0.b.isKeyguardSecure() ? 10 : 11;
            if(!((ajlx)object0).a) {
                v3 = 22;
            }
            else if(z) {
                v3 = 20;
            }
            else {
                v3 = 21;
            }
            ((ajlk)object1).a(new ajlp(v, v2, v3));
        }
    }
}

