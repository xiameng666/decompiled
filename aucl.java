import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.util.Collection;

public final class aucl implements auhm {
    public final aucp a;

    public aucl(aucp aucp0) {
        this.a = aucp0;
    }

    @Override  // auhm
    public final void a(Collection collection0, Collection collection1) {
        aucp aucp0 = this.a;
        String s = null;
        CastDevice castDevice0 = aucp0.n == null ? null : aucp0.i.a(aucp0.n);
        if(castDevice0 != null) {
            aucp0.h.p("The endpoint of %s is online. Connecting to %s", aucp0.e, castDevice0);
            aucp0.A();
            aucp0.n = null;
            aucp0.m = castDevice0;
            aucp0.M();
        }
        CastDevice castDevice1 = aucp0.m;
        if(castDevice1 != null) {
            s = castDevice1.d;
        }
        if(s != null) {
            auxc auxc0 = aucp0.g;
            String s1 = auxc0.f;
            if(s1 != null) {
                aujj aujj0 = aucp0.i.b(s1);
                if(aujj0 != null) {
                    CastDevice castDevice2 = aujj0.d();
                    if(castDevice2 != null && !TextUtils.equals(s, castDevice2.d)) {
                        aucp0.h.q("current endpoint device with session ID (%s) change from (%s) to (%s)", s1, aucp0.m, castDevice2);
                        auxc0.c();
                        aucp0.m = castDevice2;
                    }
                }
            }
        }
    }
}

