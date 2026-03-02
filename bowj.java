import android.content.Intent;
import com.google.android.gms.findmydevice.spot.locationreporting.AccountChangesListenerIntentOperation;

public final class bowj implements glzn {
    public final AccountChangesListenerIntentOperation a;
    public final boolean b;
    public final Intent c;
    public final ggfp d;
    public final ggfp e;

    public bowj(AccountChangesListenerIntentOperation accountChangesListenerIntentOperation0, boolean z, Intent intent0, ggfp ggfp0, ggfp ggfp1) {
        this.a = accountChangesListenerIntentOperation0;
        this.b = z;
        this.c = intent0;
        this.d = ggfp0;
        this.e = ggfp1;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        return this.b ? gmbu.i(bowm.b) : gdta.g(gdtd.f(ggch.j(((ggfp)object0)).l(new bowc(this.a))).h(new bowf(), gmap.a)).i(new bowg(this.a, this.c, this.d, this.e), this.a.d);
    }
}

