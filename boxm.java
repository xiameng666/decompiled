import android.accounts.Account;
import com.google.android.gms.findmydevice.spot.locationreporting.FixClockDriftIntentOperation;

public final class boxm implements glzn {
    public final FixClockDriftIntentOperation a;
    public final gsyz b;
    public final Account c;
    public final gtbr d;
    public final fqun e;
    public final fqex f;
    public final long g;

    public boxm(FixClockDriftIntentOperation fixClockDriftIntentOperation0, gsyz gsyz0, Account account0, gtbr gtbr0, fqun fqun0, fqex fqex0, long v) {
        this.a = fixClockDriftIntentOperation0;
        this.b = gsyz0;
        this.c = account0;
        this.d = gtbr0;
        this.e = fqun0;
        this.f = fqex0;
        this.g = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        this.a.b.b(this.b, this.c, this.d);
        fquv fquv0 = new fquv(null);
        fquv0.c(this.b);
        fquv0.f(this.e.b);
        fqew fqew0 = new fqew(this.f);
        fqew0.b(this.g);
        fquv0.b(fqew0.a());
        fquw fquw0 = fquv0.a();
        return this.a.c.b(this.c, fquw0);
    }
}

