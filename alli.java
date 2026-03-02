import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.proximity.phonehub.UpdateLocalFeatureStateIntentOperation;

public final class alli implements allp {
    public final allq a;

    public alli(allq allq0) {
        this.a = allq0;
    }

    @Override  // allp
    public final void a(String s, boolean z) {
        if(hpzm.P() && bbqa.c()) {
            allq allq0 = this.a;
            alkl alkl0 = allq0.ak;
            Context context0 = alkl0.d;
            Intent intent0 = UpdateLocalFeatureStateIntentOperation.b(context0, s, z);
            if(intent0 != null) {
                context0.startService(intent0);
                alkl0.f.P(z);
            }
            if(z) {
                gmbu.t((alrn.a() ? gmbu.m(new allc(allq0), new bblp(1, 9)) : gmbu.m(new alld(allq0), new bblp(1, 9))), new allo(allq0, s), new bblp(1, 9));
            }
        }
    }
}

