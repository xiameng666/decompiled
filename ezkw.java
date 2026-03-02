import android.content.IntentFilter;

public final class ezkw implements evqf {
    public final ezkz a;

    public ezkw(ezkz ezkz0) {
        this.a = ezkz0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Void void0 = (Void)object0;
        ezkz ezkz0 = this.a;
        if(ezkz0.k) {
            ezkz0.f = true;
            IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.auth.trustagent.trustlet.ACTION_ACTIVITY_DETECTED");
            int v = hzcm.a.b().c() ? 4 : 2;
            jwe.c(ezkz0.c, ezkz0.e, intentFilter0, "com.google.android.gms.permission.INTERNAL_BROADCAST", null, v);
            ezkz0.d.i(ezkz0.f);
        }
    }
}

