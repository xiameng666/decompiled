import com.google.android.libraries.messaging.lighter.model.AccountContext;
import j..time.Instant;
import java.security.KeyPair;
import java.util.UUID;

public final class flwk implements glzm {
    public final flwm a;
    public final gmcd b;
    public final AccountContext c;
    public final fmbl d;
    public final flqw e;
    public final fiei f;

    public flwk(flwm flwm0, gmcd gmcd0, AccountContext accountContext0, fiei fiei0, fmbl fmbl0, flqw flqw0) {
        this.a = flwm0;
        this.b = gmcd0;
        this.c = accountContext0;
        this.f = fiei0;
        this.d = fmbl0;
        this.e = flqw0;
    }

    @Override  // glzm
    public final gmcd a() {
        gmcd gmcd0 = this.b;
        flkt flkt0 = (flkt)gmbu.r(gmcd0);
        if(flkt0.d != 4) {
            return gmcd0;
        }
        UUID uUID0 = UUID.randomUUID();
        KeyPair keyPair0 = this.d.b();
        Instant instant0 = glxs.b(((Long)flkt0.c.d()).longValue());
        flzd flzd0 = new flzd(this.c, this.a.c, this.f, "com.google.android.gms", keyPair0, instant0);
        gmcd gmcd1 = this.a.b.d.f();
        gmcd gmcd2 = this.a.b.g(uUID0, flzd0, gmcd1, this.c, this.d, this.e);
        return gmbu.d(new gmcd[]{gmcd2}).b(new flwj(gmcd2), gmap.a);
    }
}

